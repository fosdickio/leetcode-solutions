package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.TreeNode;

/**
 * 100. Same Tree
 * https://leetcode.com/problems/same-tree/
 *
 * Given two binary trees, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 */
public class SameTree {

    /**
     * Recursion
     *   Time Complexity: O(n)
     *   Space Complexity: O(log n)
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
