package com.java.top100.set03_intermediate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Problem 28: Find common elements between two lists.
 *
 * Input:
 * List 1 = [10, 20, 30, 40]
 * List 2 = [30, 40, 50, 60]
 *
 * Output:
 * [30, 40]
 */

public class P28_CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40);

        List<Integer> list2 = Arrays.asList(30, 40, 50, 60);

        // =====================================
        // Approach 1: Using List.contains() :O(n)
        // =====================================
        List<Integer> common1=list1.stream()
                .filter(list2 ::contains )
                .collect(Collectors.toList());
        System.out.println(common1);

        // =====================================
        // Approach 1: Using HashSet.contains() :O(1)
        // Note: for large data and better lookup performance , store one list in to a set
        // =====================================
        Set<Integer> set=new HashSet<>(list2);
        List<Integer> common2=list1.stream()
                .filter(set::contains)
                .collect(Collectors.toList());
        System.out.println(common2);

        // =====================================
        // Approach 2: filter() + anyMatch()
        // =====================================
        List<Integer> common3 = list1.stream()
                .filter(num -> list2.stream()
                        .anyMatch(value -> value.equals(num)))
                .collect(Collectors.toList());

        System.out.println(common3);

    }
}
