package com.java.top100.set05_strings;
/**
 * Problem 43: Count vowels in a string.
 *
 * Input:
 * "Hello World"
 *
 * Output:
 * 3
 */
public class P43_CountVowels {
    public static void main(String[] args) {
        String str="Hello world";

        // =====================================
        // Approach 1: filter() + OR conditions
        // =====================================
        long count=str.toLowerCase()
                .chars()
                .filter(ch->ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u')
                .count();
        System.out.println(count);

        // =====================================
        // Approach 2: filter() + indexOf()
        // =====================================
        long count2=str.toLowerCase()
                .chars()
                .filter(ch-> "aeiou".indexOf(ch) !=-1)
                .count();
        System.out.println(count2);
    }
}
/*
Explanation:
// =====================================
// Approach 1: filter() + OR conditions
// =====================================
// toLowerCase() -> converts to lowercase
// chars()       -> converts String to IntStream
// filter()      -> keeps only vowels
// count()       -> counts vowels

// =====================================
// Approach 2: filter() + indexOf()
// =====================================
// toLowerCase() -> converts to lowercase
// chars()       -> converts String to IntStream
// indexOf()     -> checks whether character exists in "aeiou"
// filter()      -> keeps matching vowels
// count()       -> counts vowels
 */
