package com.java.top100.set05_strings;
/**
 * Problem 42: Check whether a string is palindrome.
 *
 * Input:
 * "madam"
 *
 * Output:
 * true
 */
public class P42_CheckPalindrome {
    // =====================================
    // Approach 2: Stream chars() + reduce()
    // =====================================
    public static  boolean isPalindrome(String str1){
        String reversed=str1.chars()
                .mapToObj(ch->String.valueOf((char) ch))
                .reduce("", (ch,rev)->rev+ch);
        return str1.equals(reversed);
    }
    // =====================================
    // Approach 3: StringBuilder reverse()
    // =====================================
    public static  boolean isPalindrome2(String str2) {
        String reversed2 = new StringBuilder(str2)
                .reverse()
                .toString();
        return str2.equals(reversed2);
    }

    public static void main(String[] args) {
        String str="madam";

        // =====================================
        // Approach 1: Inline StringBuilder reverse()
        // =====================================
        boolean result=str.equals(
                new StringBuilder(str)
                        .reverse().toString()
        );
        System.out.println(result);

        // =====================================
        System.out.println(P42_CheckPalindrome.isPalindrome(str));

        // =====================================
        System.out.println(P42_CheckPalindrome.isPalindrome2(str));
    }

}

/*
Explanation:
// =====================================
// Approach 2: Stream chars() + reduce()
// =====================================
// chars()       -> converts String into IntStream
// mapToObj()    -> converts int character into String
// reduce()      -> creates reversed String
// equals()      -> compares original and reversed String

// =====================================
// Approach 3: StringBuilder reverse()
// =====================================
// StringBuilder -> creates mutable String
// reverse()     -> reverses the String
// toString()    -> converts back to String
// equals()      -> compares original and reversed String
 */
