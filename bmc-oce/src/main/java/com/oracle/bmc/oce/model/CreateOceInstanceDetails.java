/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.oce.model;

/**
 * The information about new OceInstance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190912")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOceInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateOceInstanceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsAccessToken")
        private String idcsAccessToken;

        public Builder idcsAccessToken(String idcsAccessToken) {
            this.idcsAccessToken = idcsAccessToken;
            this.__explicitlySet__.add("idcsAccessToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identityStripe")
        private IdentityStripeDetails identityStripe;

        public Builder identityStripe(IdentityStripeDetails identityStripe) {
            this.identityStripe = identityStripe;
            this.__explicitlySet__.add("identityStripe");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
        private String tenancyName;

        public Builder tenancyName(String tenancyName) {
            this.tenancyName = tenancyName;
            this.__explicitlySet__.add("tenancyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
        private String objectStorageNamespace;

        public Builder objectStorageNamespace(String objectStorageNamespace) {
            this.objectStorageNamespace = objectStorageNamespace;
            this.__explicitlySet__.add("objectStorageNamespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
        private String adminEmail;

        public Builder adminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            this.__explicitlySet__.add("adminEmail");
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

        public CreateOceInstanceDetails build() {
            CreateOceInstanceDetails __instance__ =
                    new CreateOceInstanceDetails(
                            description,
                            compartmentId,
                            name,
                            tenancyId,
                            idcsAccessToken,
                            identityStripe,
                            tenancyName,
                            objectStorageNamespace,
                            adminEmail,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOceInstanceDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .tenancyId(o.getTenancyId())
                            .idcsAccessToken(o.getIdcsAccessToken())
                            .identityStripe(o.getIdentityStripe())
                            .tenancyName(o.getTenancyName())
                            .objectStorageNamespace(o.getObjectStorageNamespace())
                            .adminEmail(o.getAdminEmail())
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
     * OceInstance description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * OceInstance Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Tenancy Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    String tenancyId;

    /**
     * Identity Cloud Service access token identifying a stripe and service administrator user
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAccessToken")
    String idcsAccessToken;

    @com.fasterxml.jackson.annotation.JsonProperty("identityStripe")
    IdentityStripeDetails identityStripe;

    /**
     * Tenancy Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
    String tenancyName;

    /**
     * Object Storage Namespace of Tenancy
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
    String objectStorageNamespace;

    /**
     * Admin Email for Notification
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
    String adminEmail;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
