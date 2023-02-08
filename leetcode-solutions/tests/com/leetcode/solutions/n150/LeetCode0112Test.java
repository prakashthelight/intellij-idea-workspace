package com.leetcode.solutions.n150;

import com.leetcode.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0112Test {

    LeetCode0112 code = new LeetCode0112();

    @Test
    public void test1() {
        Integer[] nodes = new Integer[] {
                5,4,8,11,null,13,4,7,2,null,null,null,1
        };

        // TODO: 2/6/2023 - Make Tree Using Nodes Array
        TreeNode head = new TreeNode(2);

        Assertions.assertTrue(code.hasPathSum(head, 2));
    }
}