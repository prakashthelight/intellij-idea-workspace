package com.leetcode.solutions.n1700;

import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode1675 {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // keep track of minimum value
        int minValue = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num % 2 == 0) {
                maxHeap.offer(num);
                minValue = Math.min(minValue, num);
            } else {
                maxHeap.offer(num * 2);
                minValue = Math.min(minValue, num * 2);
            }
        }

        int minDeviation = Integer.MAX_VALUE;
        // keep updating minDeviation to new minimum and keep updating minValue
        while (maxHeap.peek() % 2 == 0) {
            int maxValue = maxHeap.poll();
            minDeviation = Math.min(minDeviation, maxValue - minValue);
            int newValue = maxValue / 2;
            maxHeap.offer(newValue);
            minValue = Math.min(minValue, newValue);
        }

        minDeviation = Math.min(minDeviation, maxHeap.peek() - minValue);

        return minDeviation;
    }
}
