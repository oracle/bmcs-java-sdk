/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * A work request summary
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkRequestSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class WorkRequestSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationTypes operationType;

        public Builder operationType(OperationTypes operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private OperationStatus status;

        public Builder status(OperationStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestSummary build() {
            WorkRequestSummary __instance__ =
                    new WorkRequestSummary(
                            operationType,
                            status,
                            id,
                            compartmentId,
                            description,
                            message,
                            percentComplete,
                            timeAccepted);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestSummary o) {
            Builder copiedBuilder =
                    operationType(o.getOperationType())
                            .status(o.getStatus())
                            .id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .description(o.getDescription())
                            .message(o.getMessage())
                            .percentComplete(o.getPercentComplete())
                            .timeAccepted(o.getTimeAccepted());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * the type of operation this Work Request performs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    OperationTypes operationType;

    /**
     * status of current work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    OperationStatus status;

    /**
     * The id of the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The ocid of the compartment that contains the work request. Work requests should be scoped to
     * the same compartment as the resource the work request affects. If the work request affects multiple resources,
     * and those resources are not in the same compartment, it is up to the service team to pick the primary
     * resource whose compartment should be used
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Description of the type of work.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * A progress or error message, if there is any.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    String message;

    /**
     * Percentage of the request completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    Float percentComplete;

    /**
     * The date and time the request was created, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    java.util.Date timeAccepted;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
