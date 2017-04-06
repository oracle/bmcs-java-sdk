/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.oracle.bmc.http.internal.*;
import static com.oracle.bmc.util.internal.HttpUtils.*;
import com.oracle.bmc.model.*;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class GetWindowsInstanceInitialCredentialsConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static GetWindowsInstanceInitialCredentialsRequest interceptRequest(
            GetWindowsInstanceInitialCredentialsRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, GetWindowsInstanceInitialCredentialsRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getInstanceId() == null) {
            throw new NullPointerException("instanceId is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("instances")
                        .path(encodePathSegment(request.getInstanceId()))
                        .path("initialCredentials");

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        return ib;
    }

    public static Function<Response, GetWindowsInstanceInitialCredentialsResponse> fromResponse() {
        final Function<Response, GetWindowsInstanceInitialCredentialsResponse> transformer =
                new Function<Response, GetWindowsInstanceInitialCredentialsResponse>() {
                    @Override
                    public GetWindowsInstanceInitialCredentialsResponse apply(
                            Response rawResponse) {
                        LOG.trace(
                                "Transform function invoked for GetWindowsInstanceInitialCredentialsResponse");
                        Function<Response, WithHeaders<InstanceCredentials>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(InstanceCredentials.class);

                        WithHeaders<InstanceCredentials> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        GetWindowsInstanceInitialCredentialsResponse.Builder builder =
                                GetWindowsInstanceInitialCredentialsResponse.builder();

                        builder.instanceCredentials(response.getItem());

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        GetWindowsInstanceInitialCredentialsResponse responseWrapper =
                                builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
