package com.leetcode.solutions.n50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0009Test {

    @Test
    void isPalindromeTest1() {
        Assertions.assertTrue(new LeetCode0009().isPalindrome(121));
    }

    @Test
    void isPalindromeTest2() {
        Assertions.assertFalse(new LeetCode0009().isPalindrome(-1));
    }

    @Test
    void isPalindromeTest3() {
        Assertions.assertTrue(new LeetCode0009().isPalindrome(0));
    }
}