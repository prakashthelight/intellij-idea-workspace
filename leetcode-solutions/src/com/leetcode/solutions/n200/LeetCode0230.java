package com.leetcode.solutions.n200;

import com.leetcode.models.TreeNode;

/**
 * 230. Kth Smallest Element in a BST
 * <a href="https://leetcode.com/problems/kth-smallest-element-in-a-bst/">...</a>
 *
 * @author Prakash, Kumar
 * @category Tree, Depth-First Search, Binary Search Tree, Binary Tree
 */
public class LeetCode0230 {
    int count = 0;
    int kthSmallestNumber = -1;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        kthSmallestNumber = -1;
        inorderTraversal(root);
        return kthSmallestNumber;
    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.println(root);
        count--;
        // when printing the kth item in in-order traversal
        if (count == 0) {
            kthSmallestNumber = root.val;
        }
        inorderTraversal(root.right);
    }
}
