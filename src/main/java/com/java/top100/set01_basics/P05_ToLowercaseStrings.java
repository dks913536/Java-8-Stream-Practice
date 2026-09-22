package com.java.top100.set01_basics;

/**
 *  Problem 04: Convert all strings to uppercase.
 *  Input:  ["java", "spring", "boot", "microservices"]
 *  Output: * ["JAVA", "SPRING", "BOOT", "MICROSERVICES"] */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P05_ToLowercaseStrings {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("java", "spring", "boot", "microservices");

        List<String> upperCase=str.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(upperCase);
    }
}


//Stream used: map() — transforms each string into uppercase.