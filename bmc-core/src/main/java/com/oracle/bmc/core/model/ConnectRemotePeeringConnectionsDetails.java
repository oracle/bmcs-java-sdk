/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Information about the other remote peering connection (RPC).
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
    builder = ConnectRemotePeeringConnectionsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ConnectRemotePeeringConnectionsDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("peerId")
        private String peerId;

        public Builder peerId(String peerId) {
            this.peerId = peerId;
            this.__explicitlySet__.add("peerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerRegionName")
        private String peerRegionName;

        public Builder peerRegionName(String peerRegionName) {
            this.peerRegionName = peerRegionName;
            this.__explicitlySet__.add("peerRegionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectRemotePeeringConnectionsDetails build() {
            ConnectRemotePeeringConnectionsDetails __instance__ =
                    new ConnectRemotePeeringConnectionsDetails(peerId, peerRegionName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectRemotePeeringConnectionsDetails o) {
            Builder copiedBuilder = peerId(o.getPeerId()).peerRegionName(o.getPeerRegionName());

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
     * The OCID of the RPC you want to peer with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerId")
    String peerId;

    /**
     * The name of the region that contains the RPC you want to peer with.
     * <p>
     * Example: `us-ashburn-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerRegionName")
    String peerRegionName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
