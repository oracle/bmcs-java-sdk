/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.functions.responses;

import com.oracle.bmc.functions.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class InvokeFunctionResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned java.io.InputStream instance.
     */
    private java.io.InputStream inputStream;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(InvokeFunctionResponse o) {
            opcRequestId(o.getOpcRequestId());
            inputStream(o.getInputStream());

            return this;
        }
    }
}
