/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class HeadObjectResponse {

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * The entity tag (ETag) for the object.
     */
    private String eTag;

    /**
     * The user-defined metadata for the object.
     */
    private java.util.Map<String, String> opcMeta;

    /**
     * The object size in bytes.
     */
    private Long contentLength;

    /**
     * Content-MD5 header, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.15.
     * Unavailable for objects uploaded using multipart upload.
     *
     */
    private String contentMd5;

    /**
     * Only applicable to objects uploaded using multipart upload.
     * Base-64 representation of the multipart object hash.
     * The multipart object hash is calculated by taking the MD5 hashes of the parts,
     * concatenating the binary representation of those hashes in order of their part numbers,
     * and then calculating the MD5 hash of the concatenated values.
     *
     */
    private String opcMultipartMd5;

    /**
     * Content-Type header, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.17.
     */
    private String contentType;

    /**
     * Content-Language header, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.12.
     */
    private String contentLanguage;

    /**
     * Content-Encoding header, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.11.
     */
    private String contentEncoding;

    /**
     * Cache-Control header, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.9.
     */
    private String cacheControl;

    /**
     * Content-Disposition header, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 19.5.1
     */
    private String contentDisposition;

    /**
     * The object modification time, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
     */
    private java.util.Date lastModified;

    /**
     * The current state of the object.
     */
    private String archivalState;

    /**
     * Time that the object is returned to the archived state. This field is only present for restored objects.
     */
    private java.util.Date timeOfArchival;

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(HeadObjectResponse o) {
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            opcMeta(o.getOpcMeta());
            contentLength(o.getContentLength());
            contentMd5(o.getContentMd5());
            opcMultipartMd5(o.getOpcMultipartMd5());
            contentType(o.getContentType());
            contentLanguage(o.getContentLanguage());
            contentEncoding(o.getContentEncoding());
            cacheControl(o.getCacheControl());
            contentDisposition(o.getContentDisposition());
            lastModified(o.getLastModified());
            archivalState(o.getArchivalState());
            timeOfArchival(o.getTimeOfArchival());

            isNotModified(o.isNotModified());
            return this;
        }
    }
}
