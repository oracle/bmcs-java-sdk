/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSaml2IdentityProviderDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "protocol"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateSaml2IdentityProviderDetails extends CreateIdentityProviderDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productType")
        private ProductType productType;

        public Builder productType(ProductType productType) {
            this.productType = productType;
            this.__explicitlySet__.add("productType");
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

        @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
        private String metadataUrl;

        public Builder metadataUrl(String metadataUrl) {
            this.metadataUrl = metadataUrl;
            this.__explicitlySet__.add("metadataUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private String metadata;

        public Builder metadata(String metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformAttributes")
        private java.util.Map<String, String> freeformAttributes;

        public Builder freeformAttributes(java.util.Map<String, String> freeformAttributes) {
            this.freeformAttributes = freeformAttributes;
            this.__explicitlySet__.add("freeformAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSaml2IdentityProviderDetails build() {
            CreateSaml2IdentityProviderDetails __instance__ =
                    new CreateSaml2IdentityProviderDetails(
                            compartmentId,
                            name,
                            description,
                            productType,
                            freeformTags,
                            definedTags,
                            metadataUrl,
                            metadata,
                            freeformAttributes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSaml2IdentityProviderDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .productType(o.getProductType())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .metadataUrl(o.getMetadataUrl())
                            .metadata(o.getMetadata())
                            .freeformAttributes(o.getFreeformAttributes());

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
    public CreateSaml2IdentityProviderDetails(
            String compartmentId,
            String name,
            String description,
            ProductType productType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String metadataUrl,
            String metadata,
            java.util.Map<String, String> freeformAttributes) {
        super(compartmentId, name, description, productType, freeformTags, definedTags);
        this.metadataUrl = metadataUrl;
        this.metadata = metadata;
        this.freeformAttributes = freeformAttributes;
    }

    /**
     * The URL for retrieving the identity provider's metadata,
     * which contains information required for federating.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
    String metadataUrl;

    /**
     * The XML that contains the information required for federating.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    String metadata;

    /**
     * Extra name value pairs associated with this identity provider.
     * Example: `{\"clientId\": \"app_sf3kdjf3\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformAttributes")
    java.util.Map<String, String> freeformAttributes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
