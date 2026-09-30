package com.java.top100.set05_strings;
/**
 * Problem 44: Count consonants in a string.
 *
 * Input:
 * "Hello World"
 *
 * Output:
 * 7
 */
public class P44_CountConsonants {

    public static int countConstant(String str){
        int count=0;
        str=str.toLowerCase();
        for (char ch:str.toCharArray()){
            if(Character.isLetter(ch) && !(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u')) {
                count++;
            }
        }
        return count;
        /*
        Explanation:
        // toLowerCase()       -> converts String to lowercase
        // toCharArray()       -> converts String into char[]
        // for-each            -> processes each character
        // Character.isLetter()-> ignores spaces, digits and symbols
        // indexOf() == -1     -> character is not a vowel
        // countConsonants++   -> increments consonant count
        */
    }

    public static void countVowelConstant(String str){
        str=str.toLowerCase();
        long vowels=str.chars()
                .filter(Character::isLetter)
                .filter(ch-> "aeiou".indexOf(ch) != -1)
                .count();
        System.out.println("Vowels:" +vowels);

        long consonants=str.chars()
                .filter(Character::isLetter)
                .filter(ch-> "aeiou".indexOf(ch) == -1)
                .count();
        System.out.println("Consonants:" +consonants);
    }

    public static void main(String[] args) {

        String str="Hello World";

        // =====================================
        // Approach 1: filter() + Character.isLetter() + indexOf()
        // =====================================
        long countConsonant=str.toLowerCase()
                .chars()
                .filter(Character ::isLetter) // for not count space
                .filter(ch-> "aeiou".indexOf(ch) == -1)
                .count();
        System.out.println(countConsonant);

        /*
        Explanation:
        // toLowerCase()       -> converts String to lowercase
        // chars()             -> converts String to IntStream
        // Character.isLetter()-> keeps only alphabetic characters
        // indexOf()           -> checks whether character exists in "aeiou"
        // == -1               -> character is NOT a vowel
        // filter()            -> keeps consonants
        // count()             -> counts consonants
        */

        // =====================================
        // Approach 2: Single filter() + AND conditions
        // =====================================
        long countConsonant1=str.toLowerCase()
                .chars()
                .filter(ch-> Character.isLetter(ch) && "aeiou".indexOf(ch) == -1)
                .count();
        System.out.println(countConsonant1);

        /*
        Explanation:
        // toLowerCase()       -> converts String to lowercase
        // chars()             -> converts String to IntStream
        // Character.isLetter()-> ignores spaces, digits and symbols
        // indexOf() == -1     -> character is not a vowel
        // &&                  -> both conditions must be true
        // filter()            -> keeps only consonants
        // count()             -> counts consonants
        */


        // =====================================
        // Approach 3: filter() + Explicit OR conditions
        // =====================================
        long countConstant2=str.toLowerCase()
                .chars()
                .filter(ch->Character.isLetter(ch)
                        && !(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u')
                )
                .count();
        System.out.println(countConstant2);

        /*
        Explanation:

        // Character.isLetter() -> keeps only alphabetic characters
        // == 'a' ...         -> checks whether character is a vowel
        // !()                -> excludes vowels
        // &&                 -> character must be a letter and non-vowel
        // filter()           -> keeps consonants
        // count()            -> counts consonants
        */

        // =====================================
        // Approach 4: Traditional for-each loop
        // =====================================
        System.out.println(P44_CountConsonants.countConstant(str));

        // =====================================
        // Approach: Count Both Vowels and Consonants
        // =====================================
        P44_CountConsonants.countVowelConstant(str);




    }
}
