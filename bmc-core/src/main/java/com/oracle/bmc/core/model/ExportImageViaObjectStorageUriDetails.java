/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExportImageViaObjectStorageUriDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "destinationType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ExportImageViaObjectStorageUriDetails extends ExportImageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("destinationUri")
        private String destinationUri;

        public Builder destinationUri(String destinationUri) {
            this.destinationUri = destinationUri;
            this.__explicitlySet__.add("destinationUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportImageViaObjectStorageUriDetails build() {
            ExportImageViaObjectStorageUriDetails __instance__ =
                    new ExportImageViaObjectStorageUriDetails(destinationUri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportImageViaObjectStorageUriDetails o) {
            Builder copiedBuilder = destinationUri(o.getDestinationUri());

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
    public ExportImageViaObjectStorageUriDetails(String destinationUri) {
        super();
        this.destinationUri = destinationUri;
    }

    /**
     * The Object Storage URL to export the image to. See [Object Storage URLs](https://docs.cloud.oracle.com/Content/Compute/Tasks/imageimportexport.htm#URLs)
     * and [Using Pre-Authenticated Requests](https://docs.cloud.oracle.com/Content/Object/Tasks/usingpreauthenticatedrequests.htm) for constructing URLs for image import/export.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationUri")
    String destinationUri;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
