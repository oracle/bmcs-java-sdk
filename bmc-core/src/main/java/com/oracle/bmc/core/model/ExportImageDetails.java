/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * The destination details for the image export.
 * <p>
 * Set `destinationType` to `objectStorageTuple`
 * and use {@link #exportImageViaObjectStorageTupleDetails(ExportImageViaObjectStorageTupleDetailsRequest) exportImageViaObjectStorageTupleDetails}
 * when specifying the namespace, bucket name, and object name.
 * <p>
 * Set `destinationType` to `objectStorageUri` and
 * use {@link #exportImageViaObjectStorageUriDetails(ExportImageViaObjectStorageUriDetailsRequest) exportImageViaObjectStorageUriDetails}
 * when specifying the Object Storage URL.
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
    property = "destinationType",
    defaultImpl = ExportImageDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExportImageViaObjectStorageUriDetails.class,
        name = "objectStorageUri"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExportImageViaObjectStorageTupleDetails.class,
        name = "objectStorageTuple"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ExportImageDetails {}
