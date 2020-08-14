package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.TreeNode;

/**
 * 226. Invert Binary Tree
 * https://leetcode.com/problems/invert-binary-tree/
 *
 * Invert a binary tree.
 */
public class InvertBinaryTree {

    /**
     * Recursive
     *   Time Complexity: O(n)
     *   Space Complexity: O(n)
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);

        root.left = right;
        root.right = left;

        return root;
    }

}
