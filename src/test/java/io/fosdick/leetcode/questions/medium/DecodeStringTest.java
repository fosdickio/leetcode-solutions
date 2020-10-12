package io.fosdick.leetcode.questions.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodeStringTest {

    private DecodeString decodeString;

    @BeforeEach
    void setUp() {
        this.decodeString = new DecodeString();
    }

    @Test
    void decodeString1() {
        Assertions.assertEquals("aaabcbc", this.decodeString.decodeString("3[a]2[bc]"));
    }

    @Test
    void decodeString2() {
        Assertions.assertEquals("accaccacc", this.decodeString.decodeString("3[a2[c]]"));
    }

    @Test
    void decodeString3() {
        Assertions.assertEquals("abcabccdcdcdef", this.decodeString.decodeString("2[abc]3[cd]ef"));
    }

    @Test
    void decodeString4() {
        Assertions.assertEquals("abccdcdcdxyz", this.decodeString.decodeString("abc3[cd]xyz"));
    }

}
