package io.fosdick.leetcode.questions.easy;

import java.util.Arrays;

/**
 * 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 *
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 */
public class ValidAnagram {

    /**
     * Sorting
     *   Time Complexity: O(n log n)
     *   Space Complexity: O(1)
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        return Arrays.equals(charArrayS, charArrayT);
    }

}
