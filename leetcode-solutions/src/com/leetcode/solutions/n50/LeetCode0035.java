package com.leetcode.solutions.n50;

/**
 * 35. Search Insert Position
 * <a href="https://leetcode.com/problems/search-insert-position/">...</a>
 *
 * @author Prakash, Kumar
 * @category Array, Binary Search
 */
public class LeetCode0035 {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        return searchInsert(0, nums.length - 1, nums, target);
    }

    public int searchInsert(int left, int right, int[] nums, int target) {
        if (left > right) {
            return right + 1;
        }

        int mid = (left + right) / 2;
        int midItem = nums[mid];

        if (midItem < target) {
            return searchInsert(mid + 1, right, nums, target);
        } else if (midItem > target) {
            return searchInsert(left, mid - 1, nums, target);
        } else {
            return mid;
        }
    }
}
