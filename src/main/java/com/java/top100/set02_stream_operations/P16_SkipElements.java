package com.java.top100.set02_stream_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 16: Skip first N elements.
 *
 * Input:
 * [10, 20, 30, 40, 50]
 * N = 2
 *
 * Output:
 * [30, 40, 50]
 */
public class P16_SkipElements {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> skip=numbers.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(skip);

    }
}

// Note : skip(n) : skip first n element
