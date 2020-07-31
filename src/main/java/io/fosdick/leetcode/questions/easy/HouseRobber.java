package io.fosdick.leetcode.questions.easy;

import static java.lang.Integer.max;

/**
 * 198. House Robber
 * https://leetcode.com/problems/house-robber/
 *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
 * stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount
 * of money you can rob tonight without alerting the police.
 */
public class HouseRobber {

    /**
     *
     *   Time Complexity: O()
     *   Space Complexity: O()
     */
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return max(nums[0], nums[1]);

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenSum = max(evenSum + nums[i], oddSum);
            } else {
                oddSum = max(evenSum, oddSum + nums[i]);
            }
        }

        return max(evenSum, oddSum);
    }

}
