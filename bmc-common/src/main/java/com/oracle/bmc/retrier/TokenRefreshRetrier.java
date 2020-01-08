/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.retrier;

import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider;
import com.oracle.bmc.waiter.DelayStrategy;
import com.oracle.bmc.waiter.FixedTimeDelayStrategy;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import com.oracle.bmc.waiter.TerminationStrategy;
import lombok.NonNull;

import javax.ws.rs.core.Response;

/**
 * A custom retrier that refreshes tokens and retries the operation in case of authentication failures. This retrier
 * will make at max 2 attempts with no delay between the retried requests.
 */
public class TokenRefreshRetrier extends BmcGenericRetrier {
    private static TerminationStrategy TOKEN_REFRESH_TERMINATION_STRATEGY =
            new MaxAttemptsTerminationStrategy(2);
    private static DelayStrategy TOKEN_REFRESH_DELAY_STRATEGY = new FixedTimeDelayStrategy(0L);

    private static RetryConfiguration createTokenRefreshRetryConfiguration(
            @NonNull final AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        final RetryConfiguration tokenRefreshRetryConfiguration =
                RetryConfiguration.builder()
                        .terminationStrategy(TOKEN_REFRESH_TERMINATION_STRATEGY)
                        .delayStrategy(TOKEN_REFRESH_DELAY_STRATEGY)
                        .retryCondition(
                                e -> {
                                    if (e.getStatusCode()
                                                    == Response.Status.UNAUTHORIZED.getStatusCode()
                                            && authenticationDetailsProvider
                                                    instanceof
                                                    RefreshableOnNotAuthenticatedProvider) {
                                        ((RefreshableOnNotAuthenticatedProvider)
                                                        authenticationDetailsProvider)
                                                .refresh();
                                        return true;
                                    }
                                    return false;
                                })
                        .build();
        return tokenRefreshRetryConfiguration;
    }

    /**
     * Create a new instance.
     * @param authenticationDetailsProvider The authentication provider used by the client.
     */
    public TokenRefreshRetrier(
            @NonNull final AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        super(createTokenRefreshRetryConfiguration(authenticationDetailsProvider));
    }
}
