package com.java.top100.set06_adv_string_emp;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Problem 55: Find longest word in a sentence.
 *
 * Input:
 * "Java Spring Boot"
 *
 * Output:
 * "Spring"
 */

public class P55_LongestWord {
    public static void main(String[] args) {
        String str="Java Spring Boot";

        // =====================================
        // Approach 1: max() + Comparator.comparing()
        // =====================================
        String result1= Arrays.stream(str.trim().split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(result1);

           /*
            Explanation:
                // Arrays.stream() -> creates Stream<String>
                // max() -> finds maximum element
                // comparing() -> compares words by length
                // orElse() -> handles empty Stream
            */

        // =====================================
        // Approach 2: reduce() + lambda
        // =====================================

        String result2=Arrays.stream(str.trim().split("\\s+"))
                .reduce((w1,w2)->w1.length() > w2.length() ? w1:w2)
                .orElse("");
        System.out.println(result2);

        // =====================================
        // Approach 2: max() + lambda
        // =====================================

        String result3= Arrays.stream(str.trim().split("\\s+"))
                .max((word1, word2) ->
                        Integer.compare(word1.length(), word2.length()))
                .orElse(null);
        System.out.println(result3);

        /*
        Explanation:
            // max() -> finds longest word
            // Integer.compare() -> compares word lengths
            // orElse(null) -> handles empty Stream
        */
    }
}
