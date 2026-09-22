package com.java.top100.set01_basics;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 08: Find the sum of all numbers.
 * Input: * [10, 20, 30, 40, 50]
 * Output: 150 */

public class P08_FindSumOfNum {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10, 20, 30, 40, 50);

        // =====================================
        // Approach 1:Using mapToInt() + sum() ⭐⭐ :Best and optimized
        // =====================================
        int sum1=numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum1);

        // =====================================
        // Approach 2:Using reduce() + Lambda
        // =====================================
        int sum2=numbers.stream()
                .reduce(0, (num1,num2)->num1+num2);
        System.out.println(sum2);

        // =====================================
        // Approach 3:Using reduce() + Method Reference
        // =====================================
        int sum3=numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum3);
    }
}
