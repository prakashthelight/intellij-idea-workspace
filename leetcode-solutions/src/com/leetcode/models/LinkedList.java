package com.leetcode.models;

public class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LinkedList(int[] nums) {
        for (int item : nums) {
            ListNode node = new ListNode(item);
            if (this.head == null) {
                this.head = this.tail = node;
            } else {
                this.tail.next = node;
                this.tail = this.tail.next;
            }
            this.size++;
        }
    }

    public LinkedList(ListNode head) {
        this.head = head;

        ListNode temp = head;
        while (temp != null) {
            this.size++;
            temp = temp.next;
        }
    }

    public ListNode getHead() {
        return this.head;
    }

    public int[] toArray() {
        int[] array = new int[this.size];
        ListNode temp = head;

        int i = 0;
        while (temp != null) {
            array[i++] = temp.val;
            temp = temp.next;
        }

        return array;
    }
}
