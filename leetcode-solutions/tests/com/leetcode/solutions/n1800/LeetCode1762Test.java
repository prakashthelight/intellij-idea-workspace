package com.leetcode.solutions.n1800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode1762Test {

    LeetCode1762 code = new LeetCode1762();

    @Test
    public void findBuildingsTest1() {
        int[] heights = new int[]{4, 2, 3, 1};
        int[] expectedResult = new int[]{0, 2, 3};
        Assertions.assertArrayEquals(expectedResult, code.findBuildings(heights));
    }

    @Test
    public void findBuildingsTest2() {
        int[] heights = new int[]{4, 3, 2, 1};
        int[] expectedResult = new int[]{0, 1, 2, 3};
        Assertions.assertArrayEquals(expectedResult, code.findBuildings(heights));
    }

    @Test
    public void findBuildingsTest3() {
        int[] heights = new int[]{1, 3, 2, 4};
        int[] expectedResult = new int[]{3};
        Assertions.assertArrayEquals(expectedResult, code.findBuildings(heights));
    }
}