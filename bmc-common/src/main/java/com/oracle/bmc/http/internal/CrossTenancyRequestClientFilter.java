/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import com.google.common.base.Joiner;
import lombok.NonNull;

import javax.annotation.Priority;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import java.io.IOException;

import static com.oracle.bmc.http.signing.internal.Constants.CROSS_TENANCY_REQUEST_HEADER_NAME;

/**
 * Filter that injects authentication headers into the request.
 */
@Priority(CrossTenancyRequestClientFilter.PRIORITY)
public class CrossTenancyRequestClientFilter implements ClientRequestFilter {
    // run before javax.ws.rs.Priorities.AUTHENTICATION
    public static final int PRIORITY = javax.ws.rs.Priorities.AUTHENTICATION - 1;

    private final String authorizedTenancyIdsValue;

    public CrossTenancyRequestClientFilter(String[] authorizedTenancyIds) {
        if (authorizedTenancyIds == null || authorizedTenancyIds.length == 0) {
            throw new IllegalArgumentException("Must provide at least one authorized tenancyId");
        }
        for (String authorizedTenancyId : authorizedTenancyIds) {
            if (authorizedTenancyId == null || authorizedTenancyId.isEmpty()) {
                throw new IllegalArgumentException("Authorized tenancyId was not valid");
            }
        }
        this.authorizedTenancyIdsValue = Joiner.on(",").join(authorizedTenancyIds);
    }

    @Override
    public void filter(@NonNull ClientRequestContext clientRequestContext) throws IOException {
        clientRequestContext
                .getHeaders()
                .putSingle(CROSS_TENANCY_REQUEST_HEADER_NAME, authorizedTenancyIdsValue);
    }
}
