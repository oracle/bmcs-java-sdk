/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.functions.internal.http;

import com.oracle.bmc.functions.model.*;
import com.oracle.bmc.functions.requests.*;
import com.oracle.bmc.functions.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.extern.slf4j.Slf4j
public class InvokeFunctionConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static InvokeFunctionRequest interceptRequest(InvokeFunctionRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, InvokeFunctionRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getFunctionId(), "functionId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20181201")
                        .path("functions")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getFunctionId()))
                        .path("actions")
                        .path("invoke");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept("*/*");

        if (request.getFnIntent() != null) {
            ib.header("fn-intent", request.getFnIntent().getValue());
        }

        if (request.getFnInvokeType() != null) {
            ib.header("fn-invoke-type", request.getFnInvokeType().getValue());
        }

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<javax.ws.rs.core.Response, InvokeFunctionResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, InvokeFunctionResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, InvokeFunctionResponse>() {
                            @Override
                            public InvokeFunctionResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace("Transform function invoked for InvokeFunctionResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.io.InputStream>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        java.io.InputStream.class);

                                com.oracle.bmc.http.internal.WithHeaders<java.io.InputStream>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                InvokeFunctionResponse.Builder builder =
                                        InvokeFunctionResponse.builder();

                                builder.inputStream(response.getItem());

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

                                InvokeFunctionResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
