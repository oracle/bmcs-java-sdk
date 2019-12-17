/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Policies controlling the pushing of logs to OCI Public Logging.
 *
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
    builder = ApiSpecificationLoggingPolicies.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ApiSpecificationLoggingPolicies {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("accessLog")
        private AccessLogPolicy accessLog;

        public Builder accessLog(AccessLogPolicy accessLog) {
            this.accessLog = accessLog;
            this.__explicitlySet__.add("accessLog");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionLog")
        private ExecutionLogPolicy executionLog;

        public Builder executionLog(ExecutionLogPolicy executionLog) {
            this.executionLog = executionLog;
            this.__explicitlySet__.add("executionLog");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiSpecificationLoggingPolicies build() {
            ApiSpecificationLoggingPolicies __instance__ =
                    new ApiSpecificationLoggingPolicies(accessLog, executionLog);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiSpecificationLoggingPolicies o) {
            Builder copiedBuilder = accessLog(o.getAccessLog()).executionLog(o.getExecutionLog());

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

    @com.fasterxml.jackson.annotation.JsonProperty("accessLog")
    AccessLogPolicy accessLog;

    @com.fasterxml.jackson.annotation.JsonProperty("executionLog")
    ExecutionLogPolicy executionLog;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
