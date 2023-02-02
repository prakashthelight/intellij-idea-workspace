package com.leetcode.solutions.n50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0014Test {
    LeetCode0014 code = new LeetCode0014();

    @Test
    void test1() {
        String[] strings = new String[]{"flower", "flow", "flight"};
        Assertions.assertEquals("fl", code.longestCommonPrefix(strings));
    }

    @Test
    void test2() {
        String[] strings = new String[]{"dog", "racecar", "car", "ball"};
        Assertions.assertEquals("", code.longestCommonPrefix(strings));
    }
}