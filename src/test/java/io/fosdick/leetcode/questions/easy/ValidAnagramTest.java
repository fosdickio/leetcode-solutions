package io.fosdick.leetcode.questions.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    ValidAnagram validAnagram;

    @BeforeEach
    void setUp() {
        this.validAnagram = new ValidAnagram();
    }

    @Test
    void isAnagram1() {
        Assertions.assertEquals(true, this.validAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    void isAnagram2() {
        Assertions.assertEquals(false, this.validAnagram.isAnagram("rat", "car"));
    }

}