package com.java.top100.set03_intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Problem 29: Find non-common elements between two lists.
 *
 * Input:
 * List 1 = [10, 20, 30, 40]
 * List 2 = [30, 40, 50, 60]
 *
 * Output:
 * [10, 20, 50, 60]
 */

public class P29_NonCommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40);

        List<Integer> list2 = Arrays.asList(30, 40, 50, 60);

        List<Integer> result1= Stream.concat(
                    list1.stream().
                            filter(num-> !list2.contains(num)),
                    list2.stream().
                            filter(num-> !list1.contains(num))
                )
                .collect(Collectors.toList());
        System.out.println(result1);
    }
}
/*
Explanation:
 * Step 1:
 * From list1, keep elements that are NOT present in list2.
 * Result: [10, 20]
 *
 * Step 2:
 * From list2, keep elements that are NOT present in list1.
 * Result: [50, 60]
 *
 * Step 3:
 * Stream.concat() combines both results.
 *
 * Final result:
 * [10, 20, 50, 60]
 *
 * Key concepts:
 list1 → remove common + list2 → remove common → concat = non-common elements from both lists.

 * - filter() -> filters elements based on a condition
 * - !contains() -> keeps elements that don't exist in the other list
 * - Stream.concat() -> combines two streams into one stream
 */
