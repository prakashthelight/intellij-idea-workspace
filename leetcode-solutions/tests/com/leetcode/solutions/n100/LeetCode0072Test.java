package com.leetcode.solutions.n100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0072Test {

    LeetCode0072 code = new LeetCode0072();

    @Test
    void minDistanceTest1() {
        Assertions.assertEquals(3, code.minDistance("horse", "ros"));
    }

    @Test
    void minDistanceTest2() {
        Assertions.assertEquals(5, code.minDistance("intention", "execution"));
    }
}