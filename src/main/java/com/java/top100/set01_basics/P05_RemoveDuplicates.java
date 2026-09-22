package com.java.top100.set01_basics;


/**
 * Problem 05: Remove duplicate elements from a list.
 * Input: * [10, 20, 10, 30, 20, 40, 30]
 * Output: * [10, 20, 30, 40] */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P05_RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10, 20, 10, 30, 20, 40, 30);

        List<Integer> uniqueNum=numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueNum);
    }
}
// distinct(): used to remove duplicate and uses internally equals() and hashCode() method.
// Complexity: O(n) time.

