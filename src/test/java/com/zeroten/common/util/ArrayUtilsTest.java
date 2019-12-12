package com.zeroten.common.util;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayUtilsTest {
    @Test
    public void sort() {
        assertArrayEquals(ArrayUtils.sort(new int[]{3, 1, 4, 2, 6, 5}), new int[]{1, 2, 3, 4, 5, 6});

        assertArrayEquals(ArrayUtils.sort(new int[0]), new int[0]);

        assertArrayEquals(ArrayUtils.sort(null), null);

        int[] test = new int[10000];
        for (int i = 0; i < test.length; i++) {
            test[i] = (int) Math.floor(Math.random() * Integer.MAX_VALUE);
        }
        int[] ans = Arrays.copyOf(test, test.length);
        Arrays.sort(ans);

        assertArrayEquals(ArrayUtils.sort(test), ans);
    }
}