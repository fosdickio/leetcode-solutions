package io.fosdick.leetcode.questions.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    ContainerWithMostWater containerWithMostWater;

    @BeforeEach
    void setUp() {
        this.containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    void maxArea() {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        Assertions.assertEquals(49, this.containerWithMostWater.maxArea(height));
    }

}
