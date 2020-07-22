package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SameTreeTest {

    private SameTree sameTree;

    @BeforeEach
    void setUp() {
        this.sameTree = new SameTree();
    }

    @Test
    void isSameTree1() {
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Assertions.assertEquals(true, sameTree.isSameTree(tree1, tree2));
    }

    @Test
    void isSameTree2() {
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode tree2 = new TreeNode(1, null, new TreeNode(2));
        Assertions.assertEquals(false, sameTree.isSameTree(tree1, tree2));
    }

}