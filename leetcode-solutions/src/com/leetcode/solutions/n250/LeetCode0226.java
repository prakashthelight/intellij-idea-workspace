package com.leetcode.solutions.n250;

import com.leetcode.models.TreeNode;

/**
 * 226. Invert Binary Tree
 * <a href="https://leetcode.com/problems/invert-binary-tree/">...</a>
 *
 * @author Prakash, Kumar
 * @category Tree, Depth-First Search, Breadth-First Search, Binary Tree
 */
public class LeetCode0226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
    }
}
