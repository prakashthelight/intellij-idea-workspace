package com.leetcode.solutions.n100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0058Test {
    LeetCode0058 code = new LeetCode0058();

    @Test
    void lengthOfLastWordTest1() {
        Assertions.assertEquals(5, code.lengthOfLastWord("Hello World"));
    }

    @Test
    void lengthOfLastWordTest2() {
        Assertions.assertEquals(4, code.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void lengthOfLastWordTest3() {
        Assertions.assertEquals(6, code.lengthOfLastWord("luffy is still joyboy"));
    }
}