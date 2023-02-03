package com.leetcode.solutions.n100;

import com.leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode0094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            // keep moving left
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                TreeNode item = stack.pop();
                list.add(item.val);
                temp = item.right;
            }
        }

        return list;
    }
}
