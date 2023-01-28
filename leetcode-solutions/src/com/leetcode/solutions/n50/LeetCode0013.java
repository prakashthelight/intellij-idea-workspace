package com.leetcode.solutions.n50;

/**
 * 13. Roman to Integer
 * <a href="https://leetcode.com/problems/roman-to-integer/">...</a>
 *
 * @author Prakash, Kumar
 * @category Hash Table, Math, String
 */
public class LeetCode0013 {
    public int romanToInt(String s) {
        int result = 0;
        // from first to second last character
        for (int i = 0; i < s.length() - 1; i++) {
            int num = romanToInt(s.charAt(i));
            int nextNum = romanToInt(s.charAt(i + 1));
            if (num < nextNum) {
                result -= num;
            } else {
                result += num;
            }
        }

        // add value of last character
        result += romanToInt(s.charAt(s.length() - 1));

        return result;
    }

    public int romanToInt(char ch) {
        return switch (ch) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> -1; // invalid roman character
        };
    }
}
