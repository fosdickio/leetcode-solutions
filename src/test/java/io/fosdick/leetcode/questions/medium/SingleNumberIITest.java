package io.fosdick.leetcode.questions.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingleNumberIITest {

    private SingleNumberII singleNumber;

    @BeforeEach
    void setUp() {
        this.singleNumber = new SingleNumberII();
    }

    @Test
    void singleNumber1() {
        Assertions.assertEquals(3, this.singleNumber.singleNumber(new int[] {2, 2, 3, 2}));
    }

    @Test
    void singleNumber2() {
        Assertions.assertEquals(99, this.singleNumber.singleNumber(new int[] {0, 1, 0, 1, 0, 1, 99}));
    }

}
