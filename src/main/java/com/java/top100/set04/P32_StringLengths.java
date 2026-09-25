package com.java.top100.set04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Problem 32: Find length of each string.
 *
 * Input:
 * ["Java", "Spring", "Boot"]
 *
 * Output:
 * [4, 6, 4]
 */
public class P32_StringLengths {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "Boot");

        // =====================================
        // Approach 1: String -> Length
        // =====================================
        List<Integer> length1=names.stream()
                .map(String::length)// convert each string to it's length
                .collect(Collectors.toList());
        System.out.println(length1);

        // =====================================
        // Approach 2: String -> Length Map
        // =====================================
        Map<String,Integer> length2=names.stream()
                .collect(Collectors.toMap(str->str, String::length));

        System.out.println(length2);  // output:{Java=4, Spring=6, Boot=4}

        // =====================================
        // Approach 3: Group Strings by Length
        // =====================================
        Map<Integer,List<String>> length3=names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(length3); // output:{4=[Java, Boot], 6=[Spring]}


    }
}
