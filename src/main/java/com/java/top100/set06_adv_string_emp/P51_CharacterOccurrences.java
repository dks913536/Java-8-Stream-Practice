package com.java.top100.set06_adv_string_emp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Problem 51: Count occurrences of each character.
 *
 * Input:
 * "programming"
 *
 * Output:
 * {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
 */
public class P51_CharacterOccurrences {
    public static void main(String[] args) {
        String str="programming";

        // =====================================
        // Approach 1: groupingBy() + counting()
        // =====================================
        Map<Character,Long> count=str.chars()
                .mapToObj(ch->(char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(count);
        /*
        Explanation:
            // chars()          -> converts String into IntStream
            // mapToObj()       -> converts int to Character
            // groupingBy()     -> groups same characters
            // identity()       -> character becomes Map key
            // counting()       -> counts occurrences
        */

        // =====================================
        // Approach 2: LinkedHashMap + counting()
        // =====================================
        Map<Character,Long> count2=str.chars()
                .mapToObj(ch-> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap :: new,
                        Collectors.counting()
                ));
        System.out.println(count2);
        /*
        Explanation:
            // LinkedHashMap -> maintains insertion order
            // Useful when character order matters
        */
    }
}
