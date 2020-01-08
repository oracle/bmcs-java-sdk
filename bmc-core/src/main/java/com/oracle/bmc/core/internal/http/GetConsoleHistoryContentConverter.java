/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class GetConsoleHistoryContentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static GetConsoleHistoryContentRequest interceptRequest(
            GetConsoleHistoryContentRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            GetConsoleHistoryContentRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getInstanceConsoleHistoryId(),
                "instanceConsoleHistoryId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("instanceConsoleHistories")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getInstanceConsoleHistoryId()))
                        .path("data");

        if (request.getOffset() != null) {
            target =
                    target.queryParam(
                            "offset",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getOffset()));
        }

        if (request.getLength() != null) {
            target =
                    target.queryParam(
                            "length",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLength()));
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, GetConsoleHistoryContentResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetConsoleHistoryContentResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, GetConsoleHistoryContentResponse>() {
                            @Override
                            public GetConsoleHistoryContentResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for GetConsoleHistoryContentResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<String>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(String.class);

                                com.oracle.bmc.http.internal.WithHeaders<String> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                GetConsoleHistoryContentResponse.Builder builder =
                                        GetConsoleHistoryContentResponse.builder();

                                builder.value(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcBytesRemainingHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-bytes-remaining");
                                if (opcBytesRemainingHeader.isPresent()) {
                                    builder.opcBytesRemaining(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-bytes-remaining",
                                                    opcBytesRemainingHeader.get().get(0),
                                                    Integer.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                GetConsoleHistoryContentResponse responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
