package com.leetcode.solutions.n50;

/**
 * 9. Palindrome Number
 * <a href="https://leetcode.com/problems/palindrome-number">...</a>
 *
 * @author Prakash, Kumar
 * @category Math
 */
public class LeetCode0009 {

    public boolean isPalindrome (int num) {
        if (num < 0 || (num != 0 && num % 10 == 0)) {
            return false;
        }

        int newNum = 0;
        while (num > newNum) {
            newNum = newNum * 10 + num % 10;
            num = num / 10;
        }

        return num == newNum || num == newNum / 10;
    }
}
