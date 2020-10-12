package io.fosdick.leetcode.questions.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        this.twoSum = new TwoSum();
    }

    @Test
    void twoSum1() {
        int[] answer = this.twoSum.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        Assertions.assertArrayEquals(new int[] { 0, 1 }, Arrays.stream(answer).sorted().toArray());
    }

    @Test
    void twoSum2() {
        int[] answer = this.twoSum.twoSum(new int[] { 3, 2, 4 }, 6);
        Assertions.assertArrayEquals(new int[] { 1, 2 }, Arrays.stream(answer).sorted().toArray());
    }

    @Test
    void twoSum3() {
        int[] answer = this.twoSum.twoSum(new int[] { 3, 3 }, 6);
        Assertions.assertArrayEquals(new int[] { 0, 1 }, Arrays.stream(answer).sorted().toArray());
    }

}
