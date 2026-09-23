package com.java.top100.set02_stream_operations;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 11: Sort numbers in ascending order.
 * Input:  [50, 10, 40, 20, 30]
 * Output: [10, 20, 30, 40, 50]
 * */

public class P11_SortAscending {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(50, 10, 40, 20, 30);

        List<Integer> sorted=numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
