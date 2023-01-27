package com.leetcode.solutions.n50;

import java.util.HashMap;

public class LeetCode0001 {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(compliment, i);
            }
        }

        return new int[]{0, 0};
    }
}
