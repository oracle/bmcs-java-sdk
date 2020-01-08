/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.Validate;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.spi.ConnectorProvider;

/**
 * A {@code ClientConfigDecorator} implementation that configures an HTTP or HTTPS proxy for the specific client instance.
 */
@Slf4j
public class ApacheProxyConfigDecorator implements ClientConfigDecorator {
    private final ApacheProxyConfig proxyConfig;

    /**
     * Creates a new {@code ApacheProxyConfigDecorator} object.
     *
     * @param proxyConfig the proxy configuration
     */
    public ApacheProxyConfigDecorator(@NonNull final ApacheProxyConfig proxyConfig) {
        this.proxyConfig = proxyConfig;
    }

    /**
     * Customizes the client configuration for specifying a proxy to connect to for client operations.
     * {@inheritDoc}
     */
    @Override
    public void customizeClientConfig(final ClientConfig clientConfig) {
        Validate.notNull(clientConfig, "ClientConfig must not be null");

        // Fetch the provider reference from the config
        final ConnectorProvider provider = clientConfig.getConnectorProvider();
        // Only configure ApacheConnectorProvider types
        Validate.isInstanceOf(
                ApacheConnectorProvider.class,
                provider,
                String.format(
                        "ConnectorProvider of type [%s] is not supported. Expected ApacheConnectorProvider",
                        provider.getClass().getCanonicalName()));

        if (!proxyConfig.isConfiguredAndValid()) {
            LOG.info("Invalid proxy configuration.  Not configuring a proxy.");
            return;
        }
        LOG.debug("ApacheProxyConfig: {}", proxyConfig);

        final String proxyUri = proxyConfig.getUri();
        LOG.info("Configuring proxy for ApacheConnectorProvider to connect to {}", proxyUri);

        clientConfig.property(ClientProperties.PROXY_URI, proxyUri);
        configureAuth(clientConfig, proxyConfig);
    }

    private static void configureAuth(
            final ClientConfig clientConfig, final ApacheProxyConfig proxyConfig) {
        final String username = proxyConfig.getUsername();
        final String password = proxyConfig.getPassword();

        if (username == null || password == null) {
            LOG.info(
                    "Either username or password is null. Not configuring auth credentials for the proxy");
        } else {
            LOG.info("Configuring auth credentials for the proxy");
            clientConfig.property(ClientProperties.PROXY_USERNAME, username);
            clientConfig.property(ClientProperties.PROXY_PASSWORD, password);
        }
    }
}
