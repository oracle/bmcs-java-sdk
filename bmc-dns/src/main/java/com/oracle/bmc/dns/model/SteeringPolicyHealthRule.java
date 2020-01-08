/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.model;

/**
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SteeringPolicyHealthRule.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "ruleType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class SteeringPolicyHealthRule extends SteeringPolicyRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cases")
        private java.util.List<SteeringPolicyHealthRuleCase> cases;

        public Builder cases(java.util.List<SteeringPolicyHealthRuleCase> cases) {
            this.cases = cases;
            this.__explicitlySet__.add("cases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyHealthRule build() {
            SteeringPolicyHealthRule __instance__ =
                    new SteeringPolicyHealthRule(description, cases);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyHealthRule o) {
            Builder copiedBuilder = description(o.getDescription()).cases(o.getCases());

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
    public SteeringPolicyHealthRule(
            String description, java.util.List<SteeringPolicyHealthRuleCase> cases) {
        super(description);
        this.cases = cases;
    }

    /**
     * An array of `caseConditions`. A rule may optionally include a sequence of cases defining alternate
     * configurations for how it should behave during processing for any given DNS query. When a rule has
     * no sequence of `cases`, it is always evaluated with the same configuration during processing. When
     * a rule has an empty sequence of `cases`, it is always ignored during processing. When a rule has a
     * non-empty sequence of `cases`, its behavior during processing is configured by the first matching
     * `case` in the sequence. When a rule has no matching cases the rule is ignored. A rule case with no
     * `caseCondition` always matches. A rule case with a `caseCondition` matches only when that expression
     * evaluates to true for the given query.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cases")
    java.util.List<SteeringPolicyHealthRuleCase> cases;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
