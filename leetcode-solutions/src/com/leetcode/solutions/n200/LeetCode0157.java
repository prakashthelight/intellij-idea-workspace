package com.leetcode.solutions.n200;

import com.leetcode.solutions.n150.LeetCode0145;

import java.util.Arrays;

/**
 * 157. Read N Characters Given Read4
 * <a href="https://leetcode.com/problems/read-n-characters-given-read4/">...</a>
 *
 * @author Prakash, Kumar
 * @category String, Simulation, Interactive
 */
public class LeetCode0157 {
    private  String str;
    int index = 0;

    void setup(String str) {
        this.str = str;
        this.index = 0;
    }

    public int read4(char[] buf4) {
        int i = 0;
        while (i < 4 & index < str.length()) {
            buf4[i++] = str.charAt(index++);
        }

        return i;
    }

    public int read(char[] buf, int n) {
        char[] buf4 = new char[4];

        int index = 0;
        boolean eof = false;
        while (index < n && !eof) {
            int count = read4(buf4);
            if (count < 4) {
                eof = true;
            }

            for (int i = 0; i < count && index < n; i++) {
                buf[index++] = buf4[i];
            }
        }

        return index;
    }
}
