package com.java.top100.set06_adv_string_emp;

import java.util.stream.IntStream;

/**
 * Problem 53: Check whether one string is rotation of another.
 *
 * Input:
 * "abcd"
 * "cdab"
 *
 * Output:
 * true
 * Notes:
 * String Rotation: One string is a rotation of another if you can move some characters from the beginning to the end (or end to beginning) and get the other string.
 *
 * Example:
 * "abcd" → "cdab" → true
 * "abcd" → "bcda" → true
 * "abcd" → "dabc" → true
 * "abcd" → "acbd" → false
 *
 * Rotation = Same characters + Same order + Characters shifted circularly.
 */
public class P53_CheckStringRotation {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";

        // =====================================
        // Approach 1: concat() + contains()
        // =====================================
        boolean isRotation= str1.length() == str2.length() &&
                (str1+str2).contains(str2);
        System.out.println(isRotation);
        /*
        Explanation:
            // length()  -> both strings must have same length
            // str1 + str1 -> creates doubled String
            // contains() -> checks whether str2 exists inside doubled String
        */

        // =====================================
        // Approach 2: concat() + indexOf()
        // =====================================
        boolean isRotation2= str1.length() == str2.length() &&
                IntStream.range(0,str1.length())
                        .mapToObj(i-> str1.substring(i) + str1.substring(0, i))
                        .anyMatch(str2:: equals);
        System.out.println(isRotation2);

        /*
        Explanation:
            // length()       -> checks whether both strings have equal length
            // IntStream.range() -> generates rotation starting positions (0 to length-1)
            // substring(i)   -> gets characters from index i to the end
            // substring(0,i) -> gets characters from the beginning up to index i
            // +              -> joins both parts to create a rotation
            // mapToObj()     -> converts each index into a rotated String
            // anyMatch()     -> checks whether any rotation matches str2
            // str2::equals   -> compares each generated rotation with str2
        */
    }
}
