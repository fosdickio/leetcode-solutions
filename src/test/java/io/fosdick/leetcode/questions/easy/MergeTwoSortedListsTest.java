package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

    MergeTwoSortedLists mergeTwoSortedLists;

    @BeforeEach
    void setUp() {
        this.mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    void mergeTwoLists() {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));;
        ListNode answer = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);

        String actual = "";
        while (answer != null) {
            actual += answer.val;
            answer = answer.next;
        }

        Assertions.assertEquals("112344", actual);
    }
}