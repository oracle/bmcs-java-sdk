/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Global behavior applied to all requests received by the API.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApiSpecificationRequestPolicies.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ApiSpecificationRequestPolicies {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("authentication")
        private AuthenticationPolicy authentication;

        public Builder authentication(AuthenticationPolicy authentication) {
            this.authentication = authentication;
            this.__explicitlySet__.add("authentication");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rateLimiting")
        private RateLimitingPolicy rateLimiting;

        public Builder rateLimiting(RateLimitingPolicy rateLimiting) {
            this.rateLimiting = rateLimiting;
            this.__explicitlySet__.add("rateLimiting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cors")
        private CorsPolicy cors;

        public Builder cors(CorsPolicy cors) {
            this.cors = cors;
            this.__explicitlySet__.add("cors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiSpecificationRequestPolicies build() {
            ApiSpecificationRequestPolicies __instance__ =
                    new ApiSpecificationRequestPolicies(authentication, rateLimiting, cors);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiSpecificationRequestPolicies o) {
            Builder copiedBuilder =
                    authentication(o.getAuthentication())
                            .rateLimiting(o.getRateLimiting())
                            .cors(o.getCors());

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

    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    AuthenticationPolicy authentication;

    @com.fasterxml.jackson.annotation.JsonProperty("rateLimiting")
    RateLimitingPolicy rateLimiting;

    @com.fasterxml.jackson.annotation.JsonProperty("cors")
    CorsPolicy cors;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
