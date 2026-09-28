package com.java.top100.set04;

import java.util.Arrays;
import java.util.List;
/**
 * Problem 37: Check if any number is negative.
 *
 * Input:
 * [10, -20, 30, 40]
 *
 * Output:
 * true
 */
public class P37_AnyNegativeNumber {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10, -20, 30, 40);

        boolean result= numbers.stream()
                .anyMatch(num-> num <0);
        System.out.println(result);
    }
}
