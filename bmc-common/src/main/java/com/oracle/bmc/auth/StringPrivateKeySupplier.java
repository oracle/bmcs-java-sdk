/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import com.google.common.base.Supplier;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Supplier for private key in String format
 */
@RequiredArgsConstructor
@ToString
public class StringPrivateKeySupplier implements Supplier<InputStream> {

    private final String privateKey;

    @Override
    public InputStream get() {
        return IOUtils.toInputStream(privateKey, StandardCharsets.UTF_8);
    }
}
