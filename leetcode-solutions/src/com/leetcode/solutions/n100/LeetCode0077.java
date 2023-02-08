package com.leetcode.solutions.n100;

import java.util.LinkedList;
import java.util.List;

/**
 * 77. Combinations
 * <a href="https://leetcode.com/problems/combinations/">...</a>
 *
 * @author Prakash, Kumar
 * @category Backtracking
 */
public class LeetCode0077 {
    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTrack(n, k, 1, new LinkedList<Integer>());
        return result;
    }

    public void backTrack(int n, int k, int start, LinkedList<Integer> combination) {
        if (combination.size() == k) {
            result.add(new LinkedList<>(combination));
        }

        for (int i = start; i < n + 1; i++) {
            // add i in the combination
            combination.add(i);

            // use next item in the combination
            backTrack(n, k, i + 1, combination);

            // backtrack
            combination.removeLast();
        }
    }
}
