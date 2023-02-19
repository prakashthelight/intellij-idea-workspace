package com.leetcode.solutions.n150;

import com.leetcode.models.TreeNode;
import com.leetcode.utils.ListUtils;
import com.leetcode.utils.TreeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LeetCode0103Test {

    LeetCode0103 code = new LeetCode0103();

    @Test
    void zigzagLevelOrderTest1() {
        TreeNode root = TreeUtils.createBinaryTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> result = code.zigzagLevelOrder(root);
        List<List<Integer>> expectedResult = ListUtils.createListOfLists(new Integer[]{3}, new Integer[]{20, 9}, new Integer[]{15, 7});

        Assertions.assertEquals(3, result.size());
        Assertions.assertArrayEquals(expectedResult.toArray(), result.toArray());
    }

    @Test
    void zigzagLevelOrderTest2() {
        TreeNode root = TreeUtils.createBinaryTree(new Integer[]{1});
        List<List<Integer>> result = code.zigzagLevelOrder(root);
        List<List<Integer>> expectedResult = ListUtils.createListOfLists(new Integer[]{1});

        Assertions.assertEquals(1, result.size());
        Assertions.assertArrayEquals(expectedResult.toArray(), result.toArray());
    }

    @Test
    void zigzagLevelOrderTest3() {
        List<List<Integer>> result = code.zigzagLevelOrder(null);
        List<List<Integer>> expectedResult = ListUtils.createListOfLists();

        Assertions.assertEquals(0, result.size());
        Assertions.assertArrayEquals(expectedResult.toArray(), result.toArray());
    }
}