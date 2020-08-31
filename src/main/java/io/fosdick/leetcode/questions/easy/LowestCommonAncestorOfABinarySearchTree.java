package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.TreeNode;

/**
 * 235. Lowest Common Ancestor of a Binary Search Tree
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 *
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 *
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as
 * the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 */
public class LowestCommonAncestorOfABinarySearchTree {

    /**
     * Iteration
     *   Time Complexity: O(n)
     *   Space Complexity: O(1)
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }

        TreeNode longestCommonAncestor = root;

        while (longestCommonAncestor != null) {
            if ((p.val < longestCommonAncestor.val) && (q.val < longestCommonAncestor.val)) {
                longestCommonAncestor = longestCommonAncestor.left;
            } else if ((p.val > longestCommonAncestor.val) && (q.val > longestCommonAncestor.val)) {
                longestCommonAncestor = longestCommonAncestor.right;
            } else {
                break;
            }
        }

        return longestCommonAncestor;
    }

}
