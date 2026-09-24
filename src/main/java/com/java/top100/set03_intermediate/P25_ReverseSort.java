package com.java.top100.set03_intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 25: Reverse sort a list.
 *
 * Input:
 * [10, 50, 20, 40, 30]
 *
 * Output:
 * [50, 40, 30, 20, 10]
 */

public class P25_ReverseSort {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10, 50, 20, 40, 30);

        // =====================================
        // Approach 1: sorted() + Comparator
        // =====================================

        List<Integer> sorted=numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sorted);

        // =====================================
        // Approach 1: sorted() + lambda
        // =====================================

        List<Integer> sorted2=numbers.stream()
                .sorted((num1,num2)->num2.compareTo(num1))
                .collect(Collectors.toList());
        System.out.println(sorted2);

    }
}
