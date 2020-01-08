/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A rule for allowing inbound (INGRESS) or outbound (EGRESS) IP packets.
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
    builder = AddSecurityRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AddSecurityRuleDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        public Builder destination(String destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
        private DestinationType destinationType;

        public Builder destinationType(DestinationType destinationType) {
            this.destinationType = destinationType;
            this.__explicitlySet__.add("destinationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("direction")
        private Direction direction;

        public Builder direction(Direction direction) {
            this.direction = direction;
            this.__explicitlySet__.add("direction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("icmpOptions")
        private IcmpOptions icmpOptions;

        public Builder icmpOptions(IcmpOptions icmpOptions) {
            this.icmpOptions = icmpOptions;
            this.__explicitlySet__.add("icmpOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isStateless")
        private Boolean isStateless;

        public Builder isStateless(Boolean isStateless) {
            this.isStateless = isStateless;
            this.__explicitlySet__.add("isStateless");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private SourceType sourceType;

        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tcpOptions")
        private TcpOptions tcpOptions;

        public Builder tcpOptions(TcpOptions tcpOptions) {
            this.tcpOptions = tcpOptions;
            this.__explicitlySet__.add("tcpOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("udpOptions")
        private UdpOptions udpOptions;

        public Builder udpOptions(UdpOptions udpOptions) {
            this.udpOptions = udpOptions;
            this.__explicitlySet__.add("udpOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddSecurityRuleDetails build() {
            AddSecurityRuleDetails __instance__ =
                    new AddSecurityRuleDetails(
                            description,
                            destination,
                            destinationType,
                            direction,
                            icmpOptions,
                            isStateless,
                            protocol,
                            source,
                            sourceType,
                            tcpOptions,
                            udpOptions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddSecurityRuleDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .destination(o.getDestination())
                            .destinationType(o.getDestinationType())
                            .direction(o.getDirection())
                            .icmpOptions(o.getIcmpOptions())
                            .isStateless(o.getIsStateless())
                            .protocol(o.getProtocol())
                            .source(o.getSource())
                            .sourceType(o.getSourceType())
                            .tcpOptions(o.getTcpOptions())
                            .udpOptions(o.getUdpOptions());

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
     * An optional description of your choice for the rule. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Conceptually, this is the range of IP addresses that a packet originating from the instance
     * can go to.
     * <p>
     * Allowed values:
     * <p>
     * An IP address range in CIDR notation. For example: `192.168.1.0/24` or `2001:0db8:0123:45::/56`
     *     Note that IPv6 addressing is currently supported only in the Government Cloud.
     * <p>
     * The `cidrBlock` value for a {@link Service}, if you're
     *     setting up a security rule for traffic destined for a particular `Service` through
     *     a service gateway. For example: `oci-phx-objectstorage`.
     * <p>
     * The OCID of a {@link NetworkSecurityGroup} in the same
     *     VCN. The value can be the NSG that the rule belongs to if the rule's intent is to control
     *     traffic between VNICs in the same NSG.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    String destination;
    /**
     * Type of destination for the rule. Required if `direction` = `EGRESS`.
     * <p>
     * Allowed values:
     * <p>
     * `CIDR_BLOCK`: If the rule's `destination` is an IP address range in CIDR notation.
     * <p>
     * `SERVICE_CIDR_BLOCK`: If the rule's `destination` is the `cidrBlock` value for a
     *     {@link Service} (the rule is for traffic destined for a
     *     particular `Service` through a service gateway).
     * <p>
     * `NETWORK_SECURITY_GROUP`: If the rule's `destination` is the OCID of a
     *     {@link NetworkSecurityGroup}.
     *
     **/
    public enum DestinationType {
        CidrBlock("CIDR_BLOCK"),
        ServiceCidrBlock("SERVICE_CIDR_BLOCK"),
        NetworkSecurityGroup("NETWORK_SECURITY_GROUP"),
        ;

        private final String value;
        private static java.util.Map<String, DestinationType> map;

        static {
            map = new java.util.HashMap<>();
            for (DestinationType v : DestinationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DestinationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DestinationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid DestinationType: " + key);
        }
    };
    /**
     * Type of destination for the rule. Required if `direction` = `EGRESS`.
     * <p>
     * Allowed values:
     * <p>
     * `CIDR_BLOCK`: If the rule's `destination` is an IP address range in CIDR notation.
     * <p>
     * `SERVICE_CIDR_BLOCK`: If the rule's `destination` is the `cidrBlock` value for a
     *     {@link Service} (the rule is for traffic destined for a
     *     particular `Service` through a service gateway).
     * <p>
     * `NETWORK_SECURITY_GROUP`: If the rule's `destination` is the OCID of a
     *     {@link NetworkSecurityGroup}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
    DestinationType destinationType;
    /**
     * Direction of the security rule. Set to `EGRESS` for rules to allow outbound IP packets, or `INGRESS` for rules to allow inbound IP packets.
     **/
    public enum Direction {
        Egress("EGRESS"),
        Ingress("INGRESS"),
        ;

        private final String value;
        private static java.util.Map<String, Direction> map;

        static {
            map = new java.util.HashMap<>();
            for (Direction v : Direction.values()) {
                map.put(v.getValue(), v);
            }
        }

        Direction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Direction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid Direction: " + key);
        }
    };
    /**
     * Direction of the security rule. Set to `EGRESS` for rules to allow outbound IP packets, or `INGRESS` for rules to allow inbound IP packets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    Direction direction;

    /**
     * Optional and valid only for ICMP and ICMPv6. Use to specify a particular ICMP type and code
     * as defined in:
     * - [ICMP Parameters](http://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml)
     * - [ICMPv6 Parameters](https://www.iana.org/assignments/icmpv6-parameters/icmpv6-parameters.xhtml)
     * <p>
     * If you specify ICMP or ICMPv6 as the protocol but omit this object, then all ICMP types and
     * codes are allowed. If you do provide this object, the type is required and the code is optional.
     * To enable MTU negotiation for ingress internet traffic via IPv4, make sure to allow type 3 (\"Destination
     * Unreachable\") code 4 (\"Fragmentation Needed and Don't Fragment was Set\"). If you need to specify
     * multiple codes for a single type, create a separate security list rule for each.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("icmpOptions")
    IcmpOptions icmpOptions;

    /**
     * A stateless rule allows traffic in one direction. Remember to add a corresponding
     * stateless rule in the other direction if you need to support bidirectional traffic. For
     * example, if egress traffic allows TCP destination port 80, there should be an ingress
     * rule to allow TCP source port 80. Defaults to false, which means the rule is stateful
     * and a corresponding rule is not necessary for bidirectional traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isStateless")
    Boolean isStateless;

    /**
     * The transport protocol. Specify either `all` or an IPv4 protocol number as
     * defined in
     * [Protocol Numbers](http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * Options are supported only for ICMP (\"1\"), TCP (\"6\"), UDP (\"17\"), and ICMPv6 (\"58\").
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    String protocol;

    /**
     * Conceptually, this is the range of IP addresses that a packet coming into the instance
     * can come from.
     * <p>
     * Allowed values:
     * <p>
     * An IP address range in CIDR notation. For example: `192.168.1.0/24` or `2001:0db8:0123:45::/56`
     *     Note that IPv6 addressing is currently supported only in the Government Cloud.
     * <p>
     * The `cidrBlock` value for a {@link Service}, if you're
     *     setting up a security rule for traffic coming from a particular `Service` through
     *     a service gateway. For example: `oci-phx-objectstorage`.
     * <p>
     * The OCID of a {@link NetworkSecurityGroup} in the same
     *     VCN. The value can be the NSG that the rule belongs to if the rule's intent is to control
     *     traffic between VNICs in the same NSG.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    String source;
    /**
     * Type of source for the rule. Required if `direction` = `INGRESS`.
     * <p>
     * `CIDR_BLOCK`: If the rule's `source` is an IP address range in CIDR notation.
     * <p>
     * `SERVICE_CIDR_BLOCK`: If the rule's `source` is the `cidrBlock` value for a
     *     {@link Service} (the rule is for traffic coming from a
     *     particular `Service` through a service gateway).
     * <p>
     * `NETWORK_SECURITY_GROUP`: If the rule's `source` is the OCID of a
     *     {@link NetworkSecurityGroup}.
     *
     **/
    public enum SourceType {
        CidrBlock("CIDR_BLOCK"),
        ServiceCidrBlock("SERVICE_CIDR_BLOCK"),
        NetworkSecurityGroup("NETWORK_SECURITY_GROUP"),
        ;

        private final String value;
        private static java.util.Map<String, SourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceType v : SourceType.values()) {
                map.put(v.getValue(), v);
            }
        }

        SourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid SourceType: " + key);
        }
    };
    /**
     * Type of source for the rule. Required if `direction` = `INGRESS`.
     * <p>
     * `CIDR_BLOCK`: If the rule's `source` is an IP address range in CIDR notation.
     * <p>
     * `SERVICE_CIDR_BLOCK`: If the rule's `source` is the `cidrBlock` value for a
     *     {@link Service} (the rule is for traffic coming from a
     *     particular `Service` through a service gateway).
     * <p>
     * `NETWORK_SECURITY_GROUP`: If the rule's `source` is the OCID of a
     *     {@link NetworkSecurityGroup}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    SourceType sourceType;

    /**
     * Optional and valid only for TCP. Use to specify particular destination ports for TCP rules.
     * If you specify TCP as the protocol but omit this object, then all destination ports are allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tcpOptions")
    TcpOptions tcpOptions;

    /**
     * Optional and valid only for UDP. Use to specify particular destination ports for UDP rules.
     * If you specify UDP as the protocol but omit this object, then all destination ports are allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("udpOptions")
    UdpOptions udpOptions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
