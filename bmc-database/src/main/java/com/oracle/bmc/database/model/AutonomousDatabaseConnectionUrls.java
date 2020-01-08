/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * The URLs for accessing Oracle Application Express (APEX) and SQL Developer Web with a browser from a Compute instance within your VCN or that has a direct connection to your VCN. Note that these URLs are provided by the console only for [dedicated deployments](https://docs.cloud.oracle.com/Content/Database/Concepts/adbddoverview.htm).
 * <p>
 * Example: `{\"sqlDevWebUrl\": \"https://<hostname>/ords...\", \"apexUrl\", \"https://<hostname>/ords...\"}`
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
    builder = AutonomousDatabaseConnectionUrls.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AutonomousDatabaseConnectionUrls {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sqlDevWebUrl")
        private String sqlDevWebUrl;

        public Builder sqlDevWebUrl(String sqlDevWebUrl) {
            this.sqlDevWebUrl = sqlDevWebUrl;
            this.__explicitlySet__.add("sqlDevWebUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("apexUrl")
        private String apexUrl;

        public Builder apexUrl(String apexUrl) {
            this.apexUrl = apexUrl;
            this.__explicitlySet__.add("apexUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("machineLearningUserManagementUrl")
        private String machineLearningUserManagementUrl;

        public Builder machineLearningUserManagementUrl(String machineLearningUserManagementUrl) {
            this.machineLearningUserManagementUrl = machineLearningUserManagementUrl;
            this.__explicitlySet__.add("machineLearningUserManagementUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseConnectionUrls build() {
            AutonomousDatabaseConnectionUrls __instance__ =
                    new AutonomousDatabaseConnectionUrls(
                            sqlDevWebUrl, apexUrl, machineLearningUserManagementUrl);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseConnectionUrls o) {
            Builder copiedBuilder =
                    sqlDevWebUrl(o.getSqlDevWebUrl())
                            .apexUrl(o.getApexUrl())
                            .machineLearningUserManagementUrl(
                                    o.getMachineLearningUserManagementUrl());

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
     * Oracle SQL Developer Web URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlDevWebUrl")
    String sqlDevWebUrl;

    /**
     * Oracle Application Express (APEX) URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apexUrl")
    String apexUrl;

    /**
     * Oracle Machine Learning user management URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("machineLearningUserManagementUrl")
    String machineLearningUserManagementUrl;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
