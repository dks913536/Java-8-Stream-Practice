package com.java.top100.set03_intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 24: Find top 5 salaries.
 *
 * Input:
 * [45000, 75000, 55000, 90000, 60000, 80000, 50000]
 *
 * Output:
 * [90000, 80000, 75000, 60000, 55000]
 */

public class P24_Top5Salaries {
    public static void main(String[] args) {
        List<Integer> salaries =
                Arrays.asList(45000, 75000, 55000, 90000, 60000, 80000, 50000);

        // =====================================
        // Approach 1: sorted() + limit()
        // =====================================
        List<Integer> top5Salaries1=salaries.stream()
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(top5Salaries1);
        
        // =====================================
        // Approach 2: distinct() + sorted() + limit()
        // =====================================
        List<Integer> top5Salaries=salaries.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(top5Salaries);
    }
}
