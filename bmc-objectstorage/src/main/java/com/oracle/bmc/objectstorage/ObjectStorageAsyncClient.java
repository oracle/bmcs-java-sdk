/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage;

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

import com.oracle.bmc.objectstorage.internal.http.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

import com.oracle.bmc.*;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class ObjectStorageAsyncClient implements ObjectStorageAsync {
    /**
     * Service instance for ObjectStorage.
     */
    public static final Service SERVICE = Services.create("OBJECTSTORAGE", "objectstorage");

    @Getter(value = AccessLevel.PACKAGE)
    private final RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public ObjectStorageAsyncClient(
            BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ObjectStorageAsyncClient(
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
    public ObjectStorageAsyncClient(
            BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new DefaultRequestSignerFactory(SigningStrategy.OBJECT_STORAGE));
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
    public ObjectStorageAsyncClient(
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
    public Future<AbortMultipartUploadResponse> abortMultipartUpload(
            AbortMultipartUploadRequest request,
            AsyncHandler<AbortMultipartUploadRequest, AbortMultipartUploadResponse> handler) {
        LOG.trace("Called async abortMultipartUpload");
        request = AbortMultipartUploadConverter.interceptRequest(request);
        Invocation.Builder ib = AbortMultipartUploadConverter.fromRequest(client, request);
        Function<Response, AbortMultipartUploadResponse> transformer =
                AbortMultipartUploadConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CommitMultipartUploadResponse> commitMultipartUpload(
            CommitMultipartUploadRequest request,
            AsyncHandler<CommitMultipartUploadRequest, CommitMultipartUploadResponse> handler) {
        LOG.trace("Called async commitMultipartUpload");
        request = CommitMultipartUploadConverter.interceptRequest(request);
        Invocation.Builder ib = CommitMultipartUploadConverter.fromRequest(client, request);
        Function<Response, CommitMultipartUploadResponse> transformer =
                CommitMultipartUploadConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(
                        ib, request.getCommitMultipartUploadDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateBucketResponse> createBucket(
            CreateBucketRequest request,
            AsyncHandler<CreateBucketRequest, CreateBucketResponse> handler) {
        LOG.trace("Called async createBucket");
        request = CreateBucketConverter.interceptRequest(request);
        Invocation.Builder ib = CreateBucketConverter.fromRequest(client, request);
        Function<Response, CreateBucketResponse> transformer = CreateBucketConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getCreateBucketDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreateMultipartUploadResponse> createMultipartUpload(
            CreateMultipartUploadRequest request,
            AsyncHandler<CreateMultipartUploadRequest, CreateMultipartUploadResponse> handler) {
        LOG.trace("Called async createMultipartUpload");
        request = CreateMultipartUploadConverter.interceptRequest(request);
        Invocation.Builder ib = CreateMultipartUploadConverter.fromRequest(client, request);
        Function<Response, CreateMultipartUploadResponse> transformer =
                CreateMultipartUploadConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(
                        ib, request.getCreateMultipartUploadDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<CreatePreauthenticatedRequestResponse> createPreauthenticatedRequest(
            CreatePreauthenticatedRequestRequest request,
            AsyncHandler<
                            CreatePreauthenticatedRequestRequest,
                            CreatePreauthenticatedRequestResponse>
                    handler) {
        LOG.trace("Called async createPreauthenticatedRequest");
        request = CreatePreauthenticatedRequestConverter.interceptRequest(request);
        Invocation.Builder ib = CreatePreauthenticatedRequestConverter.fromRequest(client, request);
        Function<Response, CreatePreauthenticatedRequestResponse> transformer =
                CreatePreauthenticatedRequestConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(
                        ib,
                        request.getCreatePreauthenticatedRequestDetails(),
                        request,
                        onSuccess,
                        onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteBucketResponse> deleteBucket(
            DeleteBucketRequest request,
            AsyncHandler<DeleteBucketRequest, DeleteBucketResponse> handler) {
        LOG.trace("Called async deleteBucket");
        request = DeleteBucketConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteBucketConverter.fromRequest(client, request);
        Function<Response, DeleteBucketResponse> transformer = DeleteBucketConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeleteObjectResponse> deleteObject(
            DeleteObjectRequest request,
            AsyncHandler<DeleteObjectRequest, DeleteObjectResponse> handler) {
        LOG.trace("Called async deleteObject");
        request = DeleteObjectConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteObjectConverter.fromRequest(client, request);
        Function<Response, DeleteObjectResponse> transformer = DeleteObjectConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<DeletePreauthenticatedRequestResponse> deletePreauthenticatedRequest(
            DeletePreauthenticatedRequestRequest request,
            AsyncHandler<
                            DeletePreauthenticatedRequestRequest,
                            DeletePreauthenticatedRequestResponse>
                    handler) {
        LOG.trace("Called async deletePreauthenticatedRequest");
        request = DeletePreauthenticatedRequestConverter.interceptRequest(request);
        Invocation.Builder ib = DeletePreauthenticatedRequestConverter.fromRequest(client, request);
        Function<Response, DeletePreauthenticatedRequestResponse> transformer =
                DeletePreauthenticatedRequestConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.delete(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetBucketResponse> getBucket(
            GetBucketRequest request, AsyncHandler<GetBucketRequest, GetBucketResponse> handler) {
        LOG.trace("Called async getBucket");
        request = GetBucketConverter.interceptRequest(request);
        Invocation.Builder ib = GetBucketConverter.fromRequest(client, request);
        Function<Response, GetBucketResponse> transformer = GetBucketConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetNamespaceResponse> getNamespace(
            GetNamespaceRequest request,
            AsyncHandler<GetNamespaceRequest, GetNamespaceResponse> handler) {
        LOG.trace("Called async getNamespace");
        request = GetNamespaceConverter.interceptRequest(request);
        Invocation.Builder ib = GetNamespaceConverter.fromRequest(client, request);
        Function<Response, GetNamespaceResponse> transformer = GetNamespaceConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetObjectResponse> getObject(
            GetObjectRequest request, AsyncHandler<GetObjectRequest, GetObjectResponse> handler) {
        LOG.trace("Called async getObject");
        request = GetObjectConverter.interceptRequest(request);
        Invocation.Builder ib = GetObjectConverter.fromRequest(client, request);
        Function<Response, GetObjectResponse> transformer = GetObjectConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<GetPreauthenticatedRequestResponse> getPreauthenticatedRequest(
            GetPreauthenticatedRequestRequest request,
            AsyncHandler<GetPreauthenticatedRequestRequest, GetPreauthenticatedRequestResponse>
                    handler) {
        LOG.trace("Called async getPreauthenticatedRequest");
        request = GetPreauthenticatedRequestConverter.interceptRequest(request);
        Invocation.Builder ib = GetPreauthenticatedRequestConverter.fromRequest(client, request);
        Function<Response, GetPreauthenticatedRequestResponse> transformer =
                GetPreauthenticatedRequestConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<HeadBucketResponse> headBucket(
            HeadBucketRequest request,
            AsyncHandler<HeadBucketRequest, HeadBucketResponse> handler) {
        LOG.trace("Called async headBucket");
        request = HeadBucketConverter.interceptRequest(request);
        Invocation.Builder ib = HeadBucketConverter.fromRequest(client, request);
        Function<Response, HeadBucketResponse> transformer = HeadBucketConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.head(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<HeadObjectResponse> headObject(
            HeadObjectRequest request,
            AsyncHandler<HeadObjectRequest, HeadObjectResponse> handler) {
        LOG.trace("Called async headObject");
        request = HeadObjectConverter.interceptRequest(request);
        Invocation.Builder ib = HeadObjectConverter.fromRequest(client, request);
        Function<Response, HeadObjectResponse> transformer = HeadObjectConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.head(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListBucketsResponse> listBuckets(
            ListBucketsRequest request,
            AsyncHandler<ListBucketsRequest, ListBucketsResponse> handler) {
        LOG.trace("Called async listBuckets");
        request = ListBucketsConverter.interceptRequest(request);
        Invocation.Builder ib = ListBucketsConverter.fromRequest(client, request);
        Function<Response, ListBucketsResponse> transformer = ListBucketsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListMultipartUploadPartsResponse> listMultipartUploadParts(
            ListMultipartUploadPartsRequest request,
            AsyncHandler<ListMultipartUploadPartsRequest, ListMultipartUploadPartsResponse>
                    handler) {
        LOG.trace("Called async listMultipartUploadParts");
        request = ListMultipartUploadPartsConverter.interceptRequest(request);
        Invocation.Builder ib = ListMultipartUploadPartsConverter.fromRequest(client, request);
        Function<Response, ListMultipartUploadPartsResponse> transformer =
                ListMultipartUploadPartsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListMultipartUploadsResponse> listMultipartUploads(
            ListMultipartUploadsRequest request,
            AsyncHandler<ListMultipartUploadsRequest, ListMultipartUploadsResponse> handler) {
        LOG.trace("Called async listMultipartUploads");
        request = ListMultipartUploadsConverter.interceptRequest(request);
        Invocation.Builder ib = ListMultipartUploadsConverter.fromRequest(client, request);
        Function<Response, ListMultipartUploadsResponse> transformer =
                ListMultipartUploadsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListObjectsResponse> listObjects(
            ListObjectsRequest request,
            AsyncHandler<ListObjectsRequest, ListObjectsResponse> handler) {
        LOG.trace("Called async listObjects");
        request = ListObjectsConverter.interceptRequest(request);
        Invocation.Builder ib = ListObjectsConverter.fromRequest(client, request);
        Function<Response, ListObjectsResponse> transformer = ListObjectsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<ListPreauthenticatedRequestsResponse> listPreauthenticatedRequests(
            ListPreauthenticatedRequestsRequest request,
            AsyncHandler<ListPreauthenticatedRequestsRequest, ListPreauthenticatedRequestsResponse>
                    handler) {
        LOG.trace("Called async listPreauthenticatedRequests");
        request = ListPreauthenticatedRequestsConverter.interceptRequest(request);
        Invocation.Builder ib = ListPreauthenticatedRequestsConverter.fromRequest(client, request);
        Function<Response, ListPreauthenticatedRequestsResponse> transformer =
                ListPreauthenticatedRequestsConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture = client.get(ib, request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<PutObjectResponse> putObject(
            PutObjectRequest request, AsyncHandler<PutObjectRequest, PutObjectResponse> handler) {
        LOG.trace("Called async putObject");
        request = PutObjectConverter.interceptRequest(request);
        Invocation.Builder ib = PutObjectConverter.fromRequest(client, request);
        Function<Response, PutObjectResponse> transformer = PutObjectConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getPutObjectBody(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UpdateBucketResponse> updateBucket(
            UpdateBucketRequest request,
            AsyncHandler<UpdateBucketRequest, UpdateBucketResponse> handler) {
        LOG.trace("Called async updateBucket");
        request = UpdateBucketConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateBucketConverter.fromRequest(client, request);
        Function<Response, UpdateBucketResponse> transformer = UpdateBucketConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.post(ib, request.getUpdateBucketDetails(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public Future<UploadPartResponse> uploadPart(
            UploadPartRequest request,
            AsyncHandler<UploadPartRequest, UploadPartResponse> handler) {
        LOG.trace("Called async uploadPart");
        request = UploadPartConverter.interceptRequest(request);
        Invocation.Builder ib = UploadPartConverter.fromRequest(client, request);
        Function<Response, UploadPartResponse> transformer = UploadPartConverter.fromResponse();

        Consumer<Response> onSuccess = new SuccessConsumer<>(handler, transformer, request);
        Consumer<Throwable> onError = new ErrorConsumer<>(handler, request);

        Future<Response> responseFuture =
                client.put(ib, request.getUploadPartBody(), request, onSuccess, onError);
        return new TransformingFuture<>(responseFuture, transformer);
    }
}
