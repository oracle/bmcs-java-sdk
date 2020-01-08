/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define extra options for a cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ClusterCreateOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ClusterCreateOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("serviceLbSubnetIds")
        private java.util.List<String> serviceLbSubnetIds;

        public Builder serviceLbSubnetIds(java.util.List<String> serviceLbSubnetIds) {
            this.serviceLbSubnetIds = serviceLbSubnetIds;
            this.__explicitlySet__.add("serviceLbSubnetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesNetworkConfig")
        private KubernetesNetworkConfig kubernetesNetworkConfig;

        public Builder kubernetesNetworkConfig(KubernetesNetworkConfig kubernetesNetworkConfig) {
            this.kubernetesNetworkConfig = kubernetesNetworkConfig;
            this.__explicitlySet__.add("kubernetesNetworkConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addOns")
        private AddOnOptions addOns;

        public Builder addOns(AddOnOptions addOns) {
            this.addOns = addOns;
            this.__explicitlySet__.add("addOns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterCreateOptions build() {
            ClusterCreateOptions __instance__ =
                    new ClusterCreateOptions(serviceLbSubnetIds, kubernetesNetworkConfig, addOns);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterCreateOptions o) {
            Builder copiedBuilder =
                    serviceLbSubnetIds(o.getServiceLbSubnetIds())
                            .kubernetesNetworkConfig(o.getKubernetesNetworkConfig())
                            .addOns(o.getAddOns());

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
     * The OCIDs of the subnets used for Kubernetes services load balancers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceLbSubnetIds")
    java.util.List<String> serviceLbSubnetIds;

    /**
     * Network configuration for Kubernetes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesNetworkConfig")
    KubernetesNetworkConfig kubernetesNetworkConfig;

    /**
     * Configurable cluster add-ons
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addOns")
    AddOnOptions addOns;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
