package com.zeroten.common.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckUtilsTest {

    @Test
    public void isAnyEmpty() {
        assertTrue(CheckUtils.isAnyEmpty("123", "456"));
        assertTrue(CheckUtils.isAnyEmpty("abc"));
        assertFalse(CheckUtils.isAnyEmpty(""));
        assertFalse(CheckUtils.isAnyEmpty("123", "", "abc"));
        assertFalse(CheckUtils.isAnyEmpty((String) null));
        assertFalse(CheckUtils.isAnyEmpty("", null));
        assertFalse(CheckUtils.isAnyEmpty("abc", "", null));
    }

    @Test
    public void isEmpty() {
        assertTrue(CheckUtils.isEmpty(new Integer[] {1, 2, 3}));
        assertTrue(CheckUtils.isEmpty(new Double[] {1.2, 3.4, 5.6}));
        assertTrue(CheckUtils.isEmpty(new String[] {"wang", "qin", "hong"}));
        assertFalse(CheckUtils.isEmpty(new Integer[0]));
        assertFalse(CheckUtils.isEmpty(null));
    }

    @Test
    public void equalsString() {
        assertFalse(CheckUtils.equals((String) null, (String) null));
        assertFalse(CheckUtils.equals((String) null, "123"));
        assertFalse(CheckUtils.equals("123", (String) null));
        assertFalse(CheckUtils.equals("123", "abc"));
        assertFalse(CheckUtils.equals("123", new String("abc")));
        assertTrue(CheckUtils.equals("123", "123"));
        assertTrue(CheckUtils.equals("123", new String("123")));
    }

    @Test
    public void equalsInteger() {
        assertFalse(CheckUtils.equals((Integer) null, (Integer) null));
        assertFalse(CheckUtils.equals((Integer) null, 1));
        assertFalse(CheckUtils.equals(1, (Integer) null));
        assertFalse(CheckUtils.equals(1, 2));
        assertFalse(CheckUtils.equals(1, Integer.valueOf(2)));
        assertFalse(CheckUtils.equals(Integer.valueOf(3), Integer.valueOf(1)));
        assertTrue(CheckUtils.equals(1, 1));
        assertTrue(CheckUtils.equals(1, Integer.valueOf(1)));
        assertTrue(CheckUtils.equals(Integer.valueOf(1), 1));
        assertTrue(CheckUtils.equals(Integer.valueOf(1), Integer.valueOf(1)));
    }
}
