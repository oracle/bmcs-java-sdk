/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.audit.responses;

import com.oracle.bmc.audit.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListEventsResponse {

    /**
     * For pagination of a list of audit events. When this header appears in the response,
     * it means you received a partial list and there are more results. Include this value as the `page`
     * parameter for the subsequent ListEvents request to get the next batch of events. For important
     * details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A list of AuditEvent instances.
     */
    private java.util.List<AuditEvent> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListEventsResponse o) {
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }
    }
}
