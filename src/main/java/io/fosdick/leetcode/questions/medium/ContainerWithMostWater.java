package io.fosdick.leetcode.questions.medium;

/**
 * 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/
 *
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical
 * lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 */
public class ContainerWithMostWater {

    /**
     * Brute Force
     *   Time Complexity: O(n^2)
     *   Space Complexity: O(1)
     */
    public int maxArea(int[] height) {
        int current = 0;
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                current = (j - i) * Math.min(height[i], height[j]);
                if (current > max) {
                    max = current;
                }
            }
        }
        return max;
    }

}
