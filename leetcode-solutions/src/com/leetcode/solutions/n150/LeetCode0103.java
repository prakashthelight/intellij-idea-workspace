package com.leetcode.solutions.n150;

import com.leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode0103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isDirectionLeftToRight = false;

        while (!queue.isEmpty()) {
            int levelNodeCount = queue.size();
            List<Integer> list = new ArrayList<>();
            while (levelNodeCount > 0) {
                TreeNode node = queue.poll();
                levelNodeCount--;

                if (isDirectionLeftToRight) {
                    // add in the beginning for reverse order
                    list.add(0, node.val);
                } else {
                    list.add(node.val);
                }

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            result.add(list);

            // change direction
            isDirectionLeftToRight = !isDirectionLeftToRight;
        }

        return result;
    }
}
