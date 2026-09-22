package com.java.top100.set01_basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** * Problem 01: Find all even numbers from a list.
 *
 *  Input:  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 *  Output: * [2, 4, 6, 8, 10]
 */

public class P01_FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNum=numbers.stream()
                .filter(num->num%2==0)
                .collect(Collectors.toList());

        System.out.println("Even Num:"+evenNum);
    }
}
