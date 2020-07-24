package io.fosdick.leetcode.questions.easy;

/**
 * 125. Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome/
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {

    /**
     * Two pointers
     *   Time Complexity: O(n)
     *   Space Complexity: O(1)
     */
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        s = s.toLowerCase();
        char[] chars = s.toCharArray();

        int n = s.length();
        int left = 0;
        int right = n - 1;

        while (left < right) {
            while (left < n && !Character.isLetterOrDigit(chars[left])) {
                left++;
            }
            while (right >= 0 && !Character.isLetterOrDigit(chars[right])) {
                right--;
            }
            if (left < right && chars[left++] != chars[right--]) {
                return false;
            }
        }

        return true;
    }

}
