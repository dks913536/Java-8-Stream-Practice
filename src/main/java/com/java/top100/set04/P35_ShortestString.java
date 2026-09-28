package com.java.top100.set04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Problem 35: Find the shortest string.
 *
 * Input:
 * ["Java", "Spring", "API", "Microservices"]
 *
 * Output:
 * API
 */
public class P35_ShortestString {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("Java", "Spring", "API", "Microservices");

        // =====================================
        // Approach 1: Using Comparator.comparing()
        // =====================================
        String shortest=names.stream()
                .min(Comparator.comparing(String::length))
                .orElse(null);
        System.out.println(shortest);

        // =====================================
        // Approach 2: Using Lambda Comparator
        // =====================================
        String shortest2=names.stream()
                .min((str1, str2) ->
                        Integer.compare(str1.length(), str2.length()))
                .orElse(null);
        System.out.println(shortest2);

    }
}
