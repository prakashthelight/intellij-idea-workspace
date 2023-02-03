package com.leetcode.solutions.n150;

public class LeetCode0122 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        // as you may sell & buy all days,
        // the max profit is to add all positive price difference on next days
        for (int i = 1; i < prices.length; i++) {
            maxProfit += Math.max(prices[i] - prices[i - 1], 0);
        }

        return maxProfit;
    }
}
