/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest {

    @Test
    public void parse_noContentLength() {
        Range range = Range.parse("bytes 5-10/*");
        assertEquals(5L, (long) range.getStartByte());
        assertEquals(10L, (long) range.getEndByte());
        assertNull(range.getContentLength());
    }

    @Test
    public void parse_hasContentLength() {
        Range range = Range.parse("bytes 5-10/25");
        assertEquals(5L, (long) range.getStartByte());
        assertEquals(10L, (long) range.getEndByte());
        assertEquals(25L, (long) range.getContentLength());
    }

    @Test
    public void parse_noStartnoContentLength() {
        Range range = Range.parse("bytes -10/*");
        assertNull(range.getStartByte());
        assertEquals(10L, (long) range.getEndByte());
        assertNull(range.getContentLength());
    }

    @Test
    public void parse_noStartHasContentLength() {
        Range range = Range.parse("bytes -10/25");
        assertNull(range.getStartByte());
        assertEquals(10L, (long) range.getEndByte());
        assertEquals(25L, (long) range.getContentLength());
    }

    @Test
    public void parse_noEndContentLength() {
        Range range = Range.parse("bytes 5-/*");
        assertEquals(5L, (long) range.getStartByte());
        assertNull(range.getEndByte());
        assertNull(range.getContentLength());
    }

    @Test
    public void parse_noEndHasContentLength() {
        Range range = Range.parse("bytes 5-/25");
        assertEquals(5L, (long) range.getStartByte());
        assertNull(range.getEndByte());
        assertEquals(25L, (long) range.getContentLength());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_noStartNoEndHasContentLength() {
        Range.parse("bytes -/25");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_noSlash() {
        Range.parse("bytes 1-10");
    }
}
