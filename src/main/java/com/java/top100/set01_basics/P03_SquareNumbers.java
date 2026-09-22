package com.java8.set01_basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 03: Square every number in a list.
 * Input: * [1, 2, 3, 4, 5]
 * Output: * [1, 4, 9, 16, 25]
 * */

public class P03_SquareNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squareNum=numbers.stream()
                .map(num->num*num)
                .collect(Collectors.toList());

        System.out.println(squareNum);
    }
}

/*
Stream used: map() — transforms each number into its square.
Complexity: O(n) time.
 */
