/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.paginator.internal;

import com.google.common.base.Function;
import com.google.common.base.Supplier;

import java.util.List;
import java.util.Iterator;

/**
 * An iterable which can be used to iterate over the models/resources returned by a list operation. These
 * are the items which are contained with the response received from a list operation (e.g. by calling
 * <b>getItems()</b> method on the response object). This iterable
 * will handle calling the service to retrieve more results when required.
 *
 * @param <REQUESTBUILDER> the type of a builder which can produce requests for a list operation
 * @param <REQUEST> the type of a request to a list operation. This type must match the type produced
 * by REQUESTBUILDER
 * @param <RESPONSE> the type of the response from a list operation
 * @param <ITEMTYPE> the type of the model/resource returned inside the response
 */
public class ResponseRecordIterable<REQUESTBUILDER, REQUEST, RESPONSE, ITEMTYPE>
        implements Iterable<ITEMTYPE> {

    private final Supplier<REQUESTBUILDER> requestBuilderSupplier;
    private final Function<RESPONSE, String> nextPageTokenRetrievalFunction;
    private final Function<REQUEST, RESPONSE> pageRetrievalFunction;
    private final Function<RequestBuilderAndToken<REQUESTBUILDER>, REQUEST> requestBuilderFunction;
    private final Function<RESPONSE, List<ITEMTYPE>> retrieveItemsFromResponseFunction;

    /**
     * Creates a new iterable.
     *
     * @param requestBuilderSupplier a supplier which can called to produce a builder object for requests
     * @param nextPageTokenRetrievalFunction a function which can extract the next page token from a
     * response produced by a list operation
     * @param requestBuilderFunction a function which can build a request for a list operation based on
     * a builder object and a pagination token to use
     * @param pageRetrievalFunction a function which will call a list operation with a request and return
     * the response of the call
     */
    public ResponseRecordIterable(
            final Supplier<REQUESTBUILDER> requestBuilderSupplier,
            final Function<RESPONSE, String> nextPageTokenRetrievalFunction,
            final Function<RequestBuilderAndToken<REQUESTBUILDER>, REQUEST> requestBuilderFunction,
            final Function<REQUEST, RESPONSE> pageRetrievalFunction,
            final Function<RESPONSE, List<ITEMTYPE>> retrieveItemsFromResponseFunction) {

        this.requestBuilderSupplier = requestBuilderSupplier;
        this.nextPageTokenRetrievalFunction = nextPageTokenRetrievalFunction;
        this.requestBuilderFunction = requestBuilderFunction;
        this.pageRetrievalFunction = pageRetrievalFunction;
        this.retrieveItemsFromResponseFunction = retrieveItemsFromResponseFunction;
    }

    @Override
    public Iterator<ITEMTYPE> iterator() {
        return new ResponseRecordIterator<REQUESTBUILDER, REQUEST, RESPONSE, ITEMTYPE>(
                requestBuilderSupplier.get(),
                nextPageTokenRetrievalFunction,
                requestBuilderFunction,
                pageRetrievalFunction,
                retrieveItemsFromResponseFunction);
    }
}
