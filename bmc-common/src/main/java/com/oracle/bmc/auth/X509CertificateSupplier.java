/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;

/**
 * An interface to provide X509 certificate for a federated client.
 */
public interface X509CertificateSupplier {

    /**
     * Gets the certificate
     * @return The certificate, must not be null
     * @deprecated use {@link X509CertificateSupplier#getCertificateAndKeyPair()} instead
     */
    @Deprecated
    X509Certificate getCertificate();

    /**
     * Corresponding private key of the certificate. You must implement this
     * method for leaf certificates (to sign the request made to the auth service
     * to get a security token). For intermediate certificates, you can return null.
     * @return The private key
     * @deprecated use {@link X509CertificateSupplier#getCertificateAndKeyPair()} instead
     */
    @Deprecated
    RSAPrivateKey getPrivateKey();

    /**
     * Returns the X509 certificate and private key.  The X509 certificate will always
     * be valid.  The private key may be null for intermediate certificates.  For leaf
     * certificates, the private key will always be valid.
     * @return The certificate and private key pair.
     */
    CertificateAndPrivateKeyPair getCertificateAndKeyPair();

    @RequiredArgsConstructor
    @Getter
    class CertificateAndPrivateKeyPair {
        private final X509Certificate certificate;
        private final RSAPrivateKey privateKey;
    }
}
