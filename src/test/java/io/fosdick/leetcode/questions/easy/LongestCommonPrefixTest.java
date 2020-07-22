package io.fosdick.leetcode.questions.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    void setUp() {
        this.longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    void longestCommonPrefix() {
        String[] testCase = {"flower", "flow", "flight"};
        Assertions.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(testCase));
    }
}