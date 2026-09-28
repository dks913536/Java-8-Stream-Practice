package com.java.top100.set04;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 38: Check if all strings are non-empty.
 *
 * Input:
 * ["Java", "Spring", "Boot"]
 *
 * Output:
 * true
 */
public class P38_AllStringsNonEmpty {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("Java", "Spring", "Boot");

        boolean result=names.stream()
                .allMatch(num-> !num.isEmpty());
        System.out.println(result);

    }
}
