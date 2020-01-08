/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.oce.responses;

import com.oracle.bmc.oce.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190912")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListOceInstancesResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of `OceInstance`s. If this header appears in the response, then this
     * is a partial list of OceInstances. Include this value as the `page` parameter in a subsequent
     * GET request to get the next batch of OceInstances.
     *
     */
    private String opcNextPage;

    /**
     * A list of OceInstanceSummary instances.
     */
    private java.util.List<OceInstanceSummary> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListOceInstancesResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }
    }
}
