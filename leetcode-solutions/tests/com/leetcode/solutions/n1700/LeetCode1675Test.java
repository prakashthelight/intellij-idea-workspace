package com.leetcode.solutions.n1700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode1675Test {
    LeetCode1675 code = new LeetCode1675();

    @Test
    void minimumDeviationTest1() {
        Assertions.assertEquals(1, code.minimumDeviation(new int[] {1,2,3,4}));
    }

    @Test
    void minimumDeviationTest2() {
        Assertions.assertEquals(3, code.minimumDeviation(new int[] {4,1,5,20,3}));
    }

    @Test
    void minimumDeviationTest3() {
        Assertions.assertEquals(3, code.minimumDeviation(new int[] {2,10,8}));
    }

    @Test
    void minimumDeviationTest4() {
        Assertions.assertEquals(1, code.minimumDeviation(new int[] {3,5}));
    }
}