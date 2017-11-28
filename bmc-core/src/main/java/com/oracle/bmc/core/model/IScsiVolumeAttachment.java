/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * An ISCSI volume attachment.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IScsiVolumeAttachment.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "attachmentType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class IScsiVolumeAttachment extends VolumeAttachment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
        private String volumeId;

        public Builder volumeId(String volumeId) {
            this.volumeId = volumeId;
            this.__explicitlySet__.add("volumeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("chapSecret")
        private String chapSecret;

        public Builder chapSecret(String chapSecret) {
            this.chapSecret = chapSecret;
            this.__explicitlySet__.add("chapSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("chapUsername")
        private String chapUsername;

        public Builder chapUsername(String chapUsername) {
            this.chapUsername = chapUsername;
            this.__explicitlySet__.add("chapUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv4")
        private String ipv4;

        public Builder ipv4(String ipv4) {
            this.ipv4 = ipv4;
            this.__explicitlySet__.add("ipv4");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("iqn")
        private String iqn;

        public Builder iqn(String iqn) {
            this.iqn = iqn;
            this.__explicitlySet__.add("iqn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IScsiVolumeAttachment build() {
            IScsiVolumeAttachment __instance__ =
                    new IScsiVolumeAttachment(
                            availabilityDomain,
                            compartmentId,
                            displayName,
                            id,
                            instanceId,
                            lifecycleState,
                            timeCreated,
                            volumeId,
                            chapSecret,
                            chapUsername,
                            ipv4,
                            iqn,
                            port);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IScsiVolumeAttachment o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .id(o.getId())
                            .instanceId(o.getInstanceId())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .volumeId(o.getVolumeId())
                            .chapSecret(o.getChapSecret())
                            .chapUsername(o.getChapUsername())
                            .ipv4(o.getIpv4())
                            .iqn(o.getIqn())
                            .port(o.getPort());

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

    public IScsiVolumeAttachment(
            String availabilityDomain,
            String compartmentId,
            String displayName,
            String id,
            String instanceId,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            String volumeId,
            String chapSecret,
            String chapUsername,
            String ipv4,
            String iqn,
            Integer port) {
        super(
                availabilityDomain,
                compartmentId,
                displayName,
                id,
                instanceId,
                lifecycleState,
                timeCreated,
                volumeId);
        this.chapSecret = chapSecret;
        this.chapUsername = chapUsername;
        this.ipv4 = ipv4;
        this.iqn = iqn;
        this.port = port;
    }

    /**
     * The Challenge-Handshake-Authentication-Protocol (CHAP) secret valid for the associated CHAP user name.
     * (Also called the \"CHAP password\".)
     * <p>
     * Example: `d6866c0d-298b-48ba-95af-309b4faux45e`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chapSecret")
    String chapSecret;

    /**
     * The volume's system-generated Challenge-Handshake-Authentication-Protocol (CHAP) user name.
     * <p>
     * Example: `ocid1.volume.oc1.phx.abyhqljrgvttnlx73nmrwfaux7kcvzfs3s66izvxf2h4lgvyndsdsnoiwr5q`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chapUsername")
    String chapUsername;

    /**
     * The volume's iSCSI IP address.
     * <p>
     * Example: `169.254.0.2`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4")
    String ipv4;

    /**
     * The target volume's iSCSI Qualified Name in the format defined by RFC 3720.
     * <p>
     * Example: `iqn.2015-12.us.oracle.com:456b0391-17b8-4122-bbf1-f85fc0bb97d9`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("iqn")
    String iqn;

    /**
     * The volume's iSCSI port.
     * <p>
     * Example: `3260`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
