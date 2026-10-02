package com.java.top100.set06_adv_string_emp;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Problem 52: Check whether two strings are anagrams.
 * Anagram:Two words/strings are anagrams if they contain the same characters with the same frequency, but in a different order.
 * Anagram = Same characters + Same frequency + Different order
 * Input:
 * "listen"
 * "silent"
 * Output:
 * true
 */
public class P52_CheckAnagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        // =====================================
        // Approach 1: sorted() + Arrays.equals()
        // =====================================
        boolean isAnagram1=str1.length()==str2.length() &&
                Arrays.equals(
                        str1.chars().sorted().toArray(),
                        str2.chars().sorted().toArray());
        System.out.println(isAnagram1);
        /*
        Explanation:
            // length()        -> checks whether both strings have same length
            // chars()         -> converts String into IntStream
            // sorted()        -> sorts characters
            // toArray()       -> converts IntStream into int[]
            // Arrays.equals() -> compares both sorted character arrays
            // &&              -> both conditions must be true
        */

        // =====================================
        // Approach 2: groupingBy() + counting()+ Map.equals()
        // =====================================
        boolean isAnagram2=str1.chars()
                .mapToObj(ch-> (char) ch)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ))
                .equals(
                        str2.chars()
                                .mapToObj(ch-> (char) ch)
                                .collect(Collectors.groupingBy(
                                        Function.identity(),
                                        Collectors.counting()
                                ))
                );
        System.out.println(isAnagram2);
        /*
        Explanation:
            // chars()              -> converts String into IntStream
            // mapToObj()           -> converts int to Character
            // groupingBy()         -> groups same characters
            // Function.identity()  -> uses character as Map key
            // counting()           -> counts frequency of each character
            // equals()             -> compares both frequency Maps
            //
            // Same characters + same frequency = Anagram
        */

        // =====================================
        // Approach 2: groupingBy() + counting()
        // Frequency Map + Map.equals() (Separate Maps)
        // =====================================
        Map<Character, Long> frequuency1=str1.chars()
                .mapToObj(ch-> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        Map<Character, Long> frequuency2= str2.chars()
                .mapToObj(ch-> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(frequuency1.equals(frequuency2));
        /*
        Explanation:
            // frequency1 -> stores character frequencies of str1
            // frequency2 -> stores character frequencies of str2
            // groupingBy() -> groups characters
            // counting()  -> counts occurrences
            // Map.equals() -> compares keys and their frequencies
            //
            // If both Maps are equal -> strings are anagrams
        */

    }
}

