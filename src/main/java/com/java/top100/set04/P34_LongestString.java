package com.java.top100.set04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Problem 34: Find the longest string.
 *
 * Input:
 * ["Java", "Spring", "Microservices", "API"]
 *
 * Output:
 * Microservices
 */
public class P34_LongestString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "Microservices", "API");

        // =====================================
        // Approach 1: Using Comparator.comparing()
        // =====================================
        String longest=names.stream()
                .max(Comparator.comparing(String::length))
                .orElse(null);
        System.out.println(longest);

        // =====================================
        // Approach 2: Using Lambda Comparator
        // =====================================
        String longest2=names.stream()
                .max((str1, str2) ->
                        Integer.compare(str1.length(), str2.length()))
                .orElse(null);
        System.out.println(longest2);

    }
}
/*
Explanations:
* Approach 1:
 * Comparator.comparing(String::length)
 * -> compares Strings based on their length.
 *
 * Approach 2:
 * Lambda comparator explicitly compares the lengths.
 *
 * max() -> returns the String with the greatest length.
 *
 * orElse(null) -> handles an empty stream.
 */
