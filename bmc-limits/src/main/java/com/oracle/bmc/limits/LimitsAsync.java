/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.limits;

import com.oracle.bmc.limits.requests.*;
import com.oracle.bmc.limits.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: ")
public interface LimitsAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
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
     * For a given compartmentId, resource limit name, and scope, returns the following:
     *   - the number of available resources associated with the given limit
     *   - the usage in the selected compartment for the given limit
     *   Note: not all resource limits support this API. If the value is not available, the API will return 404.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetResourceAvailabilityResponse> getResourceAvailability(
            GetResourceAvailabilityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetResourceAvailabilityRequest, GetResourceAvailabilityResponse>
                    handler);

    /**
     * Includes a list of resource limits that are currently supported.
     * If the 'areQuotasSupported' property is true, you can create quota policies on top of this limit at the
     * compartment level.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLimitDefinitionsResponse> listLimitDefinitions(
            ListLimitDefinitionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLimitDefinitionsRequest, ListLimitDefinitionsResponse>
                    handler);

    /**
     * Includes a full list of resource limits belonging to a given service.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLimitValuesResponse> listLimitValues(
            ListLimitValuesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListLimitValuesRequest, ListLimitValuesResponse>
                    handler);

    /**
     * Returns the list of supported services.
     * This will include the programmatic service name, along with the friendly service name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListServicesResponse> listServices(
            ListServicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListServicesRequest, ListServicesResponse>
                    handler);
}
