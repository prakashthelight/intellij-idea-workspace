package com.leetcode.solutions.n2400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode2367Test {
    LeetCode2367 code = new LeetCode2367();

    @Test
    void arithmeticTripletsTest1() {
        int[] nums = new int[]{0, 1, 4, 6, 7, 10};
        int diff = 3;
        Assertions.assertEquals(2, code.arithmeticTriplets(nums, diff));
    }

    @Test
    void arithmeticTripletsTest2() {
        int[] nums = new int[]{4, 5, 6, 7, 8, 9};
        int diff = 2;
        Assertions.assertEquals(2, code.arithmeticTriplets(nums, diff));
    }
}