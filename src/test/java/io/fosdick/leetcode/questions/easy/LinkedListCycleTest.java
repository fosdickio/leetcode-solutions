package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

    private LinkedListCycle linkedListCycle;

    @BeforeEach
    void setUp() {
        this.linkedListCycle = new LinkedListCycle();
    }

    @Test
    void hasCycle() {
        ListNode testCase = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
        Assertions.assertEquals(false, linkedListCycle.hasCycle(testCase));
    }

}