package com.zeroten.common.util;

public class CheckUtils {
    public static boolean isAnyEmpty(String... strings) {
        if (strings == null) return false;
        for (String x: strings) {
            if (x == null || x.equalsIgnoreCase("")) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Object[] objects) {
        return objects != null && (objects.length != 0);
    }

    public static boolean equals(String str1, String str2) {
        return str1 != null && str1.equals(str2);
    }

    public static boolean equals(Integer n1, Integer n2) {
        return n1 != null && n1.equals(n2);
    }
}
