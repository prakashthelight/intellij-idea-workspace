package com.leetcode.solutions.n50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0006Test {

    LeetCode0006 code = new LeetCode0006();

    @Test
    public void convertTest1() {
        Assertions.assertEquals("PAHNAPLSIIGYIR", code.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void convertTest2() {
        Assertions.assertEquals("PINALSIGYAHRPI", code.convert("PAYPALISHIRING", 4));
    }

    @Test
    public void convertTest3() {
        Assertions.assertEquals("A", code.convert("A", 1));
    }
}