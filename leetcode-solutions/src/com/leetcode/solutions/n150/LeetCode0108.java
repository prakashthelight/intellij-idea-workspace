package com.leetcode.solutions.n150;

import com.leetcode.models.TreeNode;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 * <a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/">...</a>
 *
 * @author Prakash, Kumar
 * @category Array, Divide and Conquer, Tree, Binary Search Tree, Binary Tree
 */
public class LeetCode0108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(0, nums.length - 1, nums);
    }

    public TreeNode sortedArrayToBST(int left, int right, int[] nums) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(left, mid - 1, nums);
        root.right = sortedArrayToBST(mid + 1, right, nums);

        return root;
    }
}
