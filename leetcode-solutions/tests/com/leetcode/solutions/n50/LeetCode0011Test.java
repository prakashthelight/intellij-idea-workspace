package com.leetcode.solutions.n50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0011Test {

    LeetCode0011 code = new LeetCode0011();

    @Test
    void test1() {
        int[] heights = new int[] {1,8,6,2,5,4,8,3,7};
        Assertions.assertEquals(49, code.maxArea(heights));
    }

    @Test
    void test2() {
        int[] heights = new int[] {1,1};
        Assertions.assertEquals(1, code.maxArea(heights));
    }
}