/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import java.security.interfaces.RSAPublicKey;
import java.util.Set;

import javax.annotation.Nonnull;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;

/**
 * List of supported signed request versions with associated version rules.
 */
public enum SignedRequestVersion implements Version {
    ONE(1, ImmutableSet.of(Algorithm.RSAPSS256), ImmutableSet.of(KeyIdType.REF), 2048);

    private static final Optional<Error> ABSENT = Optional.absent();
    private final int number;
    private final Set<Algorithm> algorithms;
    private final Set<KeyIdType> keyIdTypes;
    private final int minimumKeySize;

    SignedRequestVersion(
            final int number,
            final Set<Algorithm> algorithms,
            final Set<KeyIdType> keyIdTypes,
            final int minimumKeySize) {
        this.number = number;
        this.algorithms = algorithms;
        this.keyIdTypes = keyIdTypes;
        this.minimumKeySize = minimumKeySize;
    }

    @Override
    public Set<Algorithm> getSupportedAlgorithms() {
        return algorithms;
    }

    @Override
    public Set<KeyIdType> getSupportedKeyIdTypes() {
        return keyIdTypes;
    }

    @Override
    public int getVersionNumber() {
        return number;
    }

    @Override
    public String getVersionName() {
        return String.valueOf(getVersionNumber());
    }

    @Override
    public int getMinimumKeySizeInBits() {
        return minimumKeySize;
    }

    @Override
    public Optional<Error> validateKeyId(@Nonnull String keyId) {
        Preconditions.checkArgument(!StringUtils.isBlank(keyId));

        boolean isKeyIdValid = false;
        for (KeyIdType idType : this.getSupportedKeyIdTypes()) {
            if (keyId.matches(idType.getPattern())) {
                isKeyIdValid = true;
                break;
            }
        }
        return isKeyIdValid ? ABSENT : Optional.of(Error.UNSUPPORTED_KEYID);
    }

    @Override
    public Optional<Error> validateAlgorithm(@Nonnull Algorithm algorithm) {
        Preconditions.checkNotNull(algorithm);
        boolean isAlgorithmValid = this.getSupportedAlgorithms().contains(algorithm);
        return isAlgorithmValid ? ABSENT : Optional.of(Error.UNSUPPORTED_ALGORITHM);
    }

    @Override
    public Optional<Error> validateKeySize(@Nonnull RSAPublicKey publicKey) {
        int keySize = publicKey.getModulus().bitLength();
        if (keySize < this.getMinimumKeySizeInBits()) {
            return Optional.of(Error.KEY_TOO_SMALL);
        }
        return ABSENT;
    }

    /**
     * Get the latest signed request version.
     */
    public static SignedRequestVersion getLatestVersion() {
        return ONE;
    }

    /**
     * Get the SignedRequestVersion based on version number. Leading and
     * trailing spaces in the specified number is ignored.
     */
    static Optional<SignedRequestVersion> getVersion(@Nonnull String versionNumber) {
        Preconditions.checkNotNull(versionNumber);

        try {
            Integer number = Integer.valueOf(versionNumber.trim());

            for (SignedRequestVersion version : SignedRequestVersion.values()) {
                if (version.getVersionNumber() == number) {
                    return Optional.of(version);
                }
            }
            return Optional.absent();
        } catch (NumberFormatException e) {
            return Optional.absent();
        }
    }
}
