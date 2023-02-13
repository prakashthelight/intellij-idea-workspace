package com.leetcode.solutions.n100;

/**
 * 58. Length of Last Word
 * <a href="https://leetcode.com/problems/length-of-last-word/">...</a>
 *
 * @author Prakash, Kumar
 * @category String
 */
public class LeetCode0058 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
