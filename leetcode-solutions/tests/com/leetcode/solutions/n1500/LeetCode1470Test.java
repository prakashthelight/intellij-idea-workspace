package com.leetcode.solutions.n1500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode1470Test {
    LeetCode1470 code = new LeetCode1470();

    @Test
    public void shuffleTest1() {
        var nums = new int[]{2, 5, 1, 3, 4, 7};
        var n = 3;
        var shuffledArray = new int[]{2, 3, 5, 4, 1, 7};

        Assertions.assertArrayEquals(shuffledArray, code.shuffle(nums, n));
    }

    @Test
    public void shuffleTest2() {
        var nums = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        var n = 4;
        var shuffledArray = new int[]{1, 4, 2, 3, 3, 2, 4, 1};

        Assertions.assertArrayEquals(shuffledArray, code.shuffle(nums, n));
    }

    @Test
    public void shuffleTest3() {
        var nums = new int[]{1, 1, 2, 2};
        var n = 2;
        var shuffledArray = new int[]{1, 2, 1, 2};

        Assertions.assertArrayEquals(shuffledArray, code.shuffle(nums, n));
    }

}