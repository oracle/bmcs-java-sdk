/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.analytics.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkRequestResource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class WorkRequestResource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("actionResult")
        private WorkRequestActionResult actionResult;

        public Builder actionResult(WorkRequestActionResult actionResult) {
            this.actionResult = actionResult;
            this.__explicitlySet__.add("actionResult");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private WorkRequestResourceType resourceType;

        public Builder resourceType(WorkRequestResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceUri")
        private String resourceUri;

        public Builder resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
            this.__explicitlySet__.add("resourceUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestResource build() {
            WorkRequestResource __instance__ =
                    new WorkRequestResource(
                            actionResult, resourceType, identifier, resourceUri, metadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestResource o) {
            Builder copiedBuilder =
                    actionResult(o.getActionResult())
                            .resourceType(o.getResourceType())
                            .identifier(o.getIdentifier())
                            .resourceUri(o.getResourceUri())
                            .metadata(o.getMetadata());

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
     * The way in which this resource was affected by this work request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionResult")
    WorkRequestActionResult actionResult;

    /**
     * The type of the resource the work request is affecting.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    WorkRequestResourceType resourceType;

    /**
     * The OCID of the resource the work request is affecting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    String identifier;

    /**
     * The URI of the affected resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceUri")
    String resourceUri;

    /**
     * Additional metadata of the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
