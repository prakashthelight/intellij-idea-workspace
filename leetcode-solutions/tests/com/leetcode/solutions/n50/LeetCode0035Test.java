package com.leetcode.solutions.n50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0035Test {

    LeetCode0035 code = new LeetCode0035();

    @Test
    void searchInsertTest1() {
        Assertions.assertEquals(2, code.searchInsert(new int[] {1,3,5,6}, 5));
    }

    @Test
    void searchInsertTest2() {
        Assertions.assertEquals(1, code.searchInsert(new int[] {1,3,5,6}, 2));
    }

    @Test
    void searchInsertTest3() {
        Assertions.assertEquals(4, code.searchInsert(new int[] {1,3,5,6}, 7));
    }

    @Test
    void searchInsertTest4() {
        Assertions.assertEquals(0, code.searchInsert(new int[] {1}, 0));
    }
}