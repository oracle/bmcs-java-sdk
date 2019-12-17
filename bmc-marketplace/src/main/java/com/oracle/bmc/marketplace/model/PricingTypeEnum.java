/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Possible values for the listing package's pricing model.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public enum PricingTypeEnum {
    Free("FREE"),
    Byol("BYOL"),
    Paygo("PAYGO"),
    ;

    private final String value;
    private static java.util.Map<String, PricingTypeEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (PricingTypeEnum v : PricingTypeEnum.values()) {
            map.put(v.getValue(), v);
        }
    }

    PricingTypeEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static PricingTypeEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid PricingTypeEnum: " + key);
    }
}
