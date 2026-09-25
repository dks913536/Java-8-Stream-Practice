package com.java.top100.set04;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 31: Convert a String to List<Character>.
 *
 * Input:
 * "Java"
 *
 * Output:
 * [J, a, v, a]
 */

public class P31_StringToCharacterList {
    public static void main(String[] args) {
        String str="JAVA";

        List<Character> characters=str.chars()
                .mapToObj(ch-> (char) ch)
                .collect(Collectors.toList());
        System.out.println(characters);
    }
}
/*
Explanations:
str.chars() -> creates an IntStream of character/ASCII values.
 *
 * mapToObj(ch -> (char) ch)
 * -> converts each int value into Character.
 *
 * collect(Collectors.toList())
 * -> collects all characters into List<Character>.
 Key concept:
 * chars() returns IntStream, so mapToObj() is used
 * to convert int values into Character objects.
 */
