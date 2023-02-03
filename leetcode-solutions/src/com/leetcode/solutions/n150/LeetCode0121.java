package com.leetcode.solutions.n150;

public class LeetCode0121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = prices[1] - minPrice;

        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]); // keep finding minPrice if any
            maxProfit = Math.max(maxProfit, prices[i] - minPrice); // keep finding maxProfit if any
        }

        return Math.max(maxProfit, 0);
    }
}
