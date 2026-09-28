package com.java.top100.set04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 40: Remove empty strings.
 *
 * Input:
 * ["Java", "", "Spring", "", "Boot"]
 *
 * Output:
 * ["Java", "Spring", "Boot"]
 */
public class P40_RemoveEmptyStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "", "Spring", "", "Boot");

        List<String> result=names.stream()
                .filter(name-> !name.isEmpty())
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
