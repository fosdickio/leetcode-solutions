package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubtreeOfAnotherTreeTest {

    SubtreeOfAnotherTree subtreeOfAnotherTree;

    @BeforeEach
    void setUp() {
        this.subtreeOfAnotherTree = new SubtreeOfAnotherTree();
    }

    @Test
    void isSubtree1() {
        TreeNode s = new TreeNode(3,
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(2)),
                new TreeNode(5)
        );
        TreeNode t = new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(2));
        Assertions.assertEquals(true, this.subtreeOfAnotherTree.isSubtree(s, t));
    }

    @Test
    void isSubtree2() {
        TreeNode s = new TreeNode(3,
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(2,
                                new TreeNode(0),
                                null)),
                new TreeNode(5)
        );
        TreeNode t = new TreeNode(4,
                new TreeNode(1),
                new TreeNode(2));
        Assertions.assertEquals(false, this.subtreeOfAnotherTree.isSubtree(s, t));
    }

}