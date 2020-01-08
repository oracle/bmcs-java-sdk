/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcesearch.model;

/**
 * An individual field that can be used as part of a query filter.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.4")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = QueryableFieldDescription.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class QueryableFieldDescription {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
        private FieldType fieldType;

        public Builder fieldType(FieldType fieldType) {
            this.fieldType = fieldType;
            this.__explicitlySet__.add("fieldType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isArray")
        private Boolean isArray;

        public Builder isArray(Boolean isArray) {
            this.isArray = isArray;
            this.__explicitlySet__.add("isArray");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectProperties")
        private java.util.List<QueryableFieldDescription> objectProperties;

        public Builder objectProperties(
                java.util.List<QueryableFieldDescription> objectProperties) {
            this.objectProperties = objectProperties;
            this.__explicitlySet__.add("objectProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryableFieldDescription build() {
            QueryableFieldDescription __instance__ =
                    new QueryableFieldDescription(fieldType, fieldName, isArray, objectProperties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryableFieldDescription o) {
            Builder copiedBuilder =
                    fieldType(o.getFieldType())
                            .fieldName(o.getFieldName())
                            .isArray(o.getIsArray())
                            .objectProperties(o.getObjectProperties());

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
     * The type of the field, which dictates what semantics and query constraints you can use when searching or querying.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum FieldType {
        Identifier("IDENTIFIER"),
        String("STRING"),
        Integer("INTEGER"),
        Rational("RATIONAL"),
        Boolean("BOOLEAN"),
        Datetime("DATETIME"),
        Ip("IP"),
        Object("OBJECT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, FieldType> map;

        static {
            map = new java.util.HashMap<>();
            for (FieldType v : FieldType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FieldType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FieldType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FieldType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the field, which dictates what semantics and query constraints you can use when searching or querying.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
    FieldType fieldType;

    /**
     * The name of the field to use when constructing the query. Field names are present for all types except `OBJECT`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    String fieldName;

    /**
     * Indicates this field is actually an array of the specified field type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isArray")
    Boolean isArray;

    /**
     * If the field type is `OBJECT`, then this property will provide all the individual properties on the object that can
     * be queried.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectProperties")
    java.util.List<QueryableFieldDescription> objectProperties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
