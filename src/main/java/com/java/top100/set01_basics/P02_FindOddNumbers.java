package com.java8.set01_basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 02: Find all odd numbers from a list.
 *
 * Input: * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 *
 * Output: * [1, 3, 5, 7, 9]
 *
 **/

public class P02_FindOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> oddNum=numbers.stream()
                .filter(num-> num%2 !=0)
                .collect(Collectors.toList());
        System.out.println("Odd Number: "+oddNum);
    }
}

/*
Note:
Stream used: filter() — keeps numbers that satisfy the odd-number condition.

Complexity: O(n) time.
 */