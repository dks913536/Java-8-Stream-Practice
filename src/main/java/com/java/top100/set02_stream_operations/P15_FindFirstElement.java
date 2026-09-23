package com.java.top100.set02_stream_operations;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 15: Find the first element from a list.
 *
 * Input:
 * [10, 20, 30, 40, 50]
 *
 * Output:
 * 10
 */

public class P15_FindFirstElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        Integer firstElement=numbers.stream()
                .findFirst()
                .orElse(0);
        System.out.println(firstElement);

    }
}
