package com.java.top100.set02_stream_operations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 13: Sort strings alphabetically.
 * Input:["Spring", "Java", "Docker", "Microservices"]
 * Output:["Docker", "Java", "Microservices", "Spring"]
 */

public class P13_SortStringsAlphabetically {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Spring", "Java", "Docker", "Microservices");

        // =====================================
        // Approach 1: Natural alphabetical order
        // =====================================
        List<String> sorted=names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);

        // =====================================
        // Approach 2: Case-insensitive descending
        // =====================================
        List<String> sorted2=names.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList());
        System.out.println(sorted2);
        // =====================================
        // Approach 3: Reverse natural order
        // =====================================
        List<String> sorted3=names.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sorted2);
    }
}
