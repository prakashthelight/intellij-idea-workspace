package com.leetcode.solutions.n1550;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode1523Test {

    LeetCode1523 code = new LeetCode1523();
    @Test
    void countOddsTest1() {
        Assertions.assertEquals(3, code.countOdds(3, 7));
    }

    @Test
    void countOddsTest2() {
        Assertions.assertEquals(1, code.countOdds(8, 10));
    }
}