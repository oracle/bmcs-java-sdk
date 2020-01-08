/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface ComputeAsync extends AutoCloseable {

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
     * Adds a shape to the compatible shapes list for the image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddImageShapeCompatibilityEntryResponse>
            addImageShapeCompatibilityEntry(
                    AddImageShapeCompatibilityEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddImageShapeCompatibilityEntryRequest,
                                    AddImageShapeCompatibilityEntryResponse>
                            handler);

    /**
     * Attaches the specified boot volume to the specified instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachBootVolumeResponse> attachBootVolume(
            AttachBootVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<AttachBootVolumeRequest, AttachBootVolumeResponse>
                    handler);

    /**
     * Creates a secondary VNIC and attaches it to the specified instance.
     * For more information about secondary VNICs, see
     * [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/Content/Network/Tasks/managingVNICs.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachVnicResponse> attachVnic(
            AttachVnicRequest request,
            com.oracle.bmc.responses.AsyncHandler<AttachVnicRequest, AttachVnicResponse> handler);

    /**
     * Attaches the specified storage volume to the specified instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachVolumeResponse> attachVolume(
            AttachVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<AttachVolumeRequest, AttachVolumeResponse>
                    handler);

    /**
     * Captures the most recent serial console data (up to a megabyte) for the
     * specified instance.
     * <p>
     * The `CaptureConsoleHistory` operation works with the other console history operations
     * as described below.
     * <p>
     * 1. Use `CaptureConsoleHistory` to request the capture of up to a megabyte of the
     * most recent console history. This call returns a `ConsoleHistory`
     * object. The object will have a state of REQUESTED.
     * 2. Wait for the capture operation to succeed by polling `GetConsoleHistory` with
     * the identifier of the console history metadata. The state of the
     * `ConsoleHistory` object will go from REQUESTED to GETTING-HISTORY and
     * then SUCCEEDED (or FAILED).
     * 3. Use `GetConsoleHistoryContent` to get the actual console history data (not the
     * metadata).
     * 4. Optionally, use `DeleteConsoleHistory` to delete the console history metadata
     * and the console history data.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CaptureConsoleHistoryResponse> captureConsoleHistory(
            CaptureConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CaptureConsoleHistoryRequest, CaptureConsoleHistoryResponse>
                    handler);

    /**
     * Moves a dedicated virtual machine host from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDedicatedVmHostCompartmentResponse>
            changeDedicatedVmHostCompartment(
                    ChangeDedicatedVmHostCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDedicatedVmHostCompartmentRequest,
                                    ChangeDedicatedVmHostCompartmentResponse>
                            handler);

    /**
     * Moves an image into a different compartment within the same tenancy. For information about moving
     * resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeImageCompartmentResponse> changeImageCompartment(
            ChangeImageCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeImageCompartmentRequest, ChangeImageCompartmentResponse>
                    handler);

    /**
     * Moves an instance into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * When you move an instance to a different compartment, associated resources such as boot volumes and VNICs
     * are not moved.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeInstanceCompartmentResponse> changeInstanceCompartment(
            ChangeInstanceCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeInstanceCompartmentRequest, ChangeInstanceCompartmentResponse>
                    handler);

    /**
     * Create a subscription for listing resource version for a compartment. It will take some time to propagate to all regions.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAppCatalogSubscriptionResponse> createAppCatalogSubscription(
            CreateAppCatalogSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAppCatalogSubscriptionRequest,
                            CreateAppCatalogSubscriptionResponse>
                    handler);

    /**
     * Creates a new dedicated virtual machine host in the specified compartment and the specified availability domain.
     * Dedicated virtual machine hosts enable you to run your Compute virtual machine (VM) instances on dedicated servers
     * that are a single tenant and not shared with other customers.
     * For more information, see [Dedicated Virtual Machine Hosts](https://docs.cloud.oracle.com/iaas/Content/Compute/Concepts/dedicatedvmhosts.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDedicatedVmHostResponse> createDedicatedVmHost(
            CreateDedicatedVmHostRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDedicatedVmHostRequest, CreateDedicatedVmHostResponse>
                    handler);

    /**
     * Creates a boot disk image for the specified instance or imports an exported image from the Oracle Cloud Infrastructure Object Storage service.
     * <p>
     * When creating a new image, you must provide the OCID of the instance you want to use as the basis for the image, and
     * the OCID of the compartment containing that instance. For more information about images,
     * see [Managing Custom Images](https://docs.cloud.oracle.com/Content/Compute/Tasks/managingcustomimages.htm).
     * <p>
     * When importing an exported image from Object Storage, you specify the source information
     * in {@link #imageSourceDetails(ImageSourceDetailsRequest, Consumer, Consumer) imageSourceDetails}.
     * <p>
     * When importing an image based on the namespace, bucket name, and object name,
     * use {@link #imageSourceViaObjectStorageTupleDetails(ImageSourceViaObjectStorageTupleDetailsRequest, Consumer, Consumer) imageSourceViaObjectStorageTupleDetails}.
     * <p>
     * When importing an image based on the Object Storage URL, use
     * {@link #imageSourceViaObjectStorageUriDetails(ImageSourceViaObjectStorageUriDetailsRequest, Consumer, Consumer) imageSourceViaObjectStorageUriDetails}.
     * See [Object Storage URLs](https://docs.cloud.oracle.com/Content/Compute/Tasks/imageimportexport.htm#URLs) and [Using Pre-Authenticated Requests](https://docs.cloud.oracle.com/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for constructing URLs for image import/export.
     * <p>
     * For more information about importing exported images, see
     * [Image Import/Export](https://docs.cloud.oracle.com/Content/Compute/Tasks/imageimportexport.htm).
     * <p>
     * You may optionally specify a *display name* for the image, which is simply a friendly name or description.
     * It does not have to be unique, and you can change it. See {@link #updateImage(UpdateImageRequest, Consumer, Consumer) updateImage}.
     * Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateImageResponse> createImage(
            CreateImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateImageRequest, CreateImageResponse> handler);

    /**
     * Creates a new console connection to the specified instance.
     * After the console connection has been created and is available,
     * you connect to the console using SSH.
     * <p>
     * For more information about console access, see [Accessing the Console](https://docs.cloud.oracle.com/Content/Compute/References/serialconsole.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateInstanceConsoleConnectionResponse>
            createInstanceConsoleConnection(
                    CreateInstanceConsoleConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateInstanceConsoleConnectionRequest,
                                    CreateInstanceConsoleConnectionResponse>
                            handler);

    /**
     * Delete a subscription for a listing resource version for a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAppCatalogSubscriptionResponse> deleteAppCatalogSubscription(
            DeleteAppCatalogSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAppCatalogSubscriptionRequest,
                            DeleteAppCatalogSubscriptionResponse>
                    handler);

    /**
     * Deletes the specified console history metadata and the console history data.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConsoleHistoryResponse> deleteConsoleHistory(
            DeleteConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse>
                    handler);

    /**
     * Deletes the specified dedicated virtual machine host.
     * <p>
     * If any VM instances are assigned to the dedicated virtual machine host,
     * the delete operation will fail and the service will return a 409 response code.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDedicatedVmHostResponse> deleteDedicatedVmHost(
            DeleteDedicatedVmHostRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDedicatedVmHostRequest, DeleteDedicatedVmHostResponse>
                    handler);

    /**
     * Deletes an image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteImageResponse> deleteImage(
            DeleteImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteImageRequest, DeleteImageResponse> handler);

    /**
     * Deletes the specified instance console connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteInstanceConsoleConnectionResponse>
            deleteInstanceConsoleConnection(
                    DeleteInstanceConsoleConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteInstanceConsoleConnectionRequest,
                                    DeleteInstanceConsoleConnectionResponse>
                            handler);

    /**
     * Detaches a boot volume from an instance. You must specify the OCID of the boot volume attachment.
     * <p>
     * This is an asynchronous operation. The attachment's `lifecycleState` will change to DETACHING temporarily
     * until the attachment is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachBootVolumeResponse> detachBootVolume(
            DetachBootVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DetachBootVolumeRequest, DetachBootVolumeResponse>
                    handler);

    /**
     * Detaches and deletes the specified secondary VNIC.
     * This operation cannot be used on the instance's primary VNIC.
     * When you terminate an instance, all attached VNICs (primary
     * and secondary) are automatically detached and deleted.
     * <p>
     **Important:** If the VNIC has a
     * {@link PrivateIp} that is the
     * [target of a route rule](https://docs.cloud.oracle.com/Content/Network/Tasks/managingroutetables.htm#privateip),
     * deleting the VNIC causes that route rule to blackhole and the traffic
     * will be dropped.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachVnicResponse> detachVnic(
            DetachVnicRequest request,
            com.oracle.bmc.responses.AsyncHandler<DetachVnicRequest, DetachVnicResponse> handler);

    /**
     * Detaches a storage volume from an instance. You must specify the OCID of the volume attachment.
     * <p>
     * This is an asynchronous operation. The attachment's `lifecycleState` will change to DETACHING temporarily
     * until the attachment is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachVolumeResponse> detachVolume(
            DetachVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DetachVolumeRequest, DetachVolumeResponse>
                    handler);

    /**
     * Exports the specified image to the Oracle Cloud Infrastructure Object Storage service. You can use the Object Storage URL,
     * or the namespace, bucket name, and object name when specifying the location to export to.
     * <p>
     * For more information about exporting images, see [Image Import/Export](https://docs.cloud.oracle.com/Content/Compute/Tasks/imageimportexport.htm).
     * <p>
     * To perform an image export, you need write access to the Object Storage bucket for the image,
     * see [Let Users Write Objects to Object Storage Buckets](https://docs.cloud.oracle.com/Content/Identity/Concepts/commonpolicies.htm#Let4).
     * <p>
     * See [Object Storage URLs](https://docs.cloud.oracle.com/Content/Compute/Tasks/imageimportexport.htm#URLs) and [Using Pre-Authenticated Requests](https://docs.cloud.oracle.com/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for constructing URLs for image import/export.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExportImageResponse> exportImage(
            ExportImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<ExportImageRequest, ExportImageResponse> handler);

    /**
     * Gets the specified listing.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAppCatalogListingResponse> getAppCatalogListing(
            GetAppCatalogListingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAppCatalogListingRequest, GetAppCatalogListingResponse>
                    handler);

    /**
     * Retrieves the agreements for a particular resource version of a listing.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAppCatalogListingAgreementsResponse>
            getAppCatalogListingAgreements(
                    GetAppCatalogListingAgreementsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAppCatalogListingAgreementsRequest,
                                    GetAppCatalogListingAgreementsResponse>
                            handler);

    /**
     * Gets the specified listing resource version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAppCatalogListingResourceVersionResponse>
            getAppCatalogListingResourceVersion(
                    GetAppCatalogListingResourceVersionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAppCatalogListingResourceVersionRequest,
                                    GetAppCatalogListingResourceVersionResponse>
                            handler);

    /**
     * Gets information about the specified boot volume attachment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetBootVolumeAttachmentResponse> getBootVolumeAttachment(
            GetBootVolumeAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
                    handler);

    /**
     * Shows the metadata for the specified console history.
     * See {@link #captureConsoleHistory(CaptureConsoleHistoryRequest, Consumer, Consumer) captureConsoleHistory}
     * for details about using the console history operations.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConsoleHistoryResponse> getConsoleHistory(
            GetConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleHistoryRequest, GetConsoleHistoryResponse>
                    handler);

    /**
     * Gets the actual console history data (not the metadata).
     * See {@link #captureConsoleHistory(CaptureConsoleHistoryRequest, Consumer, Consumer) captureConsoleHistory}
     * for details about using the console history operations.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConsoleHistoryContentResponse> getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>
                    handler);

    /**
     * Gets information about the specified dedicated virtual machine host.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDedicatedVmHostResponse> getDedicatedVmHost(
            GetDedicatedVmHostRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>
                    handler);

    /**
     * Gets the specified image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetImageResponse> getImage(
            GetImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetImageRequest, GetImageResponse> handler);

    /**
     * Gets information about the specified instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetInstanceResponse> getInstance(
            GetInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetInstanceRequest, GetInstanceResponse> handler);

    /**
     * Gets the specified instance console connection's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetInstanceConsoleConnectionResponse> getInstanceConsoleConnection(
            GetInstanceConsoleConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetInstanceConsoleConnectionRequest,
                            GetInstanceConsoleConnectionResponse>
                    handler);

    /**
     * Gets the information for the specified VNIC attachment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVnicAttachmentResponse> getVnicAttachment(
            GetVnicAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVnicAttachmentRequest, GetVnicAttachmentResponse>
                    handler);

    /**
     * Gets information about the specified volume attachment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeAttachmentResponse> getVolumeAttachment(
            GetVolumeAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
                    handler);

    /**
     * Gets the generated credentials for the instance. Only works for instances that require password to log in (E.g. Windows).
     * For certain OS'es, users will be forced to change the initial credentials.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWindowsInstanceInitialCredentialsResponse>
            getWindowsInstanceInitialCredentials(
                    GetWindowsInstanceInitialCredentialsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetWindowsInstanceInitialCredentialsRequest,
                                    GetWindowsInstanceInitialCredentialsResponse>
                            handler);

    /**
     * Performs one of the following power actions on the specified instance:
     * <p>
     * - **START** - Powers on the instance.
     * <p>
     * - **STOP** - Powers off the instance.
     * <p>
     * - **SOFTRESET** - Gracefully reboots instance by sending a shutdown command to the operating system and then powers the instance back on.
     * <p>
     * - **SOFTSTOP** - Gracefully shuts down instance by sending a shutdown command to the operating system.
     * <p>
     * - **RESET** - Powers off the instance and then powers it back on.
     * <p>
     * For more information see [Stopping and Starting an Instance](https://docs.cloud.oracle.com/Content/Compute/Tasks/restartinginstance.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<InstanceActionResponse> instanceAction(
            InstanceActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<InstanceActionRequest, InstanceActionResponse>
                    handler);

    /**
     * Creates a new instance in the specified compartment and the specified availability domain.
     * For general information about instances, see
     * [Overview of the Compute Service](https://docs.cloud.oracle.com/Content/Compute/Concepts/computeoverview.htm).
     * <p>
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * For information about availability domains, see
     * [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm).
     * To get a list of availability domains, use the `ListAvailabilityDomains` operation
     * in the Identity and Access Management Service API.
     * <p>
     * All Oracle Cloud Infrastructure resources, including instances, get an Oracle-assigned,
     * unique ID called an Oracle Cloud Identifier (OCID).
     * When you create a resource, you can find its OCID in the response. You can
     * also retrieve a resource's OCID by using a List API operation
     * on that resource type, or by viewing the resource in the Console.
     * <p>
     * To launch an instance using an image or a boot volume use the `sourceDetails` parameter in {@link LaunchInstanceDetails}.
     * <p>
     * When you launch an instance, it is automatically attached to a virtual
     * network interface card (VNIC), called the *primary VNIC*. The VNIC
     * has a private IP address from the subnet's CIDR. You can either assign a
     * private IP address of your choice or let Oracle automatically assign one.
     * You can choose whether the instance has a public IP address. To retrieve the
     * addresses, use the {@link #listVnicAttachments(ListVnicAttachmentsRequest, Consumer, Consumer) listVnicAttachments}
     * operation to get the VNIC ID for the instance, and then call
     * {@link #getVnic(GetVnicRequest, Consumer, Consumer) getVnic} with the VNIC ID.
     * <p>
     * You can later add secondary VNICs to an instance. For more information, see
     * [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/Content/Network/Tasks/managingVNICs.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<LaunchInstanceResponse> launchInstance(
            LaunchInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<LaunchInstanceRequest, LaunchInstanceResponse>
                    handler);

    /**
     * Gets all resource versions for a particular listing.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAppCatalogListingResourceVersionsResponse>
            listAppCatalogListingResourceVersions(
                    ListAppCatalogListingResourceVersionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAppCatalogListingResourceVersionsRequest,
                                    ListAppCatalogListingResourceVersionsResponse>
                            handler);

    /**
     * Lists the published listings.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAppCatalogListingsResponse> listAppCatalogListings(
            ListAppCatalogListingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>
                    handler);

    /**
     * Lists subscriptions for a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAppCatalogSubscriptionsResponse> listAppCatalogSubscriptions(
            ListAppCatalogSubscriptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAppCatalogSubscriptionsRequest, ListAppCatalogSubscriptionsResponse>
                    handler);

    /**
     * Lists the boot volume attachments in the specified compartment. You can filter the
     * list by specifying an instance OCID, boot volume OCID, or both.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListBootVolumeAttachmentsResponse> listBootVolumeAttachments(
            ListBootVolumeAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBootVolumeAttachmentsRequest, ListBootVolumeAttachmentsResponse>
                    handler);

    /**
     * Lists the console history metadata for the specified compartment or instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListConsoleHistoriesResponse> listConsoleHistories(
            ListConsoleHistoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>
                    handler);

    /**
     * Lists the shapes that can be used to launch a virtual machine instance on a dedicated virtual machine host within the specified compartment.
     * You can filter the list by compatibility with a specific dedicated virtual machine host shape.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDedicatedVmHostInstanceShapesResponse>
            listDedicatedVmHostInstanceShapes(
                    ListDedicatedVmHostInstanceShapesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDedicatedVmHostInstanceShapesRequest,
                                    ListDedicatedVmHostInstanceShapesResponse>
                            handler);

    /**
     * Returns the list of instances on the dedicated virtual machine hosts that match the specified criteria.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDedicatedVmHostInstancesResponse> listDedicatedVmHostInstances(
            ListDedicatedVmHostInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedVmHostInstancesRequest,
                            ListDedicatedVmHostInstancesResponse>
                    handler);

    /**
     * Lists the shapes that can be used to launch a dedicated virtual machine host within the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDedicatedVmHostShapesResponse> listDedicatedVmHostShapes(
            ListDedicatedVmHostShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedVmHostShapesRequest, ListDedicatedVmHostShapesResponse>
                    handler);

    /**
     * Returns the list of dedicated virtual machine hosts that match the specified criteria in the specified compartment.
     * <p>
     * You can limit the list by specifying a dedicated virtual machine host display name. The list will include all the identically-named
     * dedicated virtual machine hosts in the compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDedicatedVmHostsResponse> listDedicatedVmHosts(
            ListDedicatedVmHostsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedVmHostsRequest, ListDedicatedVmHostsResponse>
                    handler);

    /**
     * Lists the available images in the specified compartment, including both
     * [Oracle-provided images](https://docs.cloud.oracle.com/Content/Compute/References/images.htm) and
     * [custom images](https://docs.cloud.oracle.com/Content/Compute/Tasks/managingcustomimages.htm) that have
     * been created. The list of images returned is ordered to first show all
     * Oracle-provided images, then all custom images.
     * <p>
     * The order of images returned may change when new images are released.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListImagesResponse> listImages(
            ListImagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListImagesRequest, ListImagesResponse> handler);

    /**
     * Lists the console connections for the specified compartment or instance.
     * <p>
     * For more information about console access, see [Accessing the Console](https://docs.cloud.oracle.com/Content/Compute/References/serialconsole.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListInstanceConsoleConnectionsResponse>
            listInstanceConsoleConnections(
                    ListInstanceConsoleConnectionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListInstanceConsoleConnectionsRequest,
                                    ListInstanceConsoleConnectionsResponse>
                            handler);

    /**
     * Gets a list of all the devices for given instance. You can optionally filter results by device availability.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListInstanceDevicesResponse> listInstanceDevices(
            ListInstanceDevicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListInstanceDevicesRequest, ListInstanceDevicesResponse>
                    handler);

    /**
     * Lists the instances in the specified compartment and the specified availability domain.
     * You can filter the results by specifying an instance name (the list will include all the identically-named
     * instances in the compartment).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListInstancesResponse> listInstances(
            ListInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListInstancesRequest, ListInstancesResponse>
                    handler);

    /**
     * Lists the shapes that can be used to launch an instance within the specified compartment. You can
     * filter the list by compatibility with a specific image.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse> handler);

    /**
     * Lists the VNIC attachments in the specified compartment. A VNIC attachment
     * resides in the same compartment as the attached instance. The list can be
     * filtered by instance, VNIC, or availability domain.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVnicAttachmentsResponse> listVnicAttachments(
            ListVnicAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>
                    handler);

    /**
     * Lists the volume attachments in the specified compartment. You can filter the
     * list by specifying an instance OCID, volume OCID, or both.
     * <p>
     * Currently, the only supported volume attachment type are {@link IScsiVolumeAttachment} and
     * {@link ParavirtualizedVolumeAttachment}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVolumeAttachmentsResponse> listVolumeAttachments(
            ListVolumeAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>
                    handler);

    /**
     * Removes a shape from the compatible shapes list for the image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveImageShapeCompatibilityEntryResponse>
            removeImageShapeCompatibilityEntry(
                    RemoveImageShapeCompatibilityEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveImageShapeCompatibilityEntryRequest,
                                    RemoveImageShapeCompatibilityEntryResponse>
                            handler);

    /**
     * Terminates the specified instance. Any attached VNICs and volumes are automatically detached
     * when the instance terminates.
     * <p>
     * To preserve the boot volume associated with the instance, specify `true` for `PreserveBootVolumeQueryParam`.
     * To delete the boot volume when the instance is deleted, specify `false` or do not specify a value for `PreserveBootVolumeQueryParam`.
     * <p>
     * This is an asynchronous operation. The instance's `lifecycleState` will change to TERMINATING temporarily
     * until the instance is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<TerminateInstanceResponse> terminateInstance(
            TerminateInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            TerminateInstanceRequest, TerminateInstanceResponse>
                    handler);

    /**
     * Updates the specified console history metadata.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConsoleHistoryResponse> updateConsoleHistory(
            UpdateConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateConsoleHistoryRequest, UpdateConsoleHistoryResponse>
                    handler);

    /**
     * Updates the displayName, freeformTags, and definedTags attributes for the specified dedicated virtual machine host.
     * If an attribute value is not included, it will not be updated.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDedicatedVmHostResponse> updateDedicatedVmHost(
            UpdateDedicatedVmHostRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDedicatedVmHostRequest, UpdateDedicatedVmHostResponse>
                    handler);

    /**
     * Updates the display name of the image. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateImageResponse> updateImage(
            UpdateImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateImageRequest, UpdateImageResponse> handler);

    /**
     * Updates certain fields on the specified instance. Fields that are not provided in the
     * request will not be updated. Avoid entering confidential information.
     * <p>
     * Changes to metadata fields will be reflected in the instance metadata service (this may take
     * up to a minute).
     * <p>
     * The OCID of the instance remains the same.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateInstanceResponse> updateInstance(
            UpdateInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateInstanceRequest, UpdateInstanceResponse>
                    handler);
}
