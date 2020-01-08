/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * The request body used to create an on-demand HTTP probe.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOnDemandHttpProbeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateOnDemandHttpProbeDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("targets")
        private java.util.List<String> targets;

        public Builder targets(java.util.List<String> targets) {
            this.targets = targets;
            this.__explicitlySet__.add("targets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vantagePointNames")
        private java.util.List<String> vantagePointNames;

        public Builder vantagePointNames(java.util.List<String> vantagePointNames) {
            this.vantagePointNames = vantagePointNames;
            this.__explicitlySet__.add("vantagePointNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private HttpProbeProtocol protocol;

        public Builder protocol(HttpProbeProtocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("method")
        private HttpProbeMethod method;

        public Builder method(HttpProbeMethod method) {
            this.method = method;
            this.__explicitlySet__.add("method");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.Map<String, String> headers;

        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOnDemandHttpProbeDetails build() {
            CreateOnDemandHttpProbeDetails __instance__ =
                    new CreateOnDemandHttpProbeDetails(
                            compartmentId,
                            targets,
                            vantagePointNames,
                            port,
                            timeoutInSeconds,
                            protocol,
                            method,
                            path,
                            headers);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOnDemandHttpProbeDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .targets(o.getTargets())
                            .vantagePointNames(o.getVantagePointNames())
                            .port(o.getPort())
                            .timeoutInSeconds(o.getTimeoutInSeconds())
                            .protocol(o.getProtocol())
                            .method(o.getMethod())
                            .path(o.getPath())
                            .headers(o.getHeaders());

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
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A list of targets (hostnames or IP addresses) of the probe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    java.util.List<String> targets;

    /**
     * A list of names of vantage points from which to execute the probe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePointNames")
    java.util.List<String> vantagePointNames;

    /**
     * The port on which to probe endpoints. If unspecified, probes will use the
     * default port of their protocol.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * The probe timeout in seconds. Valid values: 10, 20, 30, and 60.
     * The probe timeout must be less than or equal to `intervalInSeconds` for monitors.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    Integer timeoutInSeconds;

    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    HttpProbeProtocol protocol;

    @com.fasterxml.jackson.annotation.JsonProperty("method")
    HttpProbeMethod method;

    /**
     * The optional URL path to probe, including query parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * A dictionary of HTTP request headers.
     * <p>
     *Note:* Monitors and probes do not support the use of the `Authorization` HTTP header.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    java.util.Map<String, String> headers;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
