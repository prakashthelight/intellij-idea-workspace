package com.leetcode.solutions.n50;

import com.leetcode.models.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/">...</a>
 *
 * @author Prakash, Kumar
 * @category Linked List, Divide and Conquer, Heap (Priority Queue), Merge Sort
 */
public class LeetCode0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode a, ListNode b) {
                return a.val - b.val; // condition for sorting in ascending order (min-heap)
            }
        });

        // iterate over all Linked Lists and add all nodes to priority queue
        for (ListNode listNode : lists) {
            while (listNode != null) {
                priorityQueue.offer(listNode);
                listNode = listNode.next;
            }
        }

        ListNode head = null;
        ListNode tail = null;

        // make a new list after taking all nodes from the min-heap (priority queue)
        while (!priorityQueue.isEmpty()) {
            ListNode temp = priorityQueue.poll();
            temp.next = null;

            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = tail.next;
            }
        }

        return head;
    }
}
