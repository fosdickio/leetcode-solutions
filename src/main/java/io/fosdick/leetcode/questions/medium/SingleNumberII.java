package io.fosdick.leetcode.questions.medium;

import java.util.Collections;
import java.util.HashMap;

/**
 * 137. Single Number II
 * https://leetcode.com/problems/single-number-ii/
 *
 * Given a non-empty array of integers, every element appears three times except for one, which appears exactly once.
 * Find that single one.
 *
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumberII {

    /**
     * HashMap
     *   Time Complexity: O(n)
     *   Space Complexity: O(n)
     */
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }

}
