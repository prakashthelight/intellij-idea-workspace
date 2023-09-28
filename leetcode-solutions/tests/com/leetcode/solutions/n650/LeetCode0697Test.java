package com.leetcode.solutions.n650;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0697Test {

    LeetCode0697 code = new LeetCode0697();

    @Test
    void findShortestSubArray1() {
        int[] nums = new int[]{1, 2, 2, 3, 1};
        Assertions.assertEquals(2, code.findShortestSubArray(nums));
    }

    @Test
    void findShortestSubArray2() {
        int[] nums = new int[]{1, 2, 2, 3, 1, 4, 2};
        Assertions.assertEquals(6, code.findShortestSubArray(nums));
    }
}