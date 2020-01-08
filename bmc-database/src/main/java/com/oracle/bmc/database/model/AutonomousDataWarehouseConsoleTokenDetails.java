/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * **Deprecated.** See {@link #autonomousDatabaseConsoleTokenDetails(AutonomousDatabaseConsoleTokenDetailsRequest) autonomousDatabaseConsoleTokenDetails} for reference information about the token that allows the OCI Console to access the Autonomous Data Warehouse Service Console.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousDataWarehouseConsoleTokenDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AutonomousDataWarehouseConsoleTokenDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("token")
        private String token;

        public Builder token(String token) {
            this.token = token;
            this.__explicitlySet__.add("token");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("loginUrl")
        private String loginUrl;

        public Builder loginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            this.__explicitlySet__.add("loginUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDataWarehouseConsoleTokenDetails build() {
            AutonomousDataWarehouseConsoleTokenDetails __instance__ =
                    new AutonomousDataWarehouseConsoleTokenDetails(token, loginUrl);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDataWarehouseConsoleTokenDetails o) {
            Builder copiedBuilder = token(o.getToken()).loginUrl(o.getLoginUrl());

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
     * The token that allows the OCI Console to access the Autonomous Data Warehouse Service Console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("token")
    String token;

    /**
     * The login URL that allows the OCI Console to access the Autonomous Data Warehouse Service Console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loginUrl")
    String loginUrl;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
