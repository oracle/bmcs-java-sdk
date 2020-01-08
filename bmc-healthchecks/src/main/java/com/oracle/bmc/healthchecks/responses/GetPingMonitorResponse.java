/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks.responses;

import com.oracle.bmc.healthchecks.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetPingMonitorResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * An entity tag that uniquely identifies a version of the resource.
     */
    private String etag;

    /**
     * The returned PingMonitor instance, or null if {@link #isNotModified()} is true.
     */
    private PingMonitor pingMonitor;

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetPingMonitorResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            pingMonitor(o.getPingMonitor());
            isNotModified(o.isNotModified());
            return this;
        }
    }
}
