package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumDepthOfBinaryTreeTest {

    private MaximumDepthOfBinaryTree maximumDepthOfBinaryTree;

    @BeforeEach
    public void setUp() {
        this.maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
    }

    @Test
    void maxDepth() {
        TreeNode tree = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        Assertions.assertEquals(3, this.maximumDepthOfBinaryTree.maxDepth(tree));
    }

}