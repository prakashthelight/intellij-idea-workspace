package com.leetcode.utils;

import com.leetcode.models.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeUtils {
    public static List<Integer> levelOrderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            result.add(node.val);

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return result;
    }
}
