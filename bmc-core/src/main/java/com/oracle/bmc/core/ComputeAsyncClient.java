/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.*;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.*;
import com.oracle.bmc.http.signing.*;
import com.oracle.bmc.http.signing.internal.*;
import com.oracle.bmc.responses.*;
import com.oracle.bmc.util.internal.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import java.util.concurrent.Future;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.oracle.bmc.*;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class ComputeAsyncClient implements ComputeAsync {
    /**
     * Service instance for Compute.
     */
    public static final Service SERVICE = Services.create("COMPUTE", "iaas");

    @Getter(value = AccessLevel.PACKAGE)
    private final RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public ComputeAsyncClient(BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ComputeAsyncClient(
            BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public ComputeAsyncClient(
            BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new DefaultRequestSignerFactory(SigningStrategy.STANDARD));
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param requestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public ComputeAsyncClient(
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator,
            RequestSignerFactory requestSignerFactory) {
        RestClientFactory restClientFactory =
                RestClientFactoryBuilder.builder().clientConfigurator(clientConfigurator).build();
        RequestSigner requestSigner =
                requestSignerFactory.createRequestSigner(SERVICE, authenticationDetailsProvider);
        this.client = restClientFactory.create(requestSigner, configuration);
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
    }

    @Override
    public void setRegion(Region region) {
        Optional<String> endpoint = region.getEndpoint(SERVICE);
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + SERVICE + " is not known in region " + region);
        }
    }

    @Override
    public void setRegion(String regionId) {
        regionId = regionId.toLowerCase();
        try {
            Region region = Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public Future<AttachVolumeResponse> attachVolume(
            AttachVolumeRequest request,
            AsyncHandler<AttachVolumeRequest, AttachVolumeResponse> handler) {
        LOG.trace("Called async attachVolume");
        request = AttachVolumeConverter.interceptRequest(request);
        Invocation.Builder ib = AttachVolumeConverter.fromRequest(client, request);
        Function<Response, AttachVolumeResponse> transformer = AttachVolumeConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getAttachVolumeDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CaptureConsoleHistoryResponse> captureConsoleHistory(
            CaptureConsoleHistoryRequest request,
            AsyncHandler<CaptureConsoleHistoryRequest, CaptureConsoleHistoryResponse> handler) {
        LOG.trace("Called async captureConsoleHistory");
        request = CaptureConsoleHistoryConverter.interceptRequest(request);
        Invocation.Builder ib = CaptureConsoleHistoryConverter.fromRequest(client, request);
        Function<Response, CaptureConsoleHistoryResponse> transformer =
                CaptureConsoleHistoryConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(
                        ib, request.getCaptureConsoleHistoryDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateImageResponse> createImage(
            CreateImageRequest request,
            AsyncHandler<CreateImageRequest, CreateImageResponse> handler) {
        LOG.trace("Called async createImage");
        request = CreateImageConverter.interceptRequest(request);
        Invocation.Builder ib = CreateImageConverter.fromRequest(client, request);
        Function<Response, CreateImageResponse> transformer = CreateImageConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateImageDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteConsoleHistoryResponse> deleteConsoleHistory(
            DeleteConsoleHistoryRequest request,
            AsyncHandler<DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse> handler) {
        LOG.trace("Called async deleteConsoleHistory");
        request = DeleteConsoleHistoryConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteConsoleHistoryConverter.fromRequest(client, request);
        Function<Response, DeleteConsoleHistoryResponse> transformer =
                DeleteConsoleHistoryConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteImageResponse> deleteImage(
            DeleteImageRequest request,
            AsyncHandler<DeleteImageRequest, DeleteImageResponse> handler) {
        LOG.trace("Called async deleteImage");
        request = DeleteImageConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteImageConverter.fromRequest(client, request);
        Function<Response, DeleteImageResponse> transformer = DeleteImageConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DetachVolumeResponse> detachVolume(
            DetachVolumeRequest request,
            AsyncHandler<DetachVolumeRequest, DetachVolumeResponse> handler) {
        LOG.trace("Called async detachVolume");
        request = DetachVolumeConverter.interceptRequest(request);
        Invocation.Builder ib = DetachVolumeConverter.fromRequest(client, request);
        Function<Response, DetachVolumeResponse> transformer = DetachVolumeConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetConsoleHistoryResponse> getConsoleHistory(
            GetConsoleHistoryRequest request,
            AsyncHandler<GetConsoleHistoryRequest, GetConsoleHistoryResponse> handler) {
        LOG.trace("Called async getConsoleHistory");
        request = GetConsoleHistoryConverter.interceptRequest(request);
        Invocation.Builder ib = GetConsoleHistoryConverter.fromRequest(client, request);
        Function<Response, GetConsoleHistoryResponse> transformer =
                GetConsoleHistoryConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetConsoleHistoryContentResponse> getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request,
            AsyncHandler<GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>
                    handler) {
        LOG.trace("Called async getConsoleHistoryContent");
        request = GetConsoleHistoryContentConverter.interceptRequest(request);
        Invocation.Builder ib = GetConsoleHistoryContentConverter.fromRequest(client, request);
        Function<Response, GetConsoleHistoryContentResponse> transformer =
                GetConsoleHistoryContentConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetImageResponse> getImage(
            GetImageRequest request, AsyncHandler<GetImageRequest, GetImageResponse> handler) {
        LOG.trace("Called async getImage");
        request = GetImageConverter.interceptRequest(request);
        Invocation.Builder ib = GetImageConverter.fromRequest(client, request);
        Function<Response, GetImageResponse> transformer = GetImageConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetInstanceResponse> getInstance(
            GetInstanceRequest request,
            AsyncHandler<GetInstanceRequest, GetInstanceResponse> handler) {
        LOG.trace("Called async getInstance");
        request = GetInstanceConverter.interceptRequest(request);
        Invocation.Builder ib = GetInstanceConverter.fromRequest(client, request);
        Function<Response, GetInstanceResponse> transformer = GetInstanceConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetVolumeAttachmentResponse> getVolumeAttachment(
            GetVolumeAttachmentRequest request,
            AsyncHandler<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse> handler) {
        LOG.trace("Called async getVolumeAttachment");
        request = GetVolumeAttachmentConverter.interceptRequest(request);
        Invocation.Builder ib = GetVolumeAttachmentConverter.fromRequest(client, request);
        Function<Response, GetVolumeAttachmentResponse> transformer =
                GetVolumeAttachmentConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetWindowsInstanceInitialCredentialsResponse>
            getWindowsInstanceInitialCredentials(
                    GetWindowsInstanceInitialCredentialsRequest request,
                    AsyncHandler<
                                    GetWindowsInstanceInitialCredentialsRequest,
                                    GetWindowsInstanceInitialCredentialsResponse>
                            handler) {
        LOG.trace("Called async getWindowsInstanceInitialCredentials");
        request = GetWindowsInstanceInitialCredentialsConverter.interceptRequest(request);
        Invocation.Builder ib =
                GetWindowsInstanceInitialCredentialsConverter.fromRequest(client, request);
        Function<Response, GetWindowsInstanceInitialCredentialsResponse> transformer =
                GetWindowsInstanceInitialCredentialsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<InstanceActionResponse> instanceAction(
            InstanceActionRequest request,
            AsyncHandler<InstanceActionRequest, InstanceActionResponse> handler) {
        LOG.trace("Called async instanceAction");
        request = InstanceActionConverter.interceptRequest(request);
        Invocation.Builder ib = InstanceActionConverter.fromRequest(client, request);
        Function<Response, InstanceActionResponse> transformer =
                InstanceActionConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.post(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<LaunchInstanceResponse> launchInstance(
            LaunchInstanceRequest request,
            AsyncHandler<LaunchInstanceRequest, LaunchInstanceResponse> handler) {
        LOG.trace("Called async launchInstance");
        request = LaunchInstanceConverter.interceptRequest(request);
        Invocation.Builder ib = LaunchInstanceConverter.fromRequest(client, request);
        Function<Response, LaunchInstanceResponse> transformer =
                LaunchInstanceConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getLaunchInstanceDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListConsoleHistoriesResponse> listConsoleHistories(
            ListConsoleHistoriesRequest request,
            AsyncHandler<ListConsoleHistoriesRequest, ListConsoleHistoriesResponse> handler) {
        LOG.trace("Called async listConsoleHistories");
        request = ListConsoleHistoriesConverter.interceptRequest(request);
        Invocation.Builder ib = ListConsoleHistoriesConverter.fromRequest(client, request);
        Function<Response, ListConsoleHistoriesResponse> transformer =
                ListConsoleHistoriesConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListImagesResponse> listImages(
            ListImagesRequest request,
            AsyncHandler<ListImagesRequest, ListImagesResponse> handler) {
        LOG.trace("Called async listImages");
        request = ListImagesConverter.interceptRequest(request);
        Invocation.Builder ib = ListImagesConverter.fromRequest(client, request);
        Function<Response, ListImagesResponse> transformer = ListImagesConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListInstancesResponse> listInstances(
            ListInstancesRequest request,
            AsyncHandler<ListInstancesRequest, ListInstancesResponse> handler) {
        LOG.trace("Called async listInstances");
        request = ListInstancesConverter.interceptRequest(request);
        Invocation.Builder ib = ListInstancesConverter.fromRequest(client, request);
        Function<Response, ListInstancesResponse> transformer =
                ListInstancesConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            AsyncHandler<ListShapesRequest, ListShapesResponse> handler) {
        LOG.trace("Called async listShapes");
        request = ListShapesConverter.interceptRequest(request);
        Invocation.Builder ib = ListShapesConverter.fromRequest(client, request);
        Function<Response, ListShapesResponse> transformer = ListShapesConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListVnicAttachmentsResponse> listVnicAttachments(
            ListVnicAttachmentsRequest request,
            AsyncHandler<ListVnicAttachmentsRequest, ListVnicAttachmentsResponse> handler) {
        LOG.trace("Called async listVnicAttachments");
        request = ListVnicAttachmentsConverter.interceptRequest(request);
        Invocation.Builder ib = ListVnicAttachmentsConverter.fromRequest(client, request);
        Function<Response, ListVnicAttachmentsResponse> transformer =
                ListVnicAttachmentsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListVolumeAttachmentsResponse> listVolumeAttachments(
            ListVolumeAttachmentsRequest request,
            AsyncHandler<ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse> handler) {
        LOG.trace("Called async listVolumeAttachments");
        request = ListVolumeAttachmentsConverter.interceptRequest(request);
        Invocation.Builder ib = ListVolumeAttachmentsConverter.fromRequest(client, request);
        Function<Response, ListVolumeAttachmentsResponse> transformer =
                ListVolumeAttachmentsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<TerminateInstanceResponse> terminateInstance(
            TerminateInstanceRequest request,
            AsyncHandler<TerminateInstanceRequest, TerminateInstanceResponse> handler) {
        LOG.trace("Called async terminateInstance");
        request = TerminateInstanceConverter.interceptRequest(request);
        Invocation.Builder ib = TerminateInstanceConverter.fromRequest(client, request);
        Function<Response, TerminateInstanceResponse> transformer =
                TerminateInstanceConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateImageResponse> updateImage(
            UpdateImageRequest request,
            AsyncHandler<UpdateImageRequest, UpdateImageResponse> handler) {
        LOG.trace("Called async updateImage");
        request = UpdateImageConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateImageConverter.fromRequest(client, request);
        Function<Response, UpdateImageResponse> transformer = UpdateImageConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateImageDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateInstanceResponse> updateInstance(
            UpdateInstanceRequest request,
            AsyncHandler<UpdateInstanceRequest, UpdateInstanceResponse> handler) {
        LOG.trace("Called async updateInstance");
        request = UpdateInstanceConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateInstanceConverter.fromRequest(client, request);
        Function<Response, UpdateInstanceResponse> transformer =
                UpdateInstanceConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUpdateInstanceDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }
}
