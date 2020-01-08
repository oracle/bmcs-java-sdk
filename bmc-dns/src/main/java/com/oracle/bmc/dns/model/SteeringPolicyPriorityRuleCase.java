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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SteeringPolicyPriorityRuleCase.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class SteeringPolicyPriorityRuleCase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("caseCondition")
        private String caseCondition;

        public Builder caseCondition(String caseCondition) {
            this.caseCondition = caseCondition;
            this.__explicitlySet__.add("caseCondition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("answerData")
        private java.util.List<SteeringPolicyPriorityAnswerData> answerData;

        public Builder answerData(java.util.List<SteeringPolicyPriorityAnswerData> answerData) {
            this.answerData = answerData;
            this.__explicitlySet__.add("answerData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyPriorityRuleCase build() {
            SteeringPolicyPriorityRuleCase __instance__ =
                    new SteeringPolicyPriorityRuleCase(caseCondition, answerData);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyPriorityRuleCase o) {
            Builder copiedBuilder =
                    caseCondition(o.getCaseCondition()).answerData(o.getAnswerData());

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
     * An expression that uses conditions at the time of a DNS query to indicate
     * whether a case matches. Conditions may include the geographical location, IP
     * subnet, or ASN the DNS query originated. **Example:** If you have an
     * office that uses the subnet `192.0.2.0/24` you could use a `caseCondition`
     * expression `query.client.subnet in ('192.0.2.0/24')` to define a case that
     * matches queries from that office.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caseCondition")
    String caseCondition;

    /**
     * An array of `SteeringPolicyPriorityAnswerData` objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("answerData")
    java.util.List<SteeringPolicyPriorityAnswerData> answerData;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
