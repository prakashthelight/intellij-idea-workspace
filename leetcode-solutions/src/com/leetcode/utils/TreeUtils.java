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

    public static TreeNode createBinaryTree(Integer[] nodeValues) {
        return createBinaryTree(nodeValues, 0);
    }

    public static TreeNode createBinaryTree(Integer[] nodeValues, int rootNodeIndex) {
        if (rootNodeIndex >= nodeValues.length || nodeValues[rootNodeIndex] == null) {
            return null;
        }

        TreeNode root = new TreeNode(nodeValues[rootNodeIndex]);
        root.left = createBinaryTree(nodeValues, 2 * rootNodeIndex + 1);
        root.right = createBinaryTree(nodeValues, 2 * rootNodeIndex + 2);

        return root;
    }
}
