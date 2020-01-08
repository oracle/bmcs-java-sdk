/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.internal;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * DefaultEndpointConfiguration provides a way to construct the host endpoint for a service
 * given a template and some variables based on the default Oracle Cloud Infrastructure naming
 * convention.
 * <p>
 * The available variables are:
 * - {serviceEndpointPrefix} : The service prefix in the URL.
 * - {region} : The public region id, ex, "us-phoenix-1".
 * - {secondLevelDomain} : The second level domain associated with the Realm.
 */
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class DefaultEndpointConfiguration {
    private static final String SERVICE_ENDPOINT_PREFIX_TEMPLATE = "{serviceEndpointPrefix}";
    private static final String REGION_ID_TEMPLATE =
            "{region}"; // not regionId for backwards compatibility
    private static final String SECOND_LEVEL_DOMAIN_TEMPLATE = "{secondLevelDomain}";

    // the endpoint template that will be used.
    private final String endpointTemplate;

    private String serviceEndpointPrefix;
    private String regionId;
    private String secondLevelDomain;

    /**
     * Creates a new builder starting with the given template.
     * @param endpointTemplate The template
     * @return A new builder.
     */
    public static DefaultEndpointConfiguration builder(@NonNull String endpointTemplate) {
        return new DefaultEndpointConfiguration(endpointTemplate);
    }

    /**
     * Sets the service endpoint prefix, if one.
     *
     * @param serviceEndpointPrefix The service endpoint prefix.
     * @return This builder
     */
    public DefaultEndpointConfiguration serviceEndpointPrefix(String serviceEndpointPrefix) {
        this.serviceEndpointPrefix = serviceEndpointPrefix;
        return this;
    }

    /**
     * Sets the regionId, if one.
     *
     * @param regionId The region id.
     * @return This builder
     */
    public DefaultEndpointConfiguration regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Sets the second level domain, if one.
     *
     * @param secondLevelDomain The second level domain of the Realm.
     * @return This builder
     */
    public DefaultEndpointConfiguration secondLevelDomain(String secondLevelDomain) {
        this.secondLevelDomain = secondLevelDomain;
        return this;
    }

    /**
     * Builds the final endpoint based on the variables provided.
     * @return The endpoint.
     */
    public String build() {
        String endpoint = endpointTemplate;
        if (serviceEndpointPrefix != null) {
            endpoint = endpoint.replace(SERVICE_ENDPOINT_PREFIX_TEMPLATE, serviceEndpointPrefix);
        }
        if (regionId != null) {
            endpoint = endpoint.replace(REGION_ID_TEMPLATE, regionId);
        }
        if (secondLevelDomain != null) {
            endpoint = endpoint.replace(SECOND_LEVEL_DOMAIN_TEMPLATE, secondLevelDomain);
        }
        return endpoint;
    }
}
