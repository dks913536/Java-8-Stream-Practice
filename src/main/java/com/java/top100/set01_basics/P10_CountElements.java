package com.java.top100.set01_basics;

/**
 * Problem 10: Count total elements in a list.
 * Input:  [10, 20, 30, 40, 50]
 * Output:  5
 * */
import java.util.Arrays;
import java.util.List;

public class P10_CountElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        long count=numbers.stream()
                .count();

        System.out.println(count);
    }
}
