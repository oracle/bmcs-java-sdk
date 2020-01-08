/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.io.internal;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class WrappedResponseInputStreamTest {
    @Mock private InputStream mockDelegateStream;
    @Mock private Response mockRawResponseDelegate;

    @Rule public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testReadNoParam_withDelegateInputStream_shouldReadFromDelegate() throws Exception {
        final WrappedResponseInputStream streamUnderTest =
                new WrappedResponseInputStream(mockDelegateStream, mockRawResponseDelegate);

        streamUnderTest.read();

        verify(mockDelegateStream).read();
    }

    @Test
    public void testReadWithByteParam_withDelegateInputStream_shouldReadFromDelegate()
            throws Exception {
        final WrappedResponseInputStream streamUnderTest =
                new WrappedResponseInputStream(mockDelegateStream, mockRawResponseDelegate);

        streamUnderTest.read(new byte[2]);

        verify(mockDelegateStream).read(isA(byte[].class));
    }

    @Test
    public void testReadWithOffset_withDelegateInputStream_shouldReadFromDelegate()
            throws Exception {
        final WrappedResponseInputStream streamUnderTest =
                new WrappedResponseInputStream(mockDelegateStream, mockRawResponseDelegate);

        streamUnderTest.read(new byte[2], 1, 2);

        verify(mockDelegateStream).read(isA(byte[].class), eq(1), eq(2));
    }

    @Test
    public void skip_withDelegateInputStream_shouldSkipFromDelegate() throws Exception {
        final WrappedResponseInputStream streamUnderTest =
                new WrappedResponseInputStream(mockDelegateStream, mockRawResponseDelegate);

        streamUnderTest.skip(1L);

        verify(mockDelegateStream).skip(eq(1L));
    }

    @Test
    public void mark_withDelegateInputStream_shouldMarkFromDelegate() {
        final WrappedResponseInputStream streamUnderTest =
                new WrappedResponseInputStream(mockDelegateStream, mockRawResponseDelegate);

        streamUnderTest.mark(1);

        verify(mockDelegateStream).mark(eq(1));
    }

    @Test
    public void reset_withDelegateInputStream_shouldResetFromDelegate() throws Exception {
        final WrappedResponseInputStream streamUnderTest =
                new WrappedResponseInputStream(mockDelegateStream, mockRawResponseDelegate);

        streamUnderTest.reset();

        verify(mockDelegateStream).reset();
    }

    @Test
    public void available_withDelegateInputStream_shouldAvailableFromDelegate() throws Exception {
        final WrappedResponseInputStream streamUnderTest =
                new WrappedResponseInputStream(mockDelegateStream, mockRawResponseDelegate);

        streamUnderTest.available();

        verify(mockDelegateStream).available();
    }

    @Test
    public void markSupported_withDelegateInputStream_shouldMarkSupportedFromDelegate() {
        final WrappedResponseInputStream streamUnderTest =
                new WrappedResponseInputStream(mockDelegateStream, mockRawResponseDelegate);

        streamUnderTest.markSupported();

        verify(mockDelegateStream).markSupported();
    }

    @Test
    public void testRead_withIOException_shouldThrowException() throws Exception {
        thrown.expect(IOException.class);
        final InputStream mockedDelegateInputStream = mock(InputStream.class);
        when(mockedDelegateInputStream.read()).thenThrow(new IOException("Exception"));

        final WrappedResponseInputStream streamUnderTest =
                new WrappedResponseInputStream(mockedDelegateInputStream, mockRawResponseDelegate);

        streamUnderTest.read();
    }

    @Test
    public void closeInputStream_withNoException_delegateResponseIsClosed() throws Exception {
        final WrappedResponseInputStream streamUnderTest =
                new WrappedResponseInputStream(mockDelegateStream, mockRawResponseDelegate);

        streamUnderTest.close();

        verify(mockRawResponseDelegate).close();
    }

    @Test
    public void closeInputStream_withException_delegateResponseIsClosed() throws Exception {
        final InputStream originalStream = mock(InputStream.class);
        final WrappedResponseInputStream streamUnderTest =
                new WrappedResponseInputStream(originalStream, mockRawResponseDelegate);
        doThrow(new ProcessingException("Exception")).when(originalStream).close();

        try {
            streamUnderTest.close();
            fail("ProcessingException should have been thrown");
        } catch (Throwable t) {
            assertThat(
                    "Exception thrown should be a ProcessingException",
                    t,
                    instanceOf(ProcessingException.class));
            verify(mockRawResponseDelegate).close();
        }
    }
}
