package com.java.top100.set05_strings;

import javax.swing.text.Keymap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Problem 47: Find first non-repeated character.
 *
 * Input:
 * "swiss"
 *
 * Output:
 * w
 *
 * Stream methods:
 * chars()       -> creates IntStream
 * mapToObj()    -> converts int to Character
 * groupingBy()  -> groups characters
 * counting()    -> counts occurrences
 * entrySet()    -> creates stream of Map entries
 * filter()      -> keeps characters occurring once
 * map()         -> extracts character
 * findFirst()   -> returns first matching element
 */
public class P47_FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str="swiss";

        // =====================================
        // Approach 1: groupingBy() + LinkedHashMap + counting()
        // =====================================
        Character firstNonRepeated = str.chars()
                        .mapToObj(ch->(char) ch)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap:: new ,
                                Collectors.counting()
                        ))
                        .entrySet().stream()
                        .filter(e->e.getValue()==1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null);
        System.out.println(firstNonRepeated);
        /*
        Explanation:
            // chars()              -> converts String into IntStream
            // mapToObj()           -> converts int to Character
            // groupingBy()         -> groups same characters
            // Function.identity()  -> uses character as Map key
            // LinkedHashMap::new   -> preserves original character order
            // counting()           -> counts occurrences of each character
            // entrySet()            -> creates Stream of Map entries
            // filter()             -> keeps characters occurring exactly once
            // map()                 -> extracts the character from Map.Entry
            // findFirst()           -> gets the first non-repeated character
            // orElse(null)          -> returns null if no non-repeated character exists
        */

        // =====================================
        // Approach 2: indexOf() + lastIndexOf()
        // =====================================
        Character firstNonRepeated1=str.chars()
                .mapToObj(ch->(char) ch)
                .filter(ch-> str.indexOf(ch)== str.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println(firstNonRepeated1);

        /*
        Explanation:
            // chars()          -> converts String into IntStream
            // mapToObj()       -> converts int to Character
            // indexOf(ch)      -> returns first position of character
            // lastIndexOf(ch)  -> returns last position of character
            // ==               -> same position means character occurs only once
            // filter()         -> keeps non-repeated characters
            // findFirst()      -> returns the first non-repeated character
            // orElse(null)     -> returns null if no unique character exists
        */
    }
}
