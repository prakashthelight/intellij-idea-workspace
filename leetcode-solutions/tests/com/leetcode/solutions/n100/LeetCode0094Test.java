package com.leetcode.solutions.n100;

import com.leetcode.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LeetCode0094Test {
    LeetCode0094 code = new LeetCode0094();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);

        Assertions.assertIterableEquals(expectedResult, code.inorderTraversal(root));
    }
}