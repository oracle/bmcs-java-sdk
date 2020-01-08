/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateTagDefaultDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateTagDefaultDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionId")
        private String tagDefinitionId;

        public Builder tagDefinitionId(String tagDefinitionId) {
            this.tagDefinitionId = tagDefinitionId;
            this.__explicitlySet__.add("tagDefinitionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTagDefaultDetails build() {
            CreateTagDefaultDetails __instance__ =
                    new CreateTagDefaultDetails(compartmentId, tagDefinitionId, value, isRequired);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTagDefaultDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .tagDefinitionId(o.getTagDefinitionId())
                            .value(o.getValue())
                            .isRequired(o.getIsRequired());

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
     * The OCID of the compartment. The tag default will be applied to all new resources created in this compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the tag definition. The tag default will always assign a default value for this tag definition.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionId")
    String tagDefinitionId;

    /**
     * The default value for the tag definition. This will be applied to all new resources created in the compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    String value;

    /**
     * If you specify that a value is required, a value is set during resource creation (either by
     * the user creating the resource or another tag defualt). If no value is set, resource
     * creation is blocked.
     * <p>
     * If the `isRequired` flag is set to \"true\", the value is set during resource creation.
     * * If the `isRequired` flag is set to \"false\", the value you enter is set during resource creation.
     * <p>
     * Example: `false`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    Boolean isRequired;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
