/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Job details that are specific to destroy operations.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DestroyJobOperationDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "operation"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DestroyJobOperationDetails extends JobOperationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("executionPlanStrategy")
        private ExecutionPlanStrategy executionPlanStrategy;

        public Builder executionPlanStrategy(ExecutionPlanStrategy executionPlanStrategy) {
            this.executionPlanStrategy = executionPlanStrategy;
            this.__explicitlySet__.add("executionPlanStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DestroyJobOperationDetails build() {
            DestroyJobOperationDetails __instance__ =
                    new DestroyJobOperationDetails(executionPlanStrategy);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DestroyJobOperationDetails o) {
            Builder copiedBuilder = executionPlanStrategy(o.getExecutionPlanStrategy());

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

    @Deprecated
    public DestroyJobOperationDetails(ExecutionPlanStrategy executionPlanStrategy) {
        super();
        this.executionPlanStrategy = executionPlanStrategy;
    }

    /**
     * Specifies the source of the execution plan to apply.
     * Currently, only `AUTO_APPROVED` is allowed, which indicates that the job
     * will be run without an execution plan.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ExecutionPlanStrategy {
        AutoApproved("AUTO_APPROVED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ExecutionPlanStrategy> map;

        static {
            map = new java.util.HashMap<>();
            for (ExecutionPlanStrategy v : ExecutionPlanStrategy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExecutionPlanStrategy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExecutionPlanStrategy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExecutionPlanStrategy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the source of the execution plan to apply.
     * Currently, only `AUTO_APPROVED` is allowed, which indicates that the job
     * will be run without an execution plan.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionPlanStrategy")
    ExecutionPlanStrategy executionPlanStrategy;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
