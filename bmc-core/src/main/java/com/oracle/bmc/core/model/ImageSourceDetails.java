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
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType",
    defaultImpl = ImageSourceDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ImageSourceViaObjectStorageTupleDetails.class,
        name = "objectStorageTuple"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ImageSourceViaObjectStorageUriDetails.class,
        name = "objectStorageUri"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ImageSourceDetails {

    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    String operatingSystem;

    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
    String operatingSystemVersion;
    /**
     * The format of the image to be imported.  Only monolithic
     * images are supported. This attribute is not used for exported Oracle images with the OCI image format.
     *
     **/
    public enum SourceImageType {
        Qcow2("QCOW2"),
        Vmdk("VMDK"),
        ;

        private final String value;
        private static java.util.Map<String, SourceImageType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceImageType v : SourceImageType.values()) {
                map.put(v.getValue(), v);
            }
        }

        SourceImageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceImageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid SourceImageType: " + key);
        }
    };
    /**
     * The format of the image to be imported.  Only monolithic
     * images are supported. This attribute is not used for exported Oracle images with the OCI image format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceImageType")
    SourceImageType sourceImageType;
}
