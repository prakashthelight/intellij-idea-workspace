package com.leetcode.solutions.n1500;

/**
 * 1470. Shuffle the Array
 * <a href="https://leetcode.com/problems/shuffle-the-array/">...</a>
 *
 * @author Prakash, Kumar
 * @category Arrays
 */
public class LeetCode1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int i = 0;
        int j = n;
        for (int k = 0; k < result.length; k++) {
            if (k % 2 == 0) {
                result[k] = nums[i++];
            } else {
                result[k] = nums[j++];
            }
        }

        return result;
    }
}
