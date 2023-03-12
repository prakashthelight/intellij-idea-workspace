package com.leetcode.solutions.n50;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 46. Permutations
 * <a href="https://leetcode.com/problems/permutations/">...</a>
 *
 * @author Prakash, Kumar
 * @category Array, Backtracking
 */
public class LeetCode0046 {
    List<List<Integer>> output = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        permute(nums, 0);
        return output;
    }

    public void permute(int[] nums, int start) {
        if (start == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for(int num: nums) {
                permutation.add(num);
            }
            output.add(permutation);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            permute(nums, start + 1);
            swap(nums, start, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
