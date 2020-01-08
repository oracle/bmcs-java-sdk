/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.integration.responses;

import com.oracle.bmc.integration.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class UpdateIntegrationInstanceResponse {

    /**
     * Unique Oracle-assigned identifier for the asynchronous request.
     * You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateIntegrationInstanceResponse o) {
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());

            return this;
        }
    }
}
