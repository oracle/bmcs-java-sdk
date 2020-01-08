/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Instance agent features supported on the image
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceAgentFeatures.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class InstanceAgentFeatures {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isMonitoringSupported")
        private Boolean isMonitoringSupported;

        public Builder isMonitoringSupported(Boolean isMonitoringSupported) {
            this.isMonitoringSupported = isMonitoringSupported;
            this.__explicitlySet__.add("isMonitoringSupported");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isManagementSupported")
        private Boolean isManagementSupported;

        public Builder isManagementSupported(Boolean isManagementSupported) {
            this.isManagementSupported = isManagementSupported;
            this.__explicitlySet__.add("isManagementSupported");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentFeatures build() {
            InstanceAgentFeatures __instance__ =
                    new InstanceAgentFeatures(isMonitoringSupported, isManagementSupported);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentFeatures o) {
            Builder copiedBuilder =
                    isMonitoringSupported(o.getIsMonitoringSupported())
                            .isManagementSupported(o.getIsManagementSupported());

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
     * Whether the agent running on the instance can gather performance metrics and monitor the instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMonitoringSupported")
    Boolean isMonitoringSupported;

    /**
     * Whether the agent running on the instance can run all the available management plugins
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isManagementSupported")
    Boolean isManagementSupported;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
