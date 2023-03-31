package com.leetcode.solutions.n600;

import com.leetcode.models.TreeNode;

/**
 * 559. Maximum Depth of N-ary Tree
 * <a href="https://leetcode.com/problems/maximum-depth-of-n-ary-tree/">...</a>
 *
 * @author Prakash, Kumar
 * @category Tree, Depth-First Search, Breadth-First Search
 */
public class LeetCode0559 {
    public int maxDepth(TreeNode root) {
        return height(root);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxSubTreeDepth = 0;
        for (TreeNode childNode : root.children) {
            maxSubTreeDepth = Math.max(height(childNode), maxSubTreeDepth);
        }

        return maxSubTreeDepth + 1;
    }
}
