package com.leetcode.solutions.n50;

/**
 * 11. Container With Most Water
 * <a href="https://leetcode.com/problems/container-with-most-water">...</a>
 *
 * @author Prakash, Kumar
 * @category Arrays, Two Pointer, Greedy
 */
public class LeetCode0011 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;

        while (i < j) {
            int minHeight = Math.min(height[i], height[j]); // get min height bar
            maxArea = Math.max(maxArea, minHeight * (j - i)); // update the maxArea - Greedy

            // move two pointers to calculate more with other bars
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }
}
