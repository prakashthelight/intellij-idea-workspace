package com.leetcode.solutions.n150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0121Test {

    LeetCode0121 code = new LeetCode0121();

    @Test
    public void maxProfitTest1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        Assertions.assertEquals(5, code.maxProfit(prices));
    }

    @Test
    public void maxProfitTest2() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        Assertions.assertEquals(0, code.maxProfit(prices));
    }
}