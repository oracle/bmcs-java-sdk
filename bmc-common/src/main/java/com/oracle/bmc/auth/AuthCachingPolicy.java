/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * AuthCachingPolicy provides the ability to annotation basic auth providers with what level
 * of caching a request signer should try to follow.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCachingPolicy {
    /**
     * Param to set whether or not keyIds can be cached.
     * @return true to enable caching, false if the keyId should be retrieved for every request.
     */
    boolean cacheKeyId();

    /**
     * Param to set whether or not private can be cached.
     * @return true to enable caching, false if the private key should be retrieved for every request.
     */
    boolean cachePrivateKey();
}
