package com.leetcode.solutions.n50;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * <a href="https://leetcode.com/problems/valid-parentheses/">...</a>
 *
 * @author Prakash, Kumar
 * @category String, Stack
 */
public class LeetCode0020 {
    public boolean isValid(String s) {
        String openBraces = "({[";
        String closedBraces = ")}]";
        var stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (openBraces.indexOf(ch) != -1) {
                stack.push(ch);
            } else if (closedBraces.indexOf(ch) != -1) {
                // there is no matching open brace available to pop
                if (stack.isEmpty() || closedBraces.indexOf(ch) != openBraces.indexOf(stack.pop())) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
