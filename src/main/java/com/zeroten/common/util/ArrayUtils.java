package com.zeroten.common.util;

import java.util.Arrays;

public class ArrayUtils {
    public static int[] sort(int[] arr) {
        if (arr == null) return null;

        int[] temp = Arrays.copyOf(arr, arr.length);
        quickSort(temp, 0, temp.length - 1);
        return temp;
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int key = arr[left];
        int leftCursor = left;
        int rightCursor = right + 1;

        while (true) {
            while (arr[++leftCursor] < key && leftCursor != right);
            while (arr[--rightCursor] > key && rightCursor != left);
            if (leftCursor >= rightCursor) break;
            arr[leftCursor] ^= arr[rightCursor];
            arr[rightCursor] ^= arr[leftCursor];
            arr[leftCursor] ^= arr[rightCursor];
        }

        arr[left] ^= arr[rightCursor];
        arr[rightCursor] ^= arr[left];
        arr[left] ^= arr[rightCursor];

        arr[rightCursor] = key;

        quickSort(arr, left, rightCursor - 1);
        quickSort(arr, rightCursor + 1, right);
    }
}
