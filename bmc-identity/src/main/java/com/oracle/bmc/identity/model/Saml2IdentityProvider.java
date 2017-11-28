/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

/**
 * A special type of {@link IdentityProvider} that
 * supports the SAML 2.0 protocol. For more information, see
 * [Identity Providers and Federation](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/federation.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = Saml2IdentityProvider.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "protocol"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Saml2IdentityProvider extends IdentityProvider {
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
        private String productType;

        public Builder productType(String productType) {
            this.productType = productType;
            this.__explicitlySet__.add("productType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        public Builder inactiveStatus(Long inactiveStatus) {
            this.inactiveStatus = inactiveStatus;
            this.__explicitlySet__.add("inactiveStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
        private String metadataUrl;

        public Builder metadataUrl(String metadataUrl) {
            this.metadataUrl = metadataUrl;
            this.__explicitlySet__.add("metadataUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
        private String signingCertificate;

        public Builder signingCertificate(String signingCertificate) {
            this.signingCertificate = signingCertificate;
            this.__explicitlySet__.add("signingCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
        private String redirectUrl;

        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            this.__explicitlySet__.add("redirectUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Saml2IdentityProvider build() {
            Saml2IdentityProvider __instance__ =
                    new Saml2IdentityProvider(
                            id,
                            compartmentId,
                            name,
                            description,
                            productType,
                            timeCreated,
                            lifecycleState,
                            inactiveStatus,
                            metadataUrl,
                            signingCertificate,
                            redirectUrl);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Saml2IdentityProvider o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .productType(o.getProductType())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState())
                            .inactiveStatus(o.getInactiveStatus())
                            .metadataUrl(o.getMetadataUrl())
                            .signingCertificate(o.getSigningCertificate())
                            .redirectUrl(o.getRedirectUrl());

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

    public Saml2IdentityProvider(
            String id,
            String compartmentId,
            String name,
            String description,
            String productType,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            Long inactiveStatus,
            String metadataUrl,
            String signingCertificate,
            String redirectUrl) {
        super(
                id,
                compartmentId,
                name,
                description,
                productType,
                timeCreated,
                lifecycleState,
                inactiveStatus);
        this.metadataUrl = metadataUrl;
        this.signingCertificate = signingCertificate;
        this.redirectUrl = redirectUrl;
    }

    /**
     * The URL for retrieving the identity provider's metadata, which
     * contains information required for federating.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataUrl")
    String metadataUrl;

    /**
     * The identity provider's signing certificate used by the IAM Service
     * to validate the SAML2 token.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
    String signingCertificate;

    /**
     * The URL to redirect federated users to for authentication with the
     * identity provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
    String redirectUrl;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
