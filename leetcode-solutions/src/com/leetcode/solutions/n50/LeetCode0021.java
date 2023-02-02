package com.leetcode.solutions.n50;

import com.leetcode.models.ListNode;

public class LeetCode0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode head = null;
        ListNode tail = null;
        while (list1 != null && list2 != null) {
            ListNode temp;
            if (list1.val <= list2.val) {
                temp = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                temp = new ListNode(list2.val);
                list2 = list2.next;
            }

            if (head == null) {
                head = temp;
                tail = head;
            } else {
                tail.next = temp;
                tail = tail.next;
            }
        }

        if (list1 != null) {
            tail.next = list1;
        }

        if (list2 != null) {
            tail.next = list2;
        }

        return head;
    }

    public ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        return mergeTwoListsRecursiveHelper(list1, list2);
    }

    public ListNode mergeTwoListsRecursiveHelper(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode temp = null;
        if (list1.val <= list2.val) {
            temp = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            temp = new ListNode(list2.val);
            list2 = list2.next;
        }

        temp.next = mergeTwoListsRecursiveHelper(list1, list2);
        return temp;
    }
}
