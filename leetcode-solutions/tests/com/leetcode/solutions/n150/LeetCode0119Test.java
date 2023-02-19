package com.leetcode.solutions.n150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LeetCode0119Test {
    LeetCode0119 code = new LeetCode0119();

    @Test
    void getRowTest1() {
        List<Integer> expectedResult = code.getRow(0);
        Assertions.assertEquals(1, expectedResult.size());
    }

    @Test
    void getRowTest2() {
        List<Integer> expectedResult = code.getRow(1);
        Assertions.assertEquals(2, expectedResult.size());
    }

    @Test
    void getRowTest3() {
        List<Integer> expectedResult = code.getRow(3);
        Assertions.assertEquals(4, expectedResult.size());
    }
}