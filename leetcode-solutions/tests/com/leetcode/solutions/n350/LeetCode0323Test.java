package com.leetcode.solutions.n350;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0323Test {

    LeetCode0323 code = new LeetCode0323();

    @Test
    void countComponents() {
        int[][] edges = {{0,1},{1,2},{3,4}};
        int n = 5;
        code.countComponents(n, edges);
        Assertions.assertEquals(2, code.countComponents(n, edges));
    }
}