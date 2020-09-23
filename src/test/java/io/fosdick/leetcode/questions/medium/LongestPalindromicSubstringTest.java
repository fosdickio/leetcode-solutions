package io.fosdick.leetcode.questions.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring longestPalindromicSubstring;

    @BeforeEach
    void setUp() {
        this.longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    void longestPalindrome1() {
        Assertions.assertEquals("aba", this.longestPalindromicSubstring.longestPalindrome("babad"));
    }

    @Test
    void longestPalindrome2() {
        Assertions.assertEquals("bb", this.longestPalindromicSubstring.longestPalindrome("cbbd"));
    }

}
