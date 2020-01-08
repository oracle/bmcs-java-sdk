/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A rule for allowing inbound IP packets.
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
    builder = IngressSecurityRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class IngressSecurityRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        public IngressSecurityRule build() {
            IngressSecurityRule __instance__ =
                    new IngressSecurityRule(
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
        public Builder copy(IngressSecurityRule o) {
            Builder copiedBuilder =
                    icmpOptions(o.getIcmpOptions())
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
     * Optional and valid only for ICMP and ICMPv6. Use to specify a particular ICMP type and code
     * as defined in:
     * <p>
     * [ICMP Parameters](http://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml)
     * * [ICMPv6 Parameters](https://www.iana.org/assignments/icmpv6-parameters/icmpv6-parameters.xhtml)
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
     * example, if ingress traffic allows TCP destination port 80, there should be an egress
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
     * IP address range in CIDR notation. For example: `192.168.1.0/24` or `2001:0db8:0123:45::/56`.
     *     Note that IPv6 addressing is currently supported only in the Government Cloud.
     * <p>
     * The `cidrBlock` value for a {@link Service}, if you're
     *     setting up a security list rule for traffic coming from a particular `Service` through
     *     a service gateway. For example: `oci-phx-objectstorage`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    String source;
    /**
     * Type of source for the rule. The default is `CIDR_BLOCK`.
     * <p>
     * `CIDR_BLOCK`: If the rule's `source` is an IP address range in CIDR notation.
     * <p>
     * `SERVICE_CIDR_BLOCK`: If the rule's `source` is the `cidrBlock` value for a
     *     {@link Service} (the rule is for traffic coming from a
     *     particular `Service` through a service gateway).
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum SourceType {
        CidrBlock("CIDR_BLOCK"),
        ServiceCidrBlock("SERVICE_CIDR_BLOCK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, SourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceType v : SourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'SourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of source for the rule. The default is `CIDR_BLOCK`.
     * <p>
     * `CIDR_BLOCK`: If the rule's `source` is an IP address range in CIDR notation.
     * <p>
     * `SERVICE_CIDR_BLOCK`: If the rule's `source` is the `cidrBlock` value for a
     *     {@link Service} (the rule is for traffic coming from a
     *     particular `Service` through a service gateway).
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
