/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.autoscaling.model;

/**
 * Capacity limits for the instance pool.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Capacity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Capacity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private Integer max;

        public Builder max(Integer max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private Integer min;

        public Builder min(Integer min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initial")
        private Integer initial;

        public Builder initial(Integer initial) {
            this.initial = initial;
            this.__explicitlySet__.add("initial");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Capacity build() {
            Capacity __instance__ = new Capacity(max, min, initial);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Capacity o) {
            Builder copiedBuilder = max(o.getMax()).min(o.getMin()).initial(o.getInitial());

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
     * The maximum number of instances the instance pool is allowed to increase to (scale out).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    Integer max;

    /**
     * The minimum number of instances the instance pool is allowed to decrease to (scale in).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    Integer min;

    /**
     * The initial number of instances to launch in the instance pool immediately after autoscaling is
     * enabled. After autoscaling retrieves performance metrics, the number of instances is automatically adjusted from this
     * initial number to a number that is based on the limits that you set.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initial")
    Integer initial;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
