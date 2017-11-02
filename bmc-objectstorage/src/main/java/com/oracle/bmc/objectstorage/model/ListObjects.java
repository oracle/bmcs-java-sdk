/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ListObjects.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ListObjects {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("objects")
        private java.util.List<ObjectSummary> objects;

        public Builder objects(java.util.List<ObjectSummary> objects) {
            this.objects = objects;
            this.__explicitlySet__.add("objects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("prefixes")
        private java.util.List<String> prefixes;

        public Builder prefixes(java.util.List<String> prefixes) {
            this.prefixes = prefixes;
            this.__explicitlySet__.add("prefixes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextStartWith")
        private String nextStartWith;

        public Builder nextStartWith(String nextStartWith) {
            this.nextStartWith = nextStartWith;
            this.__explicitlySet__.add("nextStartWith");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListObjects build() {
            ListObjects __instance__ = new ListObjects(objects, prefixes, nextStartWith);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListObjects o) {
            return objects(o.getObjects())
                    .prefixes(o.getPrefixes())
                    .nextStartWith(o.getNextStartWith());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * An array of object summaries.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objects")
    java.util.List<ObjectSummary> objects;

    /**
     * Prefixes that are common to the results returned by the request if the request specified a delimiter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefixes")
    java.util.List<String> prefixes;

    /**
     * The name of the object to use in the 'startWith' parameter to obtain the next page of
     * a truncated ListObjects response. Avoid entering confidential information.
     * Example: test/object1.log
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextStartWith")
    String nextStartWith;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
