package com.java.top100.set01_basics;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 05: Remove duplicate elements from a list.
 * Input: * [10, 20, 10, 30, 20, 40, 30]
 * Output: 40 */
public class P06_FindMaximum {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10, 20, 10, 30, 20, 40, 30);

        // =====================================
        // Approach 1: Method reference
        // ======================================

        int max=numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println(max);

        // =====================================
        // Approach 1: Lambda expression
        // ======================================
        int max2=numbers.stream()
                .max((num1,num2)->num1.compareTo(num2))
                .orElse(0);
        System.out.println(max2);
    }
}
