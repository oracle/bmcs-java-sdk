/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * The required data to create a WAAS policy.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateWaasPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateWaasPolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDomains")
        private java.util.List<String> additionalDomains;

        public Builder additionalDomains(java.util.List<String> additionalDomains) {
            this.additionalDomains = additionalDomains;
            this.__explicitlySet__.add("additionalDomains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("origins")
        private java.util.Map<String, Origin> origins;

        public Builder origins(java.util.Map<String, Origin> origins) {
            this.origins = origins;
            this.__explicitlySet__.add("origins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originGroups")
        private java.util.Map<String, OriginGroup> originGroups;

        public Builder originGroups(java.util.Map<String, OriginGroup> originGroups) {
            this.originGroups = originGroups;
            this.__explicitlySet__.add("originGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyConfig")
        private PolicyConfig policyConfig;

        public Builder policyConfig(PolicyConfig policyConfig) {
            this.policyConfig = policyConfig;
            this.__explicitlySet__.add("policyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wafConfig")
        private WafConfigDetails wafConfig;

        public Builder wafConfig(WafConfigDetails wafConfig) {
            this.wafConfig = wafConfig;
            this.__explicitlySet__.add("wafConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateWaasPolicyDetails build() {
            CreateWaasPolicyDetails __instance__ =
                    new CreateWaasPolicyDetails(
                            compartmentId,
                            displayName,
                            domain,
                            additionalDomains,
                            origins,
                            originGroups,
                            policyConfig,
                            wafConfig,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateWaasPolicyDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .domain(o.getDomain())
                            .additionalDomains(o.getAdditionalDomains())
                            .origins(o.getOrigins())
                            .originGroups(o.getOriginGroups())
                            .policyConfig(o.getPolicyConfig())
                            .wafConfig(o.getWafConfig())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to create the WAAS policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A user-friendly name for the WAAS policy. The name can be changed and does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The web application domain that the WAAS policy protects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    String domain;

    /**
     * An array of additional domains for the specified web application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDomains")
    java.util.List<String> additionalDomains;

    /**
     * A map of host to origin for the web application. The key should be a customer friendly name for the host, ex. primary, secondary, etc.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("origins")
    java.util.Map<String, Origin> origins;

    /**
     * The map of origin groups and their keys used to associate origins to the `wafConfig`. Origin groups allow you to apply weights to groups of origins for load balancing purposes. Origins with higher weights will receive larger proportions of client requests.
     * To add additional origins to your WAAS policy, update the `origins` field of a `UpdateWaasPolicy` request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originGroups")
    java.util.Map<String, OriginGroup> originGroups;

    @com.fasterxml.jackson.annotation.JsonProperty("policyConfig")
    PolicyConfig policyConfig;

    @com.fasterxml.jackson.annotation.JsonProperty("wafConfig")
    WafConfigDetails wafConfig;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
