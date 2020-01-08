/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public interface OdaAsync extends AutoCloseable {

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
     * Moves an Digital Assistant instance into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOdaInstanceCompartmentResponse> changeOdaInstanceCompartment(
            ChangeOdaInstanceCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeOdaInstanceCompartmentRequest,
                            ChangeOdaInstanceCompartmentResponse>
                    handler);

    /**
     * Starts an asynchronous job to create a Digital Assistant instance.
     * <p>
     * To monitor the status of the job, take the `opc-work-request-id` response
     * header value and use it to call `GET /workRequests/{workRequestID}`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateOdaInstanceResponse> createOdaInstance(
            CreateOdaInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOdaInstanceRequest, CreateOdaInstanceResponse>
                    handler);

    /**
     * Starts an asynchronous job to delete the specified Digital Assistant instance.
     * To monitor the status of the job, take the `opc-work-request-id` response header value and use it to call `GET /workRequests/{workRequestID}`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOdaInstanceResponse> deleteOdaInstance(
            DeleteOdaInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOdaInstanceRequest, DeleteOdaInstanceResponse>
                    handler);

    /**
     * Gets the specified Digital Assistant instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetOdaInstanceResponse> getOdaInstance(
            GetOdaInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetOdaInstanceRequest, GetOdaInstanceResponse>
                    handler);

    /**
     * Gets information about the work request with the specified ID, including its status.
     * <p>
     * You can use this operation to monitor the status of jobs that you
     * requested to create, delete, and update instances.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Returns a page of Digital Assistant instances that belong to the specified
     * compartment.
     * <p>
     * If the `opc-next-page` header appears in the response, then
     * there are more items to retrieve. To get the next page in the subsequent
     * GET request, include the header's value as the `page` query parameter.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListOdaInstancesResponse> listOdaInstances(
            ListOdaInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListOdaInstancesRequest, ListOdaInstancesResponse>
                    handler);

    /**
     * Returns a page of errors for the specified work request.
     * <p>
     * If the `opc-next-page` header appears in the response, then
     * there are more items to retrieve. To get the next page in the subsequent
     * GET request, include the header's value as the `page` query parameter.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Returns a page of of log messages for a given work request.
     * <p>
     * If the `opc-next-page` header appears in the response, then
     * there are more items to retrieve. To get the next page in the subsequent
     * GET request, include the header's value as the `page` query parameter.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Returns a page of work requests for the specified compartment.
     * <p>
     * If the `opc-next-page` header appears in the response, then
     * there are more items to retrieve. To get the next page in the subsequent
     * GET request, include the header's value as the `page` query parameter.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Updates the specified Digital Assistant instance with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOdaInstanceResponse> updateOdaInstance(
            UpdateOdaInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOdaInstanceRequest, UpdateOdaInstanceResponse>
                    handler);
}
