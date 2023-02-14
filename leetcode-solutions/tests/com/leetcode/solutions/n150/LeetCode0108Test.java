package com.leetcode.solutions.n150;

import com.leetcode.models.TreeNode;
import com.leetcode.utils.TreeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LeetCode0108Test {
    LeetCode0108 code = new LeetCode0108();

    @Test
    void sortedArrayToBST() {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        Integer[] result = new Integer[]{0, -10, 5, -3, 9};
        TreeNode root = code.sortedArrayToBST(nums);
        List<Integer> actualResult = TreeUtils.levelOrderTraversal(root);
        Assertions.assertArrayEquals(result, actualResult.toArray());
    }
}