package com.leetcode.solutions.n150;

import com.leetcode.models.TreeNode;
import com.leetcode.utils.TreeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0145Test {

    LeetCode0145 code = new LeetCode0145();

    @Test
    void postorderTraversalTest1() {
        TreeNode root = TreeUtils.createBinaryTree(new Integer[]{1, null, 2, null, null, 3});
        Assertions.assertArrayEquals(new Integer[]{3, 2, 1}, code.postorderTraversal(root).toArray());
    }

    @Test
    void postorderTraversalTest2() {
        TreeNode root = TreeUtils.createBinaryTree(new Integer[]{1});
        Assertions.assertArrayEquals(new Integer[]{1}, code.postorderTraversal(root).toArray());
    }
}