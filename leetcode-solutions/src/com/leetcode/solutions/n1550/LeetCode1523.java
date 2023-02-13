package com.leetcode.solutions.n1550;

/**
 * 1523. Count Odd Numbers in an Interval Range
 * <a href="https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/">...</a>
 *
 * @author Prakash, Kumar
 * @category Math
 */
public class LeetCode1523 {
    public int countOdds(int low, int high) {
        // make inclusive odd
        if (low % 2 == 0) {
            low++;
        }

        // make inclusive odd
        if (high % 2 == 0) {
            high--;
        }

        return ((high - low) / 2) + 1;
    }
}
