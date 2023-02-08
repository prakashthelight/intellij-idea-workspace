package com.leetcode.solutions.n150;

import com.leetcode.models.TreeNode;

public class LeetCode0112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        // if leaf node, check for targetSum
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        int newTargetSum = targetSum - root.val;
        return hasPathSum(root.left, newTargetSum) || hasPathSum(root.right, newTargetSum);
    }
}
