/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage;

import com.oracle.bmc.responses.AsyncHandler;

import java.util.concurrent.Future;

import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

import com.oracle.bmc.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface ObjectStorageAsync extends AutoCloseable {

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
    void setRegion(Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Aborts an in-progress multipart upload and deletes all parts that have been uploaded.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<AbortMultipartUploadResponse> abortMultipartUpload(
            AbortMultipartUploadRequest request,
            AsyncHandler<AbortMultipartUploadRequest, AbortMultipartUploadResponse> handler);

    /**
     * Commits a multipart upload, which involves checking part numbers and ETags of the parts, to create an aggregate object.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CommitMultipartUploadResponse> commitMultipartUpload(
            CommitMultipartUploadRequest request,
            AsyncHandler<CommitMultipartUploadRequest, CommitMultipartUploadResponse> handler);

    /**
     * Creates a bucket in the given namespace with a bucket name and optional user-defined metadata.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateBucketResponse> createBucket(
            CreateBucketRequest request,
            AsyncHandler<CreateBucketRequest, CreateBucketResponse> handler);

    /**
     * Starts a new multipart upload to a specific object in the given bucket in the given namespace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateMultipartUploadResponse> createMultipartUpload(
            CreateMultipartUploadRequest request,
            AsyncHandler<CreateMultipartUploadRequest, CreateMultipartUploadResponse> handler);

    /**
     * Create a pre-authenticated request specific to the bucket
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreatePreauthenticatedRequestResponse> createPreauthenticatedRequest(
            CreatePreauthenticatedRequestRequest request,
            AsyncHandler<
                            CreatePreauthenticatedRequestRequest,
                            CreatePreauthenticatedRequestResponse>
                    handler);

    /**
     * Deletes a bucket if it is already empty. If the bucket is not empty, use {@link #deleteObject(DeleteObjectRequest, Consumer, Consumer) deleteObject} first.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteBucketResponse> deleteBucket(
            DeleteBucketRequest request,
            AsyncHandler<DeleteBucketRequest, DeleteBucketResponse> handler);

    /**
     * Deletes an object.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteObjectResponse> deleteObject(
            DeleteObjectRequest request,
            AsyncHandler<DeleteObjectRequest, DeleteObjectResponse> handler);

    /**
     * Deletes the bucket level pre-authenticateted request
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeletePreauthenticatedRequestResponse> deletePreauthenticatedRequest(
            DeletePreauthenticatedRequestRequest request,
            AsyncHandler<
                            DeletePreauthenticatedRequestRequest,
                            DeletePreauthenticatedRequestResponse>
                    handler);

    /**
     * Gets the current representation of the given bucket in the given namespace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetBucketResponse> getBucket(
            GetBucketRequest request, AsyncHandler<GetBucketRequest, GetBucketResponse> handler);

    /**
     * Gets the name of the namespace for the user making the request. An account name must be unique, must start with a
     * letter, and can have up to 15 lowercase letters and numbers. You cannot use spaces or special characters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetNamespaceResponse> getNamespace(
            GetNamespaceRequest request,
            AsyncHandler<GetNamespaceRequest, GetNamespaceResponse> handler);

    /**
     * Gets the metadata and body of an object.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetObjectResponse> getObject(
            GetObjectRequest request, AsyncHandler<GetObjectRequest, GetObjectResponse> handler);

    /**
     * Get the bucket level pre-authenticateted request
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetPreauthenticatedRequestResponse> getPreauthenticatedRequest(
            GetPreauthenticatedRequestRequest request,
            AsyncHandler<GetPreauthenticatedRequestRequest, GetPreauthenticatedRequestResponse>
                    handler);

    /**
     * Efficiently checks if a bucket exists and gets the current ETag for the bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<HeadBucketResponse> headBucket(
            HeadBucketRequest request, AsyncHandler<HeadBucketRequest, HeadBucketResponse> handler);

    /**
     * Gets the user-defined metadata and entity tag for an object.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<HeadObjectResponse> headObject(
            HeadObjectRequest request, AsyncHandler<HeadObjectRequest, HeadObjectResponse> handler);

    /**
     * Gets a list of all `BucketSummary`s in a compartment. A `BucketSummary` contains only summary fields for the bucket
     * and does not contain fields like the user-defined metadata.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListBucketsResponse> listBuckets(
            ListBucketsRequest request,
            AsyncHandler<ListBucketsRequest, ListBucketsResponse> handler);

    /**
     * Lists the parts of an in-progress multipart upload.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListMultipartUploadPartsResponse> listMultipartUploadParts(
            ListMultipartUploadPartsRequest request,
            AsyncHandler<ListMultipartUploadPartsRequest, ListMultipartUploadPartsResponse>
                    handler);

    /**
     * Lists all in-progress multipart uploads for the given bucket in the given namespace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListMultipartUploadsResponse> listMultipartUploads(
            ListMultipartUploadsRequest request,
            AsyncHandler<ListMultipartUploadsRequest, ListMultipartUploadsResponse> handler);

    /**
     * Lists the objects in a bucket.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListObjectsResponse> listObjects(
            ListObjectsRequest request,
            AsyncHandler<ListObjectsRequest, ListObjectsResponse> handler);

    /**
     * List pre-authenticated requests for the bucket
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListPreauthenticatedRequestsResponse> listPreauthenticatedRequests(
            ListPreauthenticatedRequestsRequest request,
            AsyncHandler<ListPreauthenticatedRequestsRequest, ListPreauthenticatedRequestsResponse>
                    handler);

    /**
     * Creates a new object or overwrites an existing one.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<PutObjectResponse> putObject(
            PutObjectRequest request, AsyncHandler<PutObjectRequest, PutObjectResponse> handler);

    /**
     * Performs a partial or full update of a bucket's user-defined metadata.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateBucketResponse> updateBucket(
            UpdateBucketRequest request,
            AsyncHandler<UpdateBucketRequest, UpdateBucketResponse> handler);

    /**
     * Uploads a single part of a multipart upload.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UploadPartResponse> uploadPart(
            UploadPartRequest request, AsyncHandler<UploadPartRequest, UploadPartResponse> handler);
}
