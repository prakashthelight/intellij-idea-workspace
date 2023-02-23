package com.leetcode.solutions.n150;

import com.leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 145. Binary Tree Postorder Traversal
 * <a href="https://leetcode.com/problems/binary-tree-postorder-traversal/">...</a>
 *
 * @author Prakash, Kumar
 * @category Stack, Tree, Depth-First Search, Binary Tree
 */
public class LeetCode0145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversal(root, list);
        return list;
    }

    public void postorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.val);
    }

    public List<Integer> postorderTraversalIterative(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode previous = null;

        while (!stack.isEmpty()) {
            TreeNode current = stack.peek();

            if (previous == null || previous.left == current || previous.right == current) {
                if (current.left != null) {
                    stack.push(current.left);
                } else if (current.right != null) {
                    stack.push(current.right);
                } else {
                    stack.pop();
                    list.add(current.val);
                }
            } else if (current.left == previous) {
                if (current.right != null) {
                    stack.push(current.right);
                } else {
                    stack.pop();
                    list.add(current.val);
                }
            } else if (current.right == previous) {
                stack.pop();
                list.add(current.val);
            }

            previous = current;
        }

        return list;
    }
}
