/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@lombok.experimental.NonFinal
@lombok.AllArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType",
    defaultImpl = InstanceSourceDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = InstanceSourceViaImageDetails.class,
        name = "image"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = InstanceSourceViaBootVolumeDetails.class,
        name = "bootVolume"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class InstanceSourceDetails {}
