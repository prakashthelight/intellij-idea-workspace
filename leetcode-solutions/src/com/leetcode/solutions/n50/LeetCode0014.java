package com.leetcode.solutions.n50;

/**
 * 14. Longest Common Prefix
 * <a href="https://leetcode.com/problems/longest-common-prefix">...</a>
 *
 * @author Prakash, Kumar
 * @category String, Trie
 */
public class LeetCode0014 {
    public String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        String prefix = strings[0];
        for (int i = 1; i < strings.length; i++) {
            System.out.println(strings[i]);
            while (strings[i].indexOf(prefix) != 0) { // "anything".indexOf("") is equal to 0
                prefix = prefix.substring(0, prefix.length() - 1);
            }

            if ("".equals(prefix)) {
                break;
            }
        }

        return prefix;
    }
}
