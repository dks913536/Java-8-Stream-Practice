package com.java.top100.set05_strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Problem 46: Find duplicate characters.
 *
 * Input:
 * "programming"
 *
 * Output:
 * [r, g, m]
 */
public class P46_DuplicateCharacters {
    public static void main(String[] args) {

        String str = "programming";

        // =====================================
        // Approach 1: groupingBy() + counting()
        // =====================================

        Map<Character, Long> frequency = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        List<Character> duplicates = frequency.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicates);

        /*
        Explanation:
            // chars()          -> converts String into IntStream
            // mapToObj()       -> converts int character codes to Character
            // groupingBy()     -> groups identical characters
            // Function.identity() -> uses character itself as Map key
            // counting()       -> counts occurrences of each character
            // entrySet()       -> converts Map into Stream of key-value entries
            // filter()         -> keeps entries whose count is greater than 1
            // map()            -> extracts the duplicate character
            // collect()        -> converts Stream into List
        */

        // =====================================
        // Approach 2: HashSet + filter()
        // =====================================
        Set<Character> seen=new HashSet<>();
        Set<Character> duplicate2=str.chars()
                .mapToObj(ch-> (char) ch)
                .filter(ch-> !seen.add(ch))
                .collect(Collectors.toSet());
        System.out.println(duplicate2);
        /*
        Explanation:
            // HashSet        -> stores characters already encountered
            // chars()        -> converts String into IntStream
            // mapToObj()     -> converts int to Character
            // seen.add(ch)   -> returns true for first occurrence
            // !seen.add(ch)  -> true when character already exists
            // filter()       -> keeps repeated characters
            // toSet()        -> removes duplicate results
        */

        // =====================================
        // Approach 3: HashSet + LinkedHashSet (Preserve insertion order)
        // =====================================
        Set<Character> seen2=new HashSet<>();
        Set<Character> duplicate3=str.chars()
                .mapToObj(ch->(char) ch)
                .filter(ch-> !seen2.add(ch))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(duplicate3);
        /*
        Explanation:
            // HashSet         -> tracks already-seen characters
            // !seen2.add(ch)  -> identifies repeated characters
            // filter()        -> keeps only duplicates
            // LinkedHashSet   -> removes duplicates and preserves insertion order
            // toCollection()  -> collects Stream into specified collection
        */

        // =====================================
        // Approach 4: distinct() + count()
        // =====================================
        Set<Character> duplicate4=str.chars()
                .mapToObj(ch->(char) ch)
                .distinct()
                .filter(c->str.chars().filter(ch-> ch==c).count()>1)
                .collect(Collectors.toSet());
        System.out.println(duplicate4);
        /*
        Explanation:
            // chars()       -> converts String into IntStream
            // mapToObj()    -> converts int to Character
            // distinct()    -> keeps each character only once
            // filter()      -> checks frequency of each character
            // inner filter()-> keeps occurrences matching current character
            // count()       -> counts occurrences of current character
            // > 1           -> character is duplicate
            // toSet()       -> collects duplicate characters
        */
    }
}

