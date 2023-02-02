package com.leetcode.solutions.n50;

import java.util.HashSet;

/**
 * 26. Remove Duplicates from Sorted Array
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array">...</a>
 *
 * @author Prakash, Kumar
 * @category Array, Two Pointers
 */
public class LeetCode0026 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(nums[0]);

        int i = 1;
        int j = 1;
        while (i < nums.length) {
            int item = nums[i];

            if (!set.contains(item)) {
                nums[j] = item;
                set.add(item);
                j++;
            }

            i++;
        }

        return j;
    }
}
