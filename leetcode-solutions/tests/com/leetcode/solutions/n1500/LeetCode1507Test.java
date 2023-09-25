package com.leetcode.solutions.n1500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode1507Test {

    LeetCode1507 code = new LeetCode1507();

    @Test
    public void reformatDate1() {
        String date = "20th Oct 2052";
        Assertions.assertEquals("2052-10-20", code.reformatDate(date));
    }

    @Test
    public void reformatDate2() {
        String date = "6th Jun 1933";
        Assertions.assertEquals("1933-06-06", code.reformatDate(date));
    }

    @Test
    public void reformatDate3() {
        String date = "26th May 1960";
        Assertions.assertEquals("1960-05-26", code.reformatDate(date));
    }
}