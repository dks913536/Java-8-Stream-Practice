package com.java.top100.set02_stream_operations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 12: Sort numbers in descending order.
 * Input:  [50, 10, 40, 20, 30]
 * Output: [50, 40, 30, 20, 10]
 * */

public class P12_SortDescending {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(50, 10, 40, 20, 30);

        List<Integer> sorted=numbers.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
