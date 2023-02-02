package com.leetcode.solutions.n50;

import com.leetcode.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0021Test {
    LeetCode0021 code = new LeetCode0021();

    @Test
    void test1() {
        ListNode list = code.mergeTwoListsRecursive(null, null);
        Assertions.assertNull(list);
    }

    @Test
    void test2() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expectedList = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        ListNode list = code.mergeTwoListsRecursive(list1, list2);
        while (expectedList != null) {
            Assertions.assertNotNull(list);
            Assertions.assertEquals(expectedList.val, list.val);
            expectedList = expectedList.next;
            list = list.next;
        }
    }
}