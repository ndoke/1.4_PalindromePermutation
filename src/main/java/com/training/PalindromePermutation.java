package com.training;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link PalindromePermutation} has methods to test whether a given string
 * is a permutation of a palindrome.
 * {@link PalindromePermutation#isPalindrome(String)} tests whether the two strings are
 * permutations of each other or not.
 * {@link PalindromePermutation#} tests whether the two strings are
 * permutations of each other or not.
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class PalindromePermutation {
    private static final int TOTAL_CHARS_ENGLISH = 26;
    private static final int FIRST_LOWER_CHAR_ENGLISH = 97;
    private static final int FIRST_UPPER_CHAR_ENGLISH = 65;

    /**
     * Returns true if the string is a permutation of a palindrome
     *
     * @param input string to be tested
     * @return true if both strings are permutation of each other
     */
    public boolean isPalindrome(String input) {
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            Character currentChar = input.charAt(i);
            if (counts.containsKey(currentChar)) {
                int temp = counts.get(currentChar);
                temp++;
                counts.put(currentChar, temp);
            } else {
                counts.put(currentChar, 1);
            }
        }

        boolean oddFound = false;
        for (Character x : counts.keySet()) {
            if (counts.get(x) % 2 == 1) {
                if (oddFound) {
                    return false;
                }
                oddFound = true;
            }
        }
        return true;
    }

    /**
     * Returns true if the string is a permutation of a palindrome
     * by using a checker.
     *
     * @param input string to be tested
     * @return true if both strings are permutation of each other
     */
    public boolean isPalindromeChecker(String input) {
        // initialize checker to 0
        int checker = 0;

        // loop through the string
        for (int i = 0; i < input.length(); i++) {
            // get intValOfCurrentChar = (int value of each character - int value of 'a'/'A')
            int intValOfCurrentChar = (int) input.charAt(i);
            if (intValOfCurrentChar >= 65 && intValOfCurrentChar <= 90) {
                intValOfCurrentChar -= FIRST_UPPER_CHAR_ENGLISH;
            } else if (intValOfCurrentChar >= 97 && intValOfCurrentChar <= 122) {
                intValOfCurrentChar -= FIRST_LOWER_CHAR_ENGLISH;
            }

            // left shift 1 by intValOfCurrentChar
            int val = 1 << intValOfCurrentChar;

            // if checker contains intValOfCurrentChar, clear that bit, or else make that bit 1
            if ((checker & val) != 0) {
                checker = checker & ~val;
            } else {
                checker = checker | val;
            }
        }

        return checker == 0 || (checker & (checker - 1)) == 0;
    }
}
