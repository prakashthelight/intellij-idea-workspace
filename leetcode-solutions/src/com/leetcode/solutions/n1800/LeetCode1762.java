package com.leetcode.solutions.n1800;

import java.util.LinkedList;

/**
 * 77. Combinations
 * <a href="https://leetcode.com/problems/buildings-with-an-ocean-view/">...</a>
 *
 * @author Prakash, Kumar
 * @category Array, Stack, Monotonic Stack
 */
public class LeetCode1762 {
    public int[] findBuildings(int[] heights) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < heights.length; i++) {
            // remove all smaller buildings (height indexes) already visited from left
            while (!list.isEmpty() && heights[list.getLast()] <= heights[i]) {
                list.removeLast();
            }

            // add new building height,
            // which may be later removed by any other taller than this one
            list.add(i);
        }

        // make an array to return
        int[] result = new int[list.size()];
        int i = 0;
        for (Integer index : list) {
            result[i++] = index;
        }

        return result;
    }
}
