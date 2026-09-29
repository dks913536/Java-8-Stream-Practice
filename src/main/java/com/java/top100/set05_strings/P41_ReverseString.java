package com.java.top100.set05_strings;
/**
 * Problem 41: Reverse a string.
 *
 * Input:
 * "Java"
 *
 * Output:
 * "avaJ"
 */
public class P41_ReverseString {
    public static void main(String[] args) {
        String str="Java";

        // =====================================
        // Approach 1: chars() + mapToObj() + reduce()
        // =====================================
        String revered=str.chars()
                .mapToObj(ch->String.valueOf((char) ch))
                .reduce("", (ch,rev)-> rev+ch);

        System.out.println(revered);

        // =====================================
        // Approach 2: StringBuilder reverse()
        // =====================================
        String reversed2= new StringBuilder(str)
                .reverse()
                .toString();
        System.out.println(reversed2);

    }
}
/*
Explanation:
// =====================================
// Approach 1: chars() + mapToObj() + reduce()
// =====================================
// chars()       -> converts String into IntStream
// mapToObj()    -> converts int character into String
// reduce()      -> combines characters into one String
// rev + ch      -> adds current character before previous result

// =====================================
// Approach 2: StringBuilder reverse()
// =====================================
// StringBuilder -> creates mutable String
// reverse()     -> reverses the String
// toString()    -> converts StringBuilder back to String

 */
