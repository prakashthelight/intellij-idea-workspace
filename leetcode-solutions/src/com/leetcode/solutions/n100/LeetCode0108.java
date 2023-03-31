package com.leetcode.solutions.n100;

import com.leetcode.models.TreeNode;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 * <a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree">...</a>
 *
 * @author Prakash, Kumar
 * @category Array, Divide and Conquer, Tree, Binary Search Tree, Binary Tree
 */
public class LeetCode0108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);

        return root;
    }
}
