package com.java.top100.set04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Problem 39: Count frequency of each element.
 *
 * Input:
 * [10, 20, 10, 30, 20, 10]
 *
 * Output:
 * {10=3, 20=2, 30=1}
 */
public class P39_CountFrequency {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 10);

        // =====================================
        // Approach 1: groupingBy() + counting()
        // =====================================
        Map<Integer,Long> countFreq1=numbers.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(countFreq1);

        // =====================================
        // Approach 2: groupingBy() + summingInt()
        // =====================================
        Map<Integer,Integer> countFreq2=numbers.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.summingInt(number->1)
                ));
        System.out.println(countFreq2);
    }
}
/*
Explanation:
Function.identity() → uses the number itself as the key.
groupingBy() → groups identical numbers.
counting() → counts how many elements are in each group.
Result type → Map<Integer, Long> because counting() returns Long.

// summingInt(1)   -> frequency as Integer
// Function.identity() -> element itself becomes the key
 */
