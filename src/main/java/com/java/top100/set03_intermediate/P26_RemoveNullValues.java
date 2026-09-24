package com.java.top100.set03_intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 26: Remove null values from a list.
 *
 * Input:
 * [Java, null, Spring, null, Boot]
 *
 * Output:
 * [Java, Spring, Boot]
 */

public class P26_RemoveNullValues {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("Java", null, "Spring", null, "Boot");

        List<String> result=names.stream()
                .filter(name -> name != null)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
