/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.model;

/**
 * A record to add to a zone in replacement of contents that cannot be migrated.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MigrationReplacement.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class MigrationReplacement {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("rtype")
        private String rtype;

        public Builder rtype(String rtype) {
            this.rtype = rtype;
            this.__explicitlySet__.add("rtype");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("substituteRtype")
        private String substituteRtype;

        public Builder substituteRtype(String substituteRtype) {
            this.substituteRtype = substituteRtype;
            this.__explicitlySet__.add("substituteRtype");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ttl")
        private Integer ttl;

        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            this.__explicitlySet__.add("ttl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rdata")
        private String rdata;

        public Builder rdata(String rdata) {
            this.rdata = rdata;
            this.__explicitlySet__.add("rdata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrationReplacement build() {
            MigrationReplacement __instance__ =
                    new MigrationReplacement(rtype, substituteRtype, ttl, rdata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrationReplacement o) {
            Builder copiedBuilder =
                    rtype(o.getRtype())
                            .substituteRtype(o.getSubstituteRtype())
                            .ttl(o.getTtl())
                            .rdata(o.getRdata());

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
     * The canonical name for the type of the replacement record, such as A or CNAME.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rtype")
    String rtype;

    /**
     * The canonical name for a substitute type of the replacement record to be used if the specified `rtype` is not allowed at the domain. The specified `ttl` and `rdata` will still apply with the substitute type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("substituteRtype")
    String substituteRtype;

    /**
     * The Time To Live of the replacement record, in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttl")
    Integer ttl;

    /**
     * The record data of the replacement record, as whitespace-delimited tokens in
     * type-specific presentation format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rdata")
    String rdata;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
