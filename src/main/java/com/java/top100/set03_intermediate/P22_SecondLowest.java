package com.java.top100.set03_intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Problem 22: Find the second lowest number.
 *
 * Input:
 * [10, 50, 30, 40, 20, 10]
 *
 * Output:
 * 20
 */

public class P22_SecondLowest {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10, 50, 30, 40, 20, 50);

        // =====================================
        // Approach 1: distinct() + sorted()
        // =====================================
        int secLowest=numbers.stream()
                .distinct()     //[10, 50, 30, 40, 20] remove duplicate
                .sorted()       //[10, 20, 30, 40, 50]  sort in asc order
                .skip(1)    // //[20, 30, 40, 50]
                .findFirst()    // 20
                .orElse(0);
        System.out.println(secLowest);
    }
}
