package io.fosdick.leetcode.questions.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplyStringsTest {

    private MultiplyStrings multiplyStrings;

    @BeforeEach
    void setUp() {
        this.multiplyStrings = new MultiplyStrings();
    }

    @Test
    void multiply1() {
        Assertions.assertEquals("6", this.multiplyStrings.multiply("2", "3"));
    }

    @Test
    void multiply2() {
        Assertions.assertEquals("56088", this.multiplyStrings.multiply("123", "456"));
    }

}
