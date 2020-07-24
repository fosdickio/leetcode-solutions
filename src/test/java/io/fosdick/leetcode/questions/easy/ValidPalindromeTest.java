package io.fosdick.leetcode.questions.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    private ValidPalindrome validPalindrome;

    @BeforeEach
    void setUp() {
        this.validPalindrome = new ValidPalindrome();
    }

    @Test
    void isPalindrome1() {
        String testCase = "A man, a plan, a canal: Panama";
        Assertions.assertEquals(true, validPalindrome.isPalindrome(testCase));
    }

    @Test
    void isPalindrome2() {
        String testCase = "race a car";
        Assertions.assertEquals(false, validPalindrome.isPalindrome(testCase));
    }

}