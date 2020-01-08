/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.containerengine.responses;

import com.oracle.bmc.containerengine.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetNodePoolOptionsResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned NodePoolOptions instance.
     */
    private NodePoolOptions nodePoolOptions;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetNodePoolOptionsResponse o) {
            opcRequestId(o.getOpcRequestId());
            nodePoolOptions(o.getNodePoolOptions());

            return this;
        }
    }
}
