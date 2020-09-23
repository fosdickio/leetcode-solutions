package io.fosdick.leetcode.questions.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters longestSubstring;

    @BeforeEach
    void setUp() {
        this.longestSubstring = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void lengthOfLongestSubstring1() {
        Assertions.assertEquals(3, this.longestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void lengthOfLongestSubstring2() {
        Assertions.assertEquals(1, this.longestSubstring.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void lengthOfLongestSubstring3() {
        Assertions.assertEquals(3, this.longestSubstring.lengthOfLongestSubstring("pwwkew"));
    }

}