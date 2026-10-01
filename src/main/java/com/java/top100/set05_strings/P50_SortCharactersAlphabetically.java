package com.java.top100.set05_strings;

import java.util.stream.Collectors;

/**
 * Problem 50: Sort characters alphabetically.
 * Input:
 * "java"
 * Output:
 * "aajv"
 */
public class P50_SortCharactersAlphabetically {
    public static void main(String[] args) {
        String str="java";
        // =====================================
        // Approach 1: mapToObj() + sorted()
        // =====================================
        String sorted=str.chars()
                .mapToObj(ch-> (char) ch)
                .sorted()
                .map(String ::valueOf)
                .collect(Collectors.joining());
        System.out.println(sorted);
        /*
        Explanation:
            // chars()          -> converts String into IntStream
            // mapToObj()       -> converts int to Character
            // sorted()         -> sorts characters in ascending order
            // map()            -> converts Character to String
            // joining()        -> joins sorted characters into one String
        */

        // =====================================
        // Approach 2: sorted() + mapToObj()
        // =====================================
        String sorted2=str.chars()
                .sorted()
                .mapToObj(ch-> String.valueOf(ch))
                .collect(Collectors.joining());
        System.out.println(sorted2);
        /*
        Explanation:
            // chars()          -> converts String into IntStream
            // sorted()         -> sorts character codes in ascending order
            // mapToObj()       -> converts each int character code to String
            // String.valueOf() -> converts int to its corresponding character representation
            // joining()        -> joins all characters into one String
        */

        // =====================================
        // Approach 3: distinct() + sorted() + joining() (Remove Duplicate Character)
        // =====================================
        String sorted3=str.chars()
                .distinct()
                .sorted()
                .mapToObj(ch-> String.valueOf(ch))
                .collect(Collectors.joining());
        System.out.println(sorted3);

        /*
        Explanation:
            // chars()          -> converts String into IntStream
            // distinct()       -> removes duplicate character codes
            // sorted()         -> sorts characters in ascending order
            // mapToObj()       -> converts int character codes to String
            // String.valueOf() -> converts int to character representation
            // joining()        -> joins characters into one String
        */

    }
}
