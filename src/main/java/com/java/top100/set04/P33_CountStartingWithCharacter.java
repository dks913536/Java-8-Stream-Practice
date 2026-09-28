package com.java.top100.set04;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 33: Count strings starting with a specific character.
 *
 * Input:
 * ["Java", "JavaScript", "Spring", "JPA", "Docker"]
 * Character = 'J'
 *
 * Output:
 * 3
 */

public class P33_CountStartingWithCharacter {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "JavaScript", "Spring", "JPA", "Docker");

        char ch='j';

        // =====================================
        // Approach 1: Using toLowerCase() + startsWith()
        // =====================================

        long count=names.stream()
                .filter(name-> name.toLowerCase().startsWith(String.valueOf(ch)))
                .count();
        System.out.println(count);

        // =====================================
        // Approach 2: Using charAt() + Character.toLowerCase()
        // =====================================

        long count2=names.stream()
                .filter(name->!name.isEmpty() &&
                       Character.toLowerCase(name.charAt(0))==Character.toLowerCase(ch)
                        )
                .count();
        System.out.println(count2);
    }

}

/*
Explanation:

 * Approach 1:
 * toLowerCase() -> makes the complete String lowercase.
 * startsWith()  -> checks whether it starts with the given character.
 *
 * Approach 2:
 * charAt(0) -> gets the first character.
 * Character.toLowerCase() -> makes comparison case-insensitive.
 * !name.isEmpty() -> prevents StringIndexOutOfBoundsException.
 *
 * Both approaches are case-insensitive.
 */
