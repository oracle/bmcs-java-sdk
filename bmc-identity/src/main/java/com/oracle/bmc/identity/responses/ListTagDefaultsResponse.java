/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.responses;

import com.oracle.bmc.identity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListTagDefaultsResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of tag default values. When paging through a list, if this header appears in
     * the response, then a partial list might have been returned. Include this value as the `page` parameter
     * for the subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * A list of TagDefaultSummary instances.
     */
    private java.util.List<TagDefaultSummary> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListTagDefaultsResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }
    }
}
