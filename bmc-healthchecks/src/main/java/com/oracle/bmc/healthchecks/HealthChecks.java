/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks;

import com.oracle.bmc.healthchecks.requests.*;
import com.oracle.bmc.healthchecks.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public interface HealthChecks extends AutoCloseable {

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
     * Moves a monitor into a different compartment. When provided, `If-Match` is checked
     * against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeHttpMonitorCompartmentResponse changeHttpMonitorCompartment(
            ChangeHttpMonitorCompartmentRequest request);

    /**
     * Moves a monitor into a different compartment. When provided, `If-Match` is checked
     * against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangePingMonitorCompartmentResponse changePingMonitorCompartment(
            ChangePingMonitorCompartmentRequest request);

    /**
     * Creates an HTTP monitor. Vantage points will be automatically selected if not specified,
     * and probes will be initiated from each vantage point to each of the targets at the frequency
     * specified by `intervalInSeconds`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateHttpMonitorResponse createHttpMonitor(CreateHttpMonitorRequest request);

    /**
     * Creates an on-demand HTTP probe. The location response header contains the URL for
     * fetching the probe results.
     * <p>
     *Note:* On-demand probe configurations are not saved.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateOnDemandHttpProbeResponse createOnDemandHttpProbe(CreateOnDemandHttpProbeRequest request);

    /**
     * Creates an on-demand ping probe. The location response header contains the URL for
     * fetching probe results.
     * <p>
     *Note:* The on-demand probe configuration is not saved.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateOnDemandPingProbeResponse createOnDemandPingProbe(CreateOnDemandPingProbeRequest request);

    /**
     * Creates a ping monitor. Vantage points will be automatically selected if not specified,
     * and probes will be initiated from each vantage point to each of the targets at the frequency
     * specified by `intervalInSeconds`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreatePingMonitorResponse createPingMonitor(CreatePingMonitorRequest request);

    /**
     * Deletes the HTTP monitor and its configuration. All future probes of this
     * monitor are stopped. Results associated with the monitor are not deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteHttpMonitorResponse deleteHttpMonitor(DeleteHttpMonitorRequest request);

    /**
     * Deletes the ping monitor and its configuration. All future probes of this
     * monitor are stopped. Results associated with the monitor are not deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeletePingMonitorResponse deletePingMonitor(DeletePingMonitorRequest request);

    /**
     * Gets the configuration for the specified monitor.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetHttpMonitorResponse getHttpMonitor(GetHttpMonitorRequest request);

    /**
     * Gets the configuration for the specified ping monitor.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPingMonitorResponse getPingMonitor(GetPingMonitorRequest request);

    /**
     * Gets information about all vantage points available to the user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListHealthChecksVantagePointsResponse listHealthChecksVantagePoints(
            ListHealthChecksVantagePointsRequest request);

    /**
     * Gets a list of HTTP monitors.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListHttpMonitorsResponse listHttpMonitors(ListHttpMonitorsRequest request);

    /**
     * Gets the HTTP probe results for the specified probe or monitor, where
     * the `probeConfigurationId` is the OCID of either a monitor or an
     * on-demand probe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListHttpProbeResultsResponse listHttpProbeResults(ListHttpProbeResultsRequest request);

    /**
     * Gets a list of configured ping monitors.
     * <p>
     * Results are paginated based on `page` and `limit`.  The `opc-next-page` header provides
     * a URL for fetching the next page.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPingMonitorsResponse listPingMonitors(ListPingMonitorsRequest request);

    /**
     * Returns the results for the specified probe, where the `probeConfigurationId`
     * is the OCID of either a monitor or an on-demand probe.
     * <p>
     * Results are paginated based on `page` and `limit`.  The `opc-next-page` header provides
     * a URL for fetching the next page.  Use `sortOrder` to set the order of the
     * results.  If `sortOrder` is unspecified, results are sorted in ascending order by
     * `startTime`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPingProbeResultsResponse listPingProbeResults(ListPingProbeResultsRequest request);

    /**
     * Updates the configuration of the specified HTTP monitor. Only the fields
     * specified in the request body will be updated; all other configuration
     * properties will remain unchanged.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateHttpMonitorResponse updateHttpMonitor(UpdateHttpMonitorRequest request);

    /**
     * Updates the configuration of the specified ping monitor. Only the fields
     * specified in the request body will be updated; all other configuration properties
     * will remain unchanged.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdatePingMonitorResponse updatePingMonitor(UpdatePingMonitorRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    HealthChecksPaginators getPaginators();
}
