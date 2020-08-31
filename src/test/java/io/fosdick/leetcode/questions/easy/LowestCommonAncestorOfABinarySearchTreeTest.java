package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LowestCommonAncestorOfABinarySearchTreeTest {

    LowestCommonAncestorOfABinarySearchTree lowestCommonAncestor;

    @BeforeEach
    void setUp() {
        this.lowestCommonAncestor = new LowestCommonAncestorOfABinarySearchTree();
    }

    @Test
    void lowestCommonAncestor1() {
        TreeNode binarySearchTree = new TreeNode(6,
                new TreeNode(2,
                        new TreeNode(0),
                        new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8,
                        new TreeNode(7),
                        new TreeNode(9))
        );
        TreeNode result = this.lowestCommonAncestor.lowestCommonAncestor(binarySearchTree, binarySearchTree.left,
                binarySearchTree.right);
        Assertions.assertEquals(6, result.val, "The LCA of nodes 2 and 8 should be 6.");
    }

    @Test
    void lowestCommonAncestor2() {
        TreeNode binarySearchTree = new TreeNode(6,
                new TreeNode(2,
                        new TreeNode(0),
                        new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8,
                        new TreeNode(7),
                        new TreeNode(9))
        );
        TreeNode result = this.lowestCommonAncestor.lowestCommonAncestor(binarySearchTree, binarySearchTree.left,
                binarySearchTree.left.right);
        Assertions.assertEquals(2, result.val, "The LCA of nodes 2 and 4 is 2, since " +
                "a node can be a descendant of itself according to the LCA definition.");
    }

}