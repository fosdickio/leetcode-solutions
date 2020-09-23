package io.fosdick.leetcode.questions.medium;

import io.fosdick.leetcode.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndOfListTest {

    RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList;

    @BeforeEach
    void setUp() {
        this.removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
    }

    @Test
    void removeNthFromEnd() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        list = this.removeNthNodeFromEndOfList.removeNthFromEnd(list, 2);

        String removedString = "";
        while (list != null) {
            removedString += list.val;
            list = list.next;
        }

        Assertions.assertEquals("1235", removedString);
    }

}
