/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.audit;

import com.oracle.bmc.audit.requests.*;
import com.oracle.bmc.audit.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
public interface Audit extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Get the configuration
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetConfigurationResponse getConfiguration(GetConfigurationRequest request);

    /**
     * Returns all the audit events processed for the specified compartment within the specified
     * time range.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListEventsResponse listEvents(ListEventsRequest request);

    /**
     * Update the configuration
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    AuditPaginators getPaginators();
}
