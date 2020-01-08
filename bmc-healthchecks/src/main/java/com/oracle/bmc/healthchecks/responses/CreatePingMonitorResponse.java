/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks.responses;

import com.oracle.bmc.healthchecks.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreatePingMonitorResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The URL of the newly created monitor.
     */
    private String location;

    /**
     * An entity tag that uniquely identifies a version of the resource.
     */
    private String etag;

    /**
     * The returned PingMonitor instance.
     */
    private PingMonitor pingMonitor;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreatePingMonitorResponse o) {
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            etag(o.getEtag());
            pingMonitor(o.getPingMonitor());

            return this;
        }
    }
}
