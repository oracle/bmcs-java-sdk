/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcesearch;

import com.oracle.bmc.resourcesearch.requests.*;
import com.oracle.bmc.resourcesearch.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ResourceSearch where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.4")
@lombok.RequiredArgsConstructor
public class ResourceSearchPaginators {
    private final ResourceSearch client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listResourceTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResourceTypesResponse> listResourceTypesResponseIterator(
            final ListResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourceTypesRequest.Builder, ListResourceTypesRequest,
                ListResourceTypesResponse>(
                new com.google.common.base.Supplier<ListResourceTypesRequest.Builder>() {
                    @Override
                    public ListResourceTypesRequest.Builder get() {
                        return ListResourceTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceTypesRequest.Builder>,
                        ListResourceTypesRequest>() {
                    @Override
                    public ListResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceTypesRequest.Builder>
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
                        ListResourceTypesRequest, ListResourceTypesResponse>() {
                    @Override
                    public ListResourceTypesResponse apply(ListResourceTypesRequest request) {
                        return client.listResourceTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcesearch.model.ResourceType} objects
     * contained in responses from the listResourceTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcesearch.model.ResourceType} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcesearch.model.ResourceType>
            listResourceTypesRecordIterator(final ListResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourceTypesRequest.Builder, ListResourceTypesRequest,
                ListResourceTypesResponse, com.oracle.bmc.resourcesearch.model.ResourceType>(
                new com.google.common.base.Supplier<ListResourceTypesRequest.Builder>() {
                    @Override
                    public ListResourceTypesRequest.Builder get() {
                        return ListResourceTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceTypesRequest.Builder>,
                        ListResourceTypesRequest>() {
                    @Override
                    public ListResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceTypesRequest.Builder>
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
                        ListResourceTypesRequest, ListResourceTypesResponse>() {
                    @Override
                    public ListResourceTypesResponse apply(ListResourceTypesRequest request) {
                        return client.listResourceTypes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListResourceTypesResponse,
                        java.util.List<com.oracle.bmc.resourcesearch.model.ResourceType>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.resourcesearch.model.ResourceType> apply(
                            ListResourceTypesResponse response) {
                        return response.getItems();
                    }
                });
    }
}
