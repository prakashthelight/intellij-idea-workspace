package com.leetcode.solutions.n50;

import com.leetcode.models.LinkedList;
import com.leetcode.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0023Test {

    LeetCode0023 code = new LeetCode0023();

    @Test
    public void mergeKListsTest() {
        int[][] lists = new int[][]{{1, 4, 5}, {1, 3, 4}, {2, 6}};
        ListNode[] listNodes = new ListNode[lists.length];
        int i = 0;
        for (int[] list : lists) {
            listNodes[i++] = new LinkedList(list).getHead();
        }

        int[] expectedResult = new LinkedList(new int[]{1, 1, 2, 3, 4, 4, 5, 6}).toArray();
        int[] actualResult = new LinkedList(code.mergeKLists(listNodes)).toArray();

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}