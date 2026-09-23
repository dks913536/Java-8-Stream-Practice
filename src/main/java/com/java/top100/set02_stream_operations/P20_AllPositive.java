package com.java.top100.set02_stream_operations;

/**
 * Problem 20: Check if all numbers are positive.
 *
 * Input:
 * [10, 20, 30, 40, 50]
 *
 * Output:
 * true
 */
import java.util.Arrays;
import java.util.List;

public class P20_AllPositive {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);

        boolean allPositive=numbers.stream()
                .allMatch(num->num > 0);
        System.out.println(allPositive);
    }
}
/*
Note:
allMatch(): true-> if all match a/c to condition
anyMatch(): true-> if at least one match the condition
nonMatch(): true-> if no element matches the condition
 */
