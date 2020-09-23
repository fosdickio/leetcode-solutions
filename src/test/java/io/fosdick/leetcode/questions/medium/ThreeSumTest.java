package io.fosdick.leetcode.questions.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ThreeSumTest {

    ThreeSum threeSum;

    @BeforeEach
    void setUp() {
        this.threeSum = new ThreeSum();
    }

    @Test
    void threeSum1() {
        int[] nums = { -1, 0, 1, 2, -1, -4 };

        List<Integer> answerPart1 = new ArrayList<>();
        answerPart1.add(-1);
        answerPart1.add(0);
        answerPart1.add(1);

        List<Integer> answerPart2 = new ArrayList<>();
        answerPart2.add(-1);
        answerPart2.add(-1);
        answerPart2.add(2);

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(answerPart2);
        answer.add(answerPart1);

        Assertions.assertEquals(answer, this.threeSum.threeSum(nums));
    }

    @Test
    void threeSum2() {
        int[] nums = {};
        Assertions.assertEquals(new ArrayList<Integer>(), this.threeSum.threeSum(nums));
    }

    @Test
    void threeSum3() {
        int[] nums = { 0 };
        Assertions.assertEquals(new ArrayList<Integer>(), this.threeSum.threeSum(nums));
    }

}
