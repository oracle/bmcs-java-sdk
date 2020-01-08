/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.retrier.Retriers;

import javax.annotation.Priority;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import java.util.UUID;

/**
 * Filter that sets the opc-retry-token header (if it is not already set) for POST requests
 */
@Priority(Priorities.HEADER_DECORATOR)
public class RetryTokenFilter implements ClientRequestFilter {
    private static final String OPC_RETRY_TOKEN_HEADER = "opc-retry-token";

    private static String generateRetryToken() {
        return UUID.randomUUID().toString();
    }

    @Override
    public void filter(ClientRequestContext requestContext) {
        if (!Retriers.shouldSendOpcRetryToken()) {
            return;
        }

        boolean isOpcRetryTokenAlreadySet =
                HeaderUtils.get(requestContext.getStringHeaders(), OPC_RETRY_TOKEN_HEADER)
                        .isPresent();

        if (isOpcRetryTokenAlreadySet) {
            return;
        }

        if (requestContext.getMethod().equalsIgnoreCase(HttpMethod.POST)) {
            requestContext.getHeaders().putSingle(OPC_RETRY_TOKEN_HEADER, generateRetryToken());
        }
    }
}
