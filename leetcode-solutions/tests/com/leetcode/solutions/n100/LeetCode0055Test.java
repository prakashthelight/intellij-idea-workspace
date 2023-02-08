package com.leetcode.solutions.n100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0055Test {

    LeetCode0055 code = new LeetCode0055();

    @Test
    void canJump() {
        Assertions.assertTrue(code.canJump(new int[] {2,3,1,1,4}));
    }

    @Test
    void canJump1() {
        Assertions.assertTrue(code.canJump1(new int[] {2,3,1,1,4}));
    }
}