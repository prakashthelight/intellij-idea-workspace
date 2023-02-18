package com.leetcode.solutions.n2400;

import java.util.HashSet;

/**
 * 2367. Number of Arithmetic Triplets
 * <a href="https://leetcode.com/problems/number-of-arithmetic-triplets/">...</a>
 *
 * @author Prakash, Kumar
 * @category Array, Hash Table, Two Pointers, Enumeration
 */
public class LeetCode2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }

        int tripletCount = 0;

        // Triplets -> n, n + diff, n + 2 * diff
        for (int num : nums) {
            if (set.contains(num + diff) && set.contains(num + (2 * diff))) {
                tripletCount++;
            }
        }

        return tripletCount;
    }
}
