package com.leetcode.solutions.n650;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 697. Degree of an Array
 * <a href="https://leetcode.com/problems/degree-of-an-array/description/">...</a>
 *
 * @author Prakash, Kumar
 * @category Array, HashTable
 */
public class LeetCode0697 {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int maxDegree = 1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                List<Integer> values = map.get(num);
                values.set(1, i); // update lastIndex for calculating the length of sub-array
                values.set(2, values.get(2) + 1); // update count
                maxDegree = Math.max(maxDegree, values.get(2)); // update maxDegree
            } else {
                // num -> firstIndex, lastIndex, count
                map.put(num, Arrays.asList(i, i, 1));
            }
        }

        int maxDegreeMinLength = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            List<Integer> values = map.get(key);
            // if degree is equal to maxDegree, update maxDegreeMinLength
            if (values.get(2) == maxDegree) {
                maxDegreeMinLength = Math.min(maxDegreeMinLength, values.get(1) - values.get(0) + 1);
            }
        }

        return maxDegreeMinLength;
    }
}
