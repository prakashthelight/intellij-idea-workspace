package com.leetcode.solutions.n50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0001Test {
    LeetCode0001 code = new LeetCode0001();
    @Test
    void test1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expectedResults = new int[] {0, 1};
        Assertions.assertArrayEquals(expectedResults, code.twoSum(nums, target));
    }

    @Test
    void test2() {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] expectedResults = new int[] {1, 2};
        Assertions.assertArrayEquals(expectedResults, code.twoSum(nums, target));
    }

    @Test
    void test3() {
        int[] nums = new int[]{3,3};
        int target = 6;
        int[] expectedResults = new int[] {0, 1};
        Assertions.assertArrayEquals(expectedResults, code.twoSum(nums, target));
    }
}