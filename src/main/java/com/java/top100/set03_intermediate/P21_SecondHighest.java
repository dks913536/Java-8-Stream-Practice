package com.java.top100.set03_intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Problem 21: Find the second highest number.
 *
 * Input:
 * [10, 50, 30, 40, 20, 50]
 *
 * Output:
 * 40
 */


public class P21_SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10, 50, 30, 40, 20, 50);

        // =====================================
        // Approach 1: distinct() + sorted()
        // =====================================
        int secHighest=numbers.stream()
                .distinct() // remove duplicate element
                .sorted(Comparator.reverseOrder()) // [50,40,30,20,10]
                .skip(1)                        // [40,30,20,10]
                .findFirst()       // 40
                .orElse(0);
        System.out.println(secHighest);

    }
}
