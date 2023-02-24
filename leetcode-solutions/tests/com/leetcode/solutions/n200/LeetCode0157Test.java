package com.leetcode.solutions.n200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0157Test {
    LeetCode0157 code = new LeetCode0157();

    @Test
    void readTest1() {
        code.setup("abc");
        int n = 4;
        char[] buf = new char[n];
        Assertions.assertEquals(3, code.read(buf, 4));
        Assertions.assertEquals("abc", new String(buf).substring(0, 3));
    }

    @Test
    void readTest2() {
        code.setup("abcde");
        int n = 5;
        char[] buf = new char[n];
        Assertions.assertEquals(5, code.read(buf, n));
        Assertions.assertEquals("abcde", new String(buf).substring(0, n));
    }

    @Test
    void readTest3() {
        code.setup("abcdABCD1234");
        int n = 12;
        char[] buf = new char[n];
        Assertions.assertEquals(12, code.read(buf, n));
        Assertions.assertEquals("abcdABCD1234", new String(buf).substring(0, n));
    }

    @Test
    void read4Test1() {
        code.setup("abcde");
        char[] buf4= new char[4];
        Assertions.assertEquals(4, code.read4(buf4));
        Assertions.assertEquals(1, code.read4(buf4));
    }
}