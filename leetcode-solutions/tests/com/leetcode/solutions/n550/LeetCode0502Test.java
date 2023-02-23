package com.leetcode.solutions.n550;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0502Test {
    LeetCode0502 code = new LeetCode0502();

    @Test
    void findMaximizedCapitalTest1() {
        int maxCapital = code.findMaximizedCapital(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1});
        Assertions.assertEquals(4, maxCapital);
    }

    @Test
    void findMaximizedCapitalTest2() {
        int maxCapital = code.findMaximizedCapital(3, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2});
        Assertions.assertEquals(6, maxCapital);
    }
}