package com.java.top100.set03_intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 23: Find top 3 highest numbers.
 *
 * Input:
 * [10, 50, 30, 80, 40, 70, 20]
 *  N:3
 * Output:
 * [80, 70, 50]
 */
public class P23_TopNHighest {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 50, 30, 80, 40, 70, 20);
        int n=3;

        // =====================================
        // Approach 1: sorted() + limit()
        // =====================================
        List<Integer> topN=numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(n)
                .collect(Collectors.toList());
        System.out.println(topN);

        // =====================================
        // Approach 2: distinct() + sorted() + limit()
        // =====================================
        List<Integer> topN1=numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(n)
                .collect(Collectors.toList());
        System.out.println(topN1);
    }
}
