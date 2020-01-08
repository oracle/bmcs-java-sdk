/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of KmsManagement where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to as ResponseIterators, and the methods are suffixed with ResponseIterator. For example: <i>listUsersResponseIterator</i></li>
 *   <li>Iterating over the resources/records being listed. These are referred to as RecordIterators, and the methods are suffixed with RecordIterator. For example: <i>listUsersRecordIterator</i></li>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping and using the page tokens.
 * They will automatically fetch more data from the service when required.
 *
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@lombok.RequiredArgsConstructor
public class KmsManagementPaginators {
    private final KmsManagement client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listKeyVersions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListKeyVersionsResponse> listKeyVersionsResponseIterator(
            final ListKeyVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListKeyVersionsRequest.Builder, ListKeyVersionsRequest, ListKeyVersionsResponse>(
                new com.google.common.base.Supplier<ListKeyVersionsRequest.Builder>() {
                    @Override
                    public ListKeyVersionsRequest.Builder get() {
                        return ListKeyVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListKeyVersionsResponse, String>() {
                    @Override
                    public String apply(ListKeyVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKeyVersionsRequest.Builder>,
                        ListKeyVersionsRequest>() {
                    @Override
                    public ListKeyVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKeyVersionsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListKeyVersionsRequest, ListKeyVersionsResponse>() {
                    @Override
                    public ListKeyVersionsResponse apply(ListKeyVersionsRequest request) {
                        return client.listKeyVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.keymanagement.model.KeyVersionSummary} objects
     * contained in responses from the listKeyVersions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.keymanagement.model.KeyVersionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.keymanagement.model.KeyVersionSummary>
            listKeyVersionsRecordIterator(final ListKeyVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListKeyVersionsRequest.Builder, ListKeyVersionsRequest, ListKeyVersionsResponse,
                com.oracle.bmc.keymanagement.model.KeyVersionSummary>(
                new com.google.common.base.Supplier<ListKeyVersionsRequest.Builder>() {
                    @Override
                    public ListKeyVersionsRequest.Builder get() {
                        return ListKeyVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListKeyVersionsResponse, String>() {
                    @Override
                    public String apply(ListKeyVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKeyVersionsRequest.Builder>,
                        ListKeyVersionsRequest>() {
                    @Override
                    public ListKeyVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKeyVersionsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListKeyVersionsRequest, ListKeyVersionsResponse>() {
                    @Override
                    public ListKeyVersionsResponse apply(ListKeyVersionsRequest request) {
                        return client.listKeyVersions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListKeyVersionsResponse,
                        java.util.List<com.oracle.bmc.keymanagement.model.KeyVersionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.keymanagement.model.KeyVersionSummary>
                            apply(ListKeyVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listKeys operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListKeysResponse> listKeysResponseIterator(final ListKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListKeysRequest.Builder, ListKeysRequest, ListKeysResponse>(
                new com.google.common.base.Supplier<ListKeysRequest.Builder>() {
                    @Override
                    public ListKeysRequest.Builder get() {
                        return ListKeysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListKeysResponse, String>() {
                    @Override
                    public String apply(ListKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKeysRequest.Builder>,
                        ListKeysRequest>() {
                    @Override
                    public ListKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKeysRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListKeysRequest, ListKeysResponse>() {
                    @Override
                    public ListKeysResponse apply(ListKeysRequest request) {
                        return client.listKeys(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.keymanagement.model.KeySummary} objects
     * contained in responses from the listKeys operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.keymanagement.model.KeySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.keymanagement.model.KeySummary> listKeysRecordIterator(
            final ListKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListKeysRequest.Builder, ListKeysRequest, ListKeysResponse,
                com.oracle.bmc.keymanagement.model.KeySummary>(
                new com.google.common.base.Supplier<ListKeysRequest.Builder>() {
                    @Override
                    public ListKeysRequest.Builder get() {
                        return ListKeysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListKeysResponse, String>() {
                    @Override
                    public String apply(ListKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKeysRequest.Builder>,
                        ListKeysRequest>() {
                    @Override
                    public ListKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKeysRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListKeysRequest, ListKeysResponse>() {
                    @Override
                    public ListKeysResponse apply(ListKeysRequest request) {
                        return client.listKeys(request);
                    }
                },
                new com.google.common.base.Function<
                        ListKeysResponse,
                        java.util.List<com.oracle.bmc.keymanagement.model.KeySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.keymanagement.model.KeySummary> apply(
                            ListKeysResponse response) {
                        return response.getItems();
                    }
                });
    }
}
