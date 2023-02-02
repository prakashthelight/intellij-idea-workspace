package com.leetcode.solutions.n50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0026Test {
    LeetCode0026 code = new LeetCode0026();

    @Test
    void test1() {
        int[] nums = new int[]{1, 1, 2};
        Assertions.assertEquals(2, code.removeDuplicates(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        Assertions.assertEquals(5, code.removeDuplicates(nums));
    }
}