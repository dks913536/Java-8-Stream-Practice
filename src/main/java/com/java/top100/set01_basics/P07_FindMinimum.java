package com.java.top100.set01_basics;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 07: Find the minimum number from a list.
 * Input: * [10, 20, 10, 30, 20, 40, 30]
 * Output: 40 */
public class P07_FindMinimum {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10, 20, 10, 30, 20, 40, 30);

        // =====================================
        // Approach 1: Method reference
        // ======================================

        int min=numbers.stream()
                .min(Integer::compareTo)
                .orElse(0);
        System.out.println(min);

        // =====================================
        // Approach 1: Lambda expression
        // ======================================
        int min2=numbers.stream()
                .max((num1,num2)->num1.compareTo(num2))
                .orElse(0);
        System.out.println(min2);
    }
}
