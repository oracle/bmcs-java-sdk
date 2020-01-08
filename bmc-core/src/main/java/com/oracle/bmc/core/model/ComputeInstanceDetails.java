/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Compute Instance Configuration instance details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputeInstanceDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "instanceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ComputeInstanceDetails extends InstanceConfigurationInstanceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumes")
        private java.util.List<InstanceConfigurationBlockVolumeDetails> blockVolumes;

        public Builder blockVolumes(
                java.util.List<InstanceConfigurationBlockVolumeDetails> blockVolumes) {
            this.blockVolumes = blockVolumes;
            this.__explicitlySet__.add("blockVolumes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("launchDetails")
        private InstanceConfigurationLaunchInstanceDetails launchDetails;

        public Builder launchDetails(InstanceConfigurationLaunchInstanceDetails launchDetails) {
            this.launchDetails = launchDetails;
            this.__explicitlySet__.add("launchDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secondaryVnics")
        private java.util.List<InstanceConfigurationAttachVnicDetails> secondaryVnics;

        public Builder secondaryVnics(
                java.util.List<InstanceConfigurationAttachVnicDetails> secondaryVnics) {
            this.secondaryVnics = secondaryVnics;
            this.__explicitlySet__.add("secondaryVnics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeInstanceDetails build() {
            ComputeInstanceDetails __instance__ =
                    new ComputeInstanceDetails(blockVolumes, launchDetails, secondaryVnics);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeInstanceDetails o) {
            Builder copiedBuilder =
                    blockVolumes(o.getBlockVolumes())
                            .launchDetails(o.getLaunchDetails())
                            .secondaryVnics(o.getSecondaryVnics());

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

    @Deprecated
    public ComputeInstanceDetails(
            java.util.List<InstanceConfigurationBlockVolumeDetails> blockVolumes,
            InstanceConfigurationLaunchInstanceDetails launchDetails,
            java.util.List<InstanceConfigurationAttachVnicDetails> secondaryVnics) {
        super();
        this.blockVolumes = blockVolumes;
        this.launchDetails = launchDetails;
        this.secondaryVnics = secondaryVnics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumes")
    java.util.List<InstanceConfigurationBlockVolumeDetails> blockVolumes;

    @com.fasterxml.jackson.annotation.JsonProperty("launchDetails")
    InstanceConfigurationLaunchInstanceDetails launchDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("secondaryVnics")
    java.util.List<InstanceConfigurationAttachVnicDetails> secondaryVnics;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
