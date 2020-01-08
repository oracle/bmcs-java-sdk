/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.internal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.auth.X509CertificateSupplier;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.WrappedInvocationBuilder;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
    RestClientUtils.class,
    Thread.class,
    X509FederationClient.class,
    WrappedInvocationBuilder.class
})
public class X509FederationClientTest {

    @Mock private RestClient mockFederationClient;
    @Mock private List<ClientConfigurator> mockAddlConfigurators;
    @Captor private ArgumentCaptor<WrappedInvocationBuilder> wrappedIbCaptor;
    private X509FederationClient clientUnderTest;

    @Before
    public void setUp() {
        mockStatic(RestClientUtils.class);
        when(
                        RestClientUtils.createRestClient(
                                anyString(),
                                Mockito.<ClientConfigurator>any(),
                                Mockito.<List<ClientConfigurator>>any(),
                                Mockito.<X509FederationClient>any()))
                .thenReturn(mockFederationClient);

        final Set<X509CertificateSupplier> intermediateCertificateSuppliers =
                Collections.emptySet();
        clientUnderTest =
                new X509FederationClient(
                        "federationEndpoint",
                        "tenantId",
                        mock(X509CertificateSupplier.class),
                        mock(SessionKeySupplier.class),
                        intermediateCertificateSuppliers,
                        mock(ClientConfigurator.class),
                        mockAddlConfigurators);

        // Speed up the tests to mock out the sleep call between retries
        mockStatic(Thread.class);
    }

    @Test
    public void makeCall_shouldReuseWrappedInvocationBuilderReference_whenBmcExceptionIsThrown()
            throws Exception {
        // Set up WrappedInvocationBuilder used to verify
        final WrappedInvocationBuilder expectedWIb = mock(WrappedInvocationBuilder.class);
        final Invocation.Builder ib = mock(Invocation.Builder.class);
        whenNew(WrappedInvocationBuilder.class).withArguments(eq(ib)).thenReturn(expectedWIb);
        final Response expectedResponse = mock(Response.class);

        // Stub exceptions thrown by the client 3 consecutive times then a successful
        when(
                        mockFederationClient.post(
                                Mockito.<WrappedInvocationBuilder>any(),
                                Mockito.<X509FederationClient.X509FederationRequest>any(),
                                Mockito.<BmcRequest>any()))
                .thenThrow(new BmcException(409, "ServiceCode", "Exception 1", "RequestId"))
                .thenThrow(new BmcException(409, "ServiceCode", "Exception 2", "RequestId"))
                .thenThrow(new BmcException(409, "ServiceCode", "Exception 3", "RequestId"))
                .thenReturn(expectedResponse);

        // Method under test.
        final Response actualResponse =
                clientUnderTest.makeCall(
                        ib, mock(X509FederationClient.X509FederationRequest.class));

        assertEquals("Response should be equal", expectedResponse, actualResponse);
        verify(mockFederationClient, times(4))
                .post(
                        wrappedIbCaptor.capture(),
                        isA(X509FederationClient.X509FederationRequest.class),
                        isA(BmcRequest.class));
        final List<WrappedInvocationBuilder> wrappedIbsFromInvocation =
                wrappedIbCaptor.getAllValues();
        assertFalse(
                "Captured list of WrappedInvocationBuilder should not be empty",
                wrappedIbsFromInvocation.isEmpty());
        assertEquals(
                "Captured list of WrappedInvocationBuilder size should be 4",
                4 /* expected number of captures */,
                wrappedIbsFromInvocation.size());
        for (WrappedInvocationBuilder actualWib : wrappedIbsFromInvocation) {
            assertEquals("Captured WIB should be the same", expectedWIb, actualWib);
        }
    }

    @Test
    public void jacksonCanDeserializeSecurityToken() throws IOException {
        final String strToken = "{\"token\" : \"abcdef\"}";
        // this line will fail on original code if Lombok and Jackson are not at exactly the right versions
        new ObjectMapper().readValue(strToken, X509FederationClient.SecurityToken.class);
    }

    @Test
    public void jacksonCanRoundTripSecurityToken() throws IOException {
        final X509FederationClient.SecurityToken secToken =
                new X509FederationClient.SecurityToken("abcdef");
        final ObjectMapper mapper = new ObjectMapper();
        assertEquals(
                secToken.getToken(),
                mapper.readValue(mapper.writeValueAsString(secToken), secToken.getClass())
                        .getToken());
    }
}
