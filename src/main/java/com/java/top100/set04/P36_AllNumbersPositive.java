package com.java.top100.set04;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 36: Check if all numbers are positive.
 *
 * Input:
 * [10, 20, 30, 40]
 *
 * Output:
 * true
 */
public class P36_AllNumbersPositive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        boolean result=numbers.stream()
                .allMatch(num->num>0);
        System.out.println(result);
    }
}
