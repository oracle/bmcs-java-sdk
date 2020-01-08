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
    property = "type",
    defaultImpl = AttachVolumeDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AttachServiceDeterminedVolumeDetails.class,
        name = "service_determined"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AttachEmulatedVolumeDetails.class,
        name = "emulated"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AttachIScsiVolumeDetails.class,
        name = "iscsi"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AttachParavirtualizedVolumeDetails.class,
        name = "paravirtualized"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AttachVolumeDetails {

    /**
     * The device name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    String device;

    /**
     * A user-friendly name. Does not have to be unique, and it cannot be changed. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    String instanceId;

    /**
     * Whether the attachment was created in read-only mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
    Boolean isReadOnly;

    /**
     * Whether the attachment should be created in shareable mode. If an attachment
     * is created in shareable mode, then other instances can attach the same volume, provided
     * that they also create their attachments in shareable mode. Only certain volume types can
     * be attached in shareable mode. Defaults to false if not specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShareable")
    Boolean isShareable;

    /**
     * The OCID of the volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
    String volumeId;
}
