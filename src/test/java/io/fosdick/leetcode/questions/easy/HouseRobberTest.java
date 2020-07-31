package io.fosdick.leetcode.questions.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HouseRobberTest {

    private HouseRobber houseRobber;

    @BeforeEach
    void setUp() {
        this.houseRobber = new HouseRobber();
    }

    @Test
    void rob1() {
        int[] testCase = { 1, 2, 3, 1 };
        // Rob house 1 (money = 1) and then rob house 3 (money = 3).
        // Total amount you can rob = 1 + 3 = 4.
        Assertions.assertEquals(4, this.houseRobber.rob(testCase));
    }

    @Test
    void rob2() {
        int[] testCase = { 2, 7, 9, 3, 1 };
        // Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
        // Total amount you can rob = 2 + 9 + 1 = 12.
        Assertions.assertEquals(12, this.houseRobber.rob(testCase));
    }

}
