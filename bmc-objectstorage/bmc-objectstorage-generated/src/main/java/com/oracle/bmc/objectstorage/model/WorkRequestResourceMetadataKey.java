/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The keys of WorkRequestResource metadata.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public enum WorkRequestResourceMetadataKey {
    Region("REGION"),
    Namespace("NAMESPACE"),
    Bucket("BUCKET"),
    Object("OBJECT"),
    ;

    private final String value;
    private static java.util.Map<String, WorkRequestResourceMetadataKey> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkRequestResourceMetadataKey v : WorkRequestResourceMetadataKey.values()) {
            map.put(v.getValue(), v);
        }
    }

    WorkRequestResourceMetadataKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WorkRequestResourceMetadataKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid WorkRequestResourceMetadataKey: " + key);
    }
}
