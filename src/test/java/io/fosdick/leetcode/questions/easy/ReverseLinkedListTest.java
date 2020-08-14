package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    ReverseLinkedList reverseLinkedList;

    @BeforeEach
    void setUp() {
        this.reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    void reverseLinkedList() {
        ListNode listToReverse = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode reversedList = reverseLinkedList.reverseList(listToReverse);

        String reversedListString = "";
        while (reversedList != null) {
            reversedListString += reversedList.val;
            reversedList = reversedList.next;
        }

        Assertions.assertEquals("4321", reversedListString);
    }
}