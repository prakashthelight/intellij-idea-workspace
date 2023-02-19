package com.leetcode.solutions.n150;

import java.util.LinkedList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 * <a href="https://leetcode.com/problems/pascals-triangle-ii/">...</a>
 *
 * @author Prakash, Kumar
 * @category Array, Dynamic Programming
 */
public class LeetCode0119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new LinkedList<>();
        if (rowIndex == 0) {
            result.add(1);
            return result;
        }

        if (rowIndex == 1) {
            result.add(1);
            result.add(1);
            return result;
        }

        if (rowIndex > 1) {
            List<Integer> list = getRow(rowIndex - 1);
            result = new LinkedList<>();
            // Add first 1
            result.add(1);

            // Add new elements using previous level row values
            for (int i = 0; i < list.size() - 1; i++) {
                result.add(list.get(i) + list.get(i + 1));
            }

            // Add last 1
            result.add(1);
        }

        return result;
    }
}
