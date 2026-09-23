package com.java.top100.set02_stream_operations;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 18: Check if a list contains a specific value.
 *
 * Input:
 * [10, 20, 30, 40, 50]
 * Search value = 30
 *
 * Output:
 * true
 */


public class P18_CheckValue {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);

        int searchValue=30;
        boolean isPresent=numbers.stream()
                .anyMatch(num-> num==searchValue);
        System.out.println(isPresent);

    }
}

// Note:
//      anyMatch(): return true if at least one element matches the condition
