package com.java.top100.set05_strings;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Problem 49: Remove duplicate characters.
 * Input:
 * "programming"
 * Output:
 * "progamin"
 */
public class P49_RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str="programming";

        // =====================================
        // Approach 1: distinct() + joining()
        // =====================================
        String result=str.chars()
                .distinct()
                .mapToObj(ch-> String.valueOf((char) ch))
                .collect(Collectors.joining());
        System.out.println(result);
        /*
        Explanation:
            // chars()          -> converts String into IntStream
            // distinct()       -> removes duplicate characters and keeps first occurrence
            // mapToObj()       -> converts int character code to String
            // String.valueOf() -> converts character to String
            // joining()        -> joins all characters into one String
        */

        // =====================================
        // Approach 2: HashSet + filter()
        // =====================================
        Set<Character> seen=new HashSet<>();

        String result2=str.chars()
                .mapToObj(ch-> (char) ch)
                .filter(ch-> seen.add(ch))
                .map(String :: valueOf)
                .collect(Collectors.joining());
        System.out.println(result2);
        /*
        Explanation:
            // HashSet        -> stores characters already encountered
            // chars()        -> converts String into IntStream
            // mapToObj()     -> converts int to Character
            // seen.add(ch)   -> returns true for first occurrence
            // filter()       -> keeps only first occurrence of each character
            // map()          -> converts Character to String
            // joining()      -> joins characters into one String
        */
    }
}
