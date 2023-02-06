package com.leetcode.solutions.n50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0020Test {

    LeetCode0020 code = new LeetCode0020();

    @Test
    void isValidTest1() {
        String input = "()";
        Assertions.assertTrue(code.isValid(input));
    }

    @Test
    void isValidTest2() {
        String input = "()[]{}";
        Assertions.assertTrue(code.isValid(input));
    }

    @Test
    void isValidTest3() {
        String input = "(])";
        Assertions.assertFalse(code.isValid(input));
    }
}