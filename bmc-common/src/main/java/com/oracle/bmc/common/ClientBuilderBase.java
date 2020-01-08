/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.common;

import com.google.common.collect.ImmutableMap;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.Service;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.signing.RequestSignerFactory;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Base client builder.
 * @param <B> actual class of the builder
 */
public abstract class ClientBuilderBase<B extends ClientBuilderBase, C> {
    protected final Service service;
    protected ClientConfiguration configuration;
    protected ClientConfigurator clientConfigurator;
    protected List<ClientConfigurator> additionalClientConfigurators = new ArrayList<>();
    protected RequestSignerFactory requestSignerFactory =
            new DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
    protected Map<SigningStrategy, RequestSignerFactory> signingStrategyRequestSignerFactories =
            DefaultRequestSignerFactory.createDefaultRequestSignerFactories();
    protected String endpoint;

    public ClientBuilderBase(Service service) {
        this.service = service;
    }

    /**
     * Set the configuration. May be null.
     * @param configuration configuration. May be null.
     * @return this builder
     */
    public B configuration(com.oracle.bmc.ClientConfiguration configuration) {
        this.configuration = configuration;
        return (B) this;
    }

    /**
     * Set the client configurator. May be null.
     * @param clientConfigurator client configurator. May be null.
     * @return this builder
     */
    public B clientConfigurator(com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this.clientConfigurator = clientConfigurator;
        return (B) this;
    }

    /**
     * Add an additional client configurator to be run after the primary configurator.
     * @param additionalClientConfigurator the additional client configurator
     * @return this builder
     */
    public B additionalClientConfigurator(
            @lombok.NonNull com.oracle.bmc.http.ClientConfigurator additionalClientConfigurator) {
        if (additionalClientConfigurator == null) {
            throw new NullPointerException("additionalClientConfigurator");
        }
        this.additionalClientConfigurators.add(additionalClientConfigurator);
        return (B) this;
    }

    /**
     * Set the request signer factory. May be null.
     * @param requestSignerFactory request signer factory. May be null.
     * @return this builder
     */
    public B requestSignerFactory(
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
        if (requestSignerFactory == null) {
            this.requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        } else {
            this.requestSignerFactory = requestSignerFactory;
        }
        return (B) this;
    }

    /**
     * Set the endpoint for the client to be created.
     * @param endpoint endpoint
     * @return this builder
     */
    public B endpoint(String endpoint) {
        this.endpoint = endpoint;
        return (B) this;
    }

    /**
     * Set the request signer factories for each signing strategy.
     * @param signingStrategyRequestSignerFactories request signer factories for each signing strategy
     * @return this builder
     */
    public B signingStrategyRequestSignerFactories(
            Map<SigningStrategy, RequestSignerFactory> signingStrategyRequestSignerFactories) {
        this.signingStrategyRequestSignerFactories =
                ImmutableMap.copyOf(signingStrategyRequestSignerFactories);
        return (B) this;
    }

    /**
     * Set the authentication details provider. Once this is called, the builder can build the client.
     * @param authenticationDetailsProvider authentication details provider
     * @return a builder that can build the client
     */
    public abstract C build(
            @lombok.NonNull
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider);
}
