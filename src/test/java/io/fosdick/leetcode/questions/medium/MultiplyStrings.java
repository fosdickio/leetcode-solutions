package io.fosdick.leetcode.questions.medium;

/**
 * 43. Multiply Strings
 * https://leetcode.com/problems/multiply-strings/
 *
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also
 * represented as a string.
 */
public class MultiplyStrings {

    /**
     * String Conversion
     *   Time Complexity: O(1)
     *   Space Complexity: O(1)
     */
    public String multiply(String num1, String num2) {
        int answer = Integer.parseInt(num1) * Integer.parseInt(num2);
        return Integer.toString(answer);
    }

}
