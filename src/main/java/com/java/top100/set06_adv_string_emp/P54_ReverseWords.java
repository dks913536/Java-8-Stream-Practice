package com.java.top100.set06_adv_string_emp;
import java.util.Arrays;
import java.util.stream.Collectors;
/**
 * Problem 54: Reverse words in a sentence.
 *
 * Input:
 * "Java is easy"
 *
 * Output:
 * "easy is Java"
 */
public class P54_ReverseWords {

    // =====================================
    // Approach 1: Stream + reduce()
    // =====================================
    public static String reverseWords1(String sentence) {

        return Arrays.stream(sentence.trim().split("\\s+"))
                .reduce("", (result, word) -> word + " " + result)
                .trim();
    }
    /*
    Explanation:
        // split() -> separates sentence into words
        // Arrays.stream() -> creates Stream<String>
        // reduce() -> combines words
        // word + result -> adds current word at beginning
        // trim() -> removes extra spaces
    */

    // =====================================
    // Approach 2: Stream + sorted() by index
    // =====================================
    public static String reverseWords2(String sentence) {

        String[] words = sentence.trim().split("\\s+");

        return java.util.stream.IntStream.range(0, words.length)
                .mapToObj(i -> words[words.length - 1 - i])
                .collect(Collectors.joining(" "));
    }

    /*
    Explanation:
        // IntStream.range() -> creates indexes
        // mapToObj() -> gets words in reverse index order
        // joining(" ") -> joins words with spaces
    */
    public static void main(String[] args) {
        String sentence = "Java is easy";

        System.out.println(reverseWords1(sentence));
        System.out.println(reverseWords2(sentence));

    }
}
