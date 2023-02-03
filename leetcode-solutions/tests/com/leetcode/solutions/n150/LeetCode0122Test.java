package com.leetcode.solutions.n150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0122Test {

    LeetCode0122 code = new LeetCode0122();

    @Test
    public void maxProfitTest1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        Assertions.assertEquals(7, code.maxProfit(prices));
    }

    @Test
    public void maxProfitTest2() {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        Assertions.assertEquals(4, code.maxProfit(prices));
    }

    @Test
    public void maxProfitTest3() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        Assertions.assertEquals(0, code.maxProfit(prices));
    }
}