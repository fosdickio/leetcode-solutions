package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.ListNode;

/**
 * 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 *
 * Reverse a singly linked list.
 */
public class ReverseLinkedList {

    /**
     * Iterative
     *   Time Complexity: O(n)
     *   Space Complexity: O(1)
     */
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode tempNext = current.next;
            current.next = previous;
            previous = current;
            current = tempNext;
        }

        return previous;
    }

}
