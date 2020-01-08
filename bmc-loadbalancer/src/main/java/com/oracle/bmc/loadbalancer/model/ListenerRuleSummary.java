/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The attributes of a rule associated with the specified listener, and the name of the rule set that the rule
 * belongs to.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ListenerRuleSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ListenerRuleSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("rule")
        private Rule rule;

        public Builder rule(Rule rule) {
            this.rule = rule;
            this.__explicitlySet__.add("rule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleSetName")
        private String ruleSetName;

        public Builder ruleSetName(String ruleSetName) {
            this.ruleSetName = ruleSetName;
            this.__explicitlySet__.add("ruleSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListenerRuleSummary build() {
            ListenerRuleSummary __instance__ = new ListenerRuleSummary(rule, ruleSetName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListenerRuleSummary o) {
            Builder copiedBuilder = rule(o.getRule()).ruleSetName(o.getRuleSetName());

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
     * A rule object that applies to the listener.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rule")
    Rule rule;

    /**
     * The name of the rule set that the rule belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleSetName")
    String ruleSetName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
