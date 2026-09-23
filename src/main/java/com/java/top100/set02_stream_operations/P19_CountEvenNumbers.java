package com.java.top100.set02_stream_operations;

/**
 * Problem 19: Count even numbers.
 *
 * Input:
 * [10, 15, 20, 25, 30, 35]
 *
 * Output:
 * 3
 */

import java.util.Arrays;
import java.util.List;

public class P19_CountEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30, 35);

        long count=numbers.stream()
                .filter(num-> num%2==0)
                .count();
        System.out.println(count);
    }
}
