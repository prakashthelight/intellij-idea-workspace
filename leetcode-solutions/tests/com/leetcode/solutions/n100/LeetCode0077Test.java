package com.leetcode.solutions.n100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LeetCode0077Test {

    LeetCode0077 code = new LeetCode0077();

    @Test
    void combineTest1() {
        int n = 4;
        int k = 2;
        int[][] result = new int[][]{{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}};
        int i = 0;
        for (List<Integer> list : code.combine(n, k)) {
            int j = 0;
            for (int item : list) {
                Assertions.assertEquals(result[i][j], item);
                j++;
            }
            i++;
        }
    }

    @Test
    void combineTest2() {
        int n = 1;
        int k = 1;
        int[][] result = new int[][]{{1}};
        int i = 0;
        for (List<Integer> list : code.combine(n, k)) {
            int j = 0;
            for (int item : list) {
                Assertions.assertEquals(result[i][j], item);
                j++;
            }
            i++;
        }
    }
}