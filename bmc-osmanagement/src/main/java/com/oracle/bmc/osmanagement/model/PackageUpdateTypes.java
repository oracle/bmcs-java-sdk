/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * The purpose of an update.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.extern.slf4j.Slf4j
public enum PackageUpdateTypes {
    Security("SECURITY"),
    Bugfix("BUGFIX"),
    Enhancement("ENHANCEMENT"),
    All("ALL"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, PackageUpdateTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (PackageUpdateTypes v : PackageUpdateTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    PackageUpdateTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static PackageUpdateTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'PackageUpdateTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
