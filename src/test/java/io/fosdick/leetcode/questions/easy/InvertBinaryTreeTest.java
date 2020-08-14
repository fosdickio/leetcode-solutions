package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvertBinaryTreeTest {

    private InvertBinaryTree invertBinaryTree;
    private SameTree sameTree;

    @BeforeEach
    void setUp() {
        this.invertBinaryTree = new InvertBinaryTree();
        this.sameTree = new SameTree();
    }

    @Test
    void invertTree() {
        TreeNode binaryTree = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );
        TreeNode invertedBinaryTree = this.invertBinaryTree.invertTree(binaryTree);
        TreeNode expectedResult = new TreeNode(4,
                new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                new TreeNode(2, new TreeNode(3), new TreeNode(1))
        );
        Assertions.assertEquals(true, sameTree.isSameTree(invertedBinaryTree, expectedResult));
    }

}
