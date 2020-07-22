package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.TreeNode;

/**
 * 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 */
public class MaximumDepthOfBinaryTree {

    /**
     * Recursion
     *   Time Complexity: O(n)
     *   Space Complexity: O(1)
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        MaximumDepthOfBinaryTree exercise = new MaximumDepthOfBinaryTree();
        TreeNode testCase = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int answer = exercise.maxDepth(testCase);
        System.out.println(answer);
    }

}
