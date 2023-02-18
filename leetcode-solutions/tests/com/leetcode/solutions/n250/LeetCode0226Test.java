package com.leetcode.solutions.n250;

import com.leetcode.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0226Test {
    LeetCode0226 code = new LeetCode0226();

    @Test
    public void invertTreeTest1() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        Assertions.assertNotNull(code.invertTree(root));
    }

    // TODO: 2/17/2023 - Add more tests 
}