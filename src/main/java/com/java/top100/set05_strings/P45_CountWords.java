package com.java.top100.set05_strings;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Problem 45: Count words in a sentence.
 *
 * Input:
 * "Java is easy to learn"
 *
 * Output:
 * 5
 */
public class P45_CountWords {
    public static void main(String[] args) {
        String sentence="Java is easy to learn";

        // =====================================
        // Approach 1: split() + Stream
        // =====================================
        long wordCount= Arrays.stream(sentence.trim().split("\\s+"))
                .count();
        System.out.println(wordCount);

        // =====================================
        // Approach 2: Stream.of()
        // =====================================
        long wordCount2= Stream.of(sentence.trim().split("\\s+"))
                .count();
        System.out.println(wordCount2);
    }
}
/*
Explanation:
    trim()       → removes leading/trailing spaces
    split("\\s+") → splits using one or more whitespace characters
    Arrays.stream() → creates Stream<String>
    count()      → counts words

    \\s → whitespace
    +   → one or more
 */
