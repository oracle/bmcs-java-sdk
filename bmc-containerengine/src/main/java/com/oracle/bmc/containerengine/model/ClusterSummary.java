/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a cluster summary.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClusterSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ClusterSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
        private String kubernetesVersion;

        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            this.__explicitlySet__.add("kubernetesVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private ClusterCreateOptions options;

        public Builder options(ClusterCreateOptions options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ClusterMetadata metadata;

        public Builder metadata(ClusterMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ClusterLifecycleState lifecycleState;

        public Builder lifecycleState(ClusterLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
        private ClusterEndpoints endpoints;

        public Builder endpoints(ClusterEndpoints endpoints) {
            this.endpoints = endpoints;
            this.__explicitlySet__.add("endpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableKubernetesUpgrades")
        private java.util.List<String> availableKubernetesUpgrades;

        public Builder availableKubernetesUpgrades(
                java.util.List<String> availableKubernetesUpgrades) {
            this.availableKubernetesUpgrades = availableKubernetesUpgrades;
            this.__explicitlySet__.add("availableKubernetesUpgrades");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterSummary build() {
            ClusterSummary __instance__ =
                    new ClusterSummary(
                            id,
                            name,
                            compartmentId,
                            vcnId,
                            kubernetesVersion,
                            options,
                            metadata,
                            lifecycleState,
                            lifecycleDetails,
                            endpoints,
                            availableKubernetesUpgrades);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .vcnId(o.getVcnId())
                            .kubernetesVersion(o.getKubernetesVersion())
                            .options(o.getOptions())
                            .metadata(o.getMetadata())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .endpoints(o.getEndpoints())
                            .availableKubernetesUpgrades(o.getAvailableKubernetesUpgrades());

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
     * The OCID of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The name of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The OCID of the compartment in which the cluster exists.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the virtual cloud network (VCN) in which the cluster exists
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    String vcnId;

    /**
     * The version of Kubernetes running on the cluster masters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
    String kubernetesVersion;

    /**
     * Optional attributes for the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    ClusterCreateOptions options;

    /**
     * Metadata about the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    ClusterMetadata metadata;

    /**
     * The state of the cluster masters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    ClusterLifecycleState lifecycleState;

    /**
     * Details about the state of the cluster masters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * Endpoints served up by the cluster masters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
    ClusterEndpoints endpoints;

    /**
     * Available Kubernetes versions to which the clusters masters may be upgraded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableKubernetesUpgrades")
    java.util.List<String> availableKubernetesUpgrades;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
