package com.leetcode.solutions.n50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0013Test {
    LeetCode0013 code = new LeetCode0013();

    @Test
    void test1() {
        Assertions.assertEquals(3, code.romanToInt("III"));
    }

    @Test
    void test2() {
        Assertions.assertEquals(58, code.romanToInt("LVIII"));
    }

    @Test
    void test3() {
        Assertions.assertEquals(1994, code.romanToInt("MCMXCIV"));
    }
}