package com.java.top100.set02_stream_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 14: Sort strings by length.
 *
 * Input:
 * ["Java", "Spring", "API", "Microservices"]
 *
 * Output:
 * ["API", "Java", "Spring", "Microservices"]
 */

public class P14_SortStringsByLength {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("Java", "Spring", "API", "Microservices");

        // =====================================
        // Approach 1: sorting by length
        // =====================================
        List<String> sorted=names.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(sorted);
        // =====================================
        // Approach 1:Length + Alphabetically order
        // =====================================
        List<String> sorted2=names.stream()
                .sorted(
                        Comparator.comparing(String::length)
                                .thenComparing(String::compareTo)
                )
                .collect(Collectors.toList());
        System.out.println(sorted2);

    }
}
