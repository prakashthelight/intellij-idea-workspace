package com.leetcode.solutions.n100;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 * <a href="https://leetcode.com/problems/subsets/">...</a>
 *
 * @author Prakash, Kumar
 * @category Array, Backtracking, Bit Manipulation
 */
public class LeetCode0078 {
    List<List<Integer>> output = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        subsets(nums, 0, new ArrayList<Integer>());
        return output;
    }

    public void subsets(int[] nums, int index, List<Integer> partialSubset) {
        // base condition
        if (index == nums.length) {
            output.add(new ArrayList<>(partialSubset));
            return;
        }

        // exclude current number
        subsets(nums, index + 1, partialSubset);

        // includes current number
        partialSubset.add(nums[index]);
        subsets(nums, index + 1, partialSubset);
        partialSubset.remove(partialSubset.size() - 1); // remove last added item as using mutable shared partialSubset reference
    }
}
