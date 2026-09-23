package com.java.top100.set02_stream_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 17: Limit stream to N elements.
 *
 * Input:
 * [10, 20, 30, 40, 50]
 * N = 3
 * Output:
 * [10, 20, 30]
 */
public class P17_LimitElements {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);
        int n=3;

        List<Integer> result=numbers.stream()
                .limit(n)
                .collect(Collectors.toList());
        System.out.println(result);

    }
}

//Note:
//    limit(n): restrict stream to first n elements
//              commonly used in pagination's and top n records
