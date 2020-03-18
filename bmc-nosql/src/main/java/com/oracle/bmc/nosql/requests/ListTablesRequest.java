/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.nosql.requests;

import com.oracle.bmc.nosql.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListTablesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of a table's compartment.
     */
    private String compartmentId;

    /**
     * A shell-globbing-style (*?[]) filter for names.
     */
    private String name;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start
     * retrieving results. This is usually retrieved from a previous
     * list call.
     *
     */
    private String page;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };
    /**
     * The field to sort by. Only one sort order may be
     * provided. Default order for timeCreated is descending. Default
     * order for name is ascending. If no value is specified
     * timeCreated is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be
     * provided. Default order for timeCreated is descending. Default
     * order for name is ascending. If no value is specified
     * timeCreated is default.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        Name("name"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * Filter list by the lifecycle state of the item.
     */
    private LifecycleState lifecycleState;

    /**
     * Filter list by the lifecycle state of the item.
     **/
    public enum LifecycleState {
        All("ALL"),
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListTablesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListTablesRequest o) {
            compartmentId(o.getCompartmentId());
            name(o.getName());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListTablesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListTablesRequest
         */
        public ListTablesRequest build() {
            ListTablesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
