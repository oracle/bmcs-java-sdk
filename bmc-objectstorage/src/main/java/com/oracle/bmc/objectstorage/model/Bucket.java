/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * A bucket is a container for storing objects in a compartment within a namespace. A bucket is associated with a single compartment.
 * The compartment has policies that indicate what actions a user can perform on a bucket and all the objects in the bucket. For more
 * information, see [Managing Buckets](https://docs.us-phoenix-1.oraclecloud.com/Content/Object/Tasks/managingbuckets.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Bucket.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Bucket {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
        private PublicAccessType publicAccessType;

        public Builder publicAccessType(PublicAccessType publicAccessType) {
            this.publicAccessType = publicAccessType;
            this.__explicitlySet__.add("publicAccessType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            this.__explicitlySet__.add("storageTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Bucket build() {
            Bucket __instance__ =
                    new Bucket(
                            namespace,
                            name,
                            compartmentId,
                            metadata,
                            createdBy,
                            timeCreated,
                            etag,
                            publicAccessType,
                            storageTier);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Bucket o) {
            Builder copiedBuilder =
                    namespace(o.getNamespace())
                            .name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .metadata(o.getMetadata())
                            .createdBy(o.getCreatedBy())
                            .timeCreated(o.getTimeCreated())
                            .etag(o.getEtag())
                            .publicAccessType(o.getPublicAccessType())
                            .storageTier(o.getStorageTier());

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
     * The namespace in which the bucket lives.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: my-new-bucket1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The compartment ID in which the bucket is authorized.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Arbitrary string keys and values for user-defined metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;

    /**
     * The OCID of the user who created the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    String createdBy;

    /**
     * The date and time the bucket was created, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The entity tag for the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    String etag;
    /**
     * The type of public access enabled on this bucket.
     * A bucket is set to `NoPublicAccess` by default, which only allows an authenticated caller to access the
     * bucket and its contents. When `ObjectRead` is enabled on the bucket, public access is allowed for the
     * `GetObject`, `HeadObject`, and `ListObjects` operations.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PublicAccessType {
        NoPublicAccess("NoPublicAccess"),
        ObjectRead("ObjectRead"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PublicAccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (PublicAccessType v : PublicAccessType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PublicAccessType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PublicAccessType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PublicAccessType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of public access enabled on this bucket.
     * A bucket is set to `NoPublicAccess` by default, which only allows an authenticated caller to access the
     * bucket and its contents. When `ObjectRead` is enabled on the bucket, public access is allowed for the
     * `GetObject`, `HeadObject`, and `ListObjects` operations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
    PublicAccessType publicAccessType;
    /**
     * The type of storage tier of this bucket.
     * A bucket is set to 'Standard' tier by default, which means the bucket will be put in the standard storage tier.
     * When 'Archive' tier type is set explicitly, the bucket is put in the Archive Storage tier. The 'storageTier'
     * property is immutable once the bucket is created.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum StorageTier {
        Standard("Standard"),
        Archive("Archive"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, StorageTier> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageTier v : StorageTier.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StorageTier(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageTier create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StorageTier', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of storage tier of this bucket.
     * A bucket is set to 'Standard' tier by default, which means the bucket will be put in the standard storage tier.
     * When 'Archive' tier type is set explicitly, the bucket is put in the Archive Storage tier. The 'storageTier'
     * property is immutable once the bucket is created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    StorageTier storageTier;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
