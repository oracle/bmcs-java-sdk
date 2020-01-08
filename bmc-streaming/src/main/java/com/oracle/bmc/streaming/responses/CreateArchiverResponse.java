/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.responses;

import com.oracle.bmc.streaming.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateArchiverResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle
     * about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned Archiver instance.
     */
    private Archiver archiver;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateArchiverResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            archiver(o.getArchiver());

            return this;
        }
    }
}
