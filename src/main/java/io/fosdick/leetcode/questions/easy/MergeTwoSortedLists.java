package io.fosdick.leetcode.questions.easy;

import io.fosdick.leetcode.util.ListNode;

/**
 * 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together
 * the nodes of the first two lists.
 */
public class MergeTwoSortedLists {

    /**
     * Recursion
     *   Time Complexity: O(log n)
     *   Space Complexity: O(n)
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        if (l1.val > l2.val) {
            return mergeTwoLists(l2, l1);
        }
        l1.next = mergeTwoLists(l1.next, l2);
        return l1;
    }

}
