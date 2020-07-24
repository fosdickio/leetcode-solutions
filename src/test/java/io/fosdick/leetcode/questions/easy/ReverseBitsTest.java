package io.fosdick.leetcode.questions.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseBitsTest {

    private ReverseBits reverseBits;

    @BeforeEach
    void setUp() {
        this.reverseBits = new ReverseBits();
    }

    @Test
    void reverseBits1() {
        int testCase = 43261596;
        Assertions.assertEquals(964176192, reverseBits.reverseBits(testCase));
        // 00000010100101000001111010011100 -> 00111001011110000010100101000000
    }

    @Test
    void reverseBits2() {
        int testCase = -3;
        Assertions.assertEquals(-1073741825, reverseBits.reverseBits(testCase));
        // 11111111111111111111111111111101 -> 10111111111111111111111111111111
    }

}