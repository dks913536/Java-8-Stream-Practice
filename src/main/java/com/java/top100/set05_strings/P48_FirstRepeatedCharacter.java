package com.java.top100.set05_strings;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Problem 48: Find first repeated character.
 * Input:
 * "swiss"
 * Output:
 * s
 */
public class P48_FirstRepeatedCharacter {
    public static void main(String[] args) {

        String str = "swiss";
        // =====================================
        // Approach 1: indexOf() + lastIndexOf()
        // =====================================
        Character firstRepeated = str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> str.indexOf(ch) != str.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println(firstRepeated);

        /*
        Explanation:
            // chars()          -> converts String into IntStream
            // mapToObj()       -> converts int to Character
            // indexOf(ch)      -> returns first position of character
            // lastIndexOf(ch)  -> returns last position of character
            // !=               -> different positions mean character is repeated
            // filter()         -> keeps repeated characters
            // findFirst()      -> returns the first repeated character
            // orElse(null)     -> returns null if no repeated character exists
        */

        // =====================================
        // Approach 2: HashSet + add()
        // =====================================
        Set<Character> seen=new HashSet<>();

        Character firstRepeated2=str.chars()
                .mapToObj(ch-> (char) ch)
                .filter(ch-> !seen.add(ch))
                .findFirst()
                .orElse(null);
        System.out.println(firstRepeated2);
        /*
        Explanation:
            // HashSet        -> stores characters already encountered
            // chars()        -> converts String into IntStream
            // mapToObj()     -> converts int to Character
            // seen.add(ch)   -> returns true for first occurrence
            // !seen.add(ch)  -> true when character is already present
            // filter()       -> keeps the first repeated occurrence
            // findFirst()    -> returns the first repeated character
            // orElse(null)   -> returns null if no duplicate exists
        */

        // =====================================
        // Approach 3: groupingBy() + LinkedHashMap + counting()
        // =====================================
        Character firstRepeated3=str.chars()
                .mapToObj(ch-> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap :: new,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(e-> e.getValue() > 1)
                .map(Map.Entry ::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(firstRepeated3);
        /*
        Explanation:
            // chars()              -> converts String into IntStream
            // mapToObj()           -> converts int to Character
            // groupingBy()         -> groups same characters
            // Function.identity()  -> uses character as Map key
            // LinkedHashMap::new   -> preserves original character order
            // counting()           -> counts occurrences of each character
            // entrySet()            -> creates Stream of Map entries
            // filter()             -> keeps characters occurring more than once
            // map()                 -> extracts the character from Map.Entry
            // findFirst()           -> returns the first repeated character
            // orElse(null)          -> returns null if no repeated character exists
        */
    }
}
