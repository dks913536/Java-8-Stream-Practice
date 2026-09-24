package com.java.top100.set03_intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 30: Convert List<String> to comma-separated String.
 *
 * Input:
 * ["Java", "Spring", "Boot", "Microservices"]
 *
 * Output:
 * Java,Spring,Boot,Microservices
 */

public class P30_CommaSeparatedString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "Boot", "Microservices");
        String result=names.stream()
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
/*
Notes:
Key concept:
 * - Collectors.joining(",") -> joins stream elements into one String
 * - "," -> delimiter placed between elements
 *
 * Example:
 * joining(",")      -> Java,Spring,Boot
 * joining(" - ")    -> Java - Spring - Boot
 * joining()         -> JavaSpringBoot
 */
