package com.leetcode.solutions.n50;

/**
 * 6. Zigzag Conversion
 * <a href="https://leetcode.com/problems/zigzag-conversion">...</a>
 *
 * @author Prakash, Kumar
 * @category String
 */
public class LeetCode0006 {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows < 2) {
            return s;
        }

        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < sbs.length; i++) {
            sbs[i] = new StringBuilder();
        }

        int i = 0;
        int length = s.length();

        while (i < length) {
            // fill sbs forward from 0 to numRows
            for (int j = 0; j < numRows && i < length; j++) {
                sbs[j].append(s.charAt(i++));
            }

            // fill sbs backward which is 2 less than numRows till 1
            for (int j = numRows - 2; j > 0 && i < length; j--) {
                sbs[j].append(s.charAt(i++));
            }
        }

        for (int k = 1; k < numRows; k++) {
            sbs[0].append(sbs[k].toString());
        }

        return sbs[0].toString();
    }
}
