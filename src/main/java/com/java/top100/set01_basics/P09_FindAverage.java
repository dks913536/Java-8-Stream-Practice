package com.java.top100.set01_basics;

/**
 * Problem 09: Find the average of all numbers.
 * Input: * [10, 20, 30, 40, 50]
 * Output: 30.0
 * */

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class P09_FindAverage {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10, 20, 30, 40, 50);

        // =====================================
        // Approach 1:Using average() + orElse()
        // =====================================
        double average1=numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(average1);

        // =====================================
        // Approach 2:Using OptionalDouble
        // =====================================
        OptionalDouble average2=numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(average2);
    }
}
