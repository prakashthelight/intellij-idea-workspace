package com.leetcode.solutions.n1500;

import java.util.List;

/**
 * 1507. Reformat Date
 * <a href="https://leetcode.com/problems/reformat-date/">...</a>
 *
 * @author Prakash, Kumar
 * @category String
 */
public class LeetCode1507 {
    List<String> months = List.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");

    public String reformatDate(String date) {
        String[] parts = date.split(" ");

        if (parts.length == 3) {
            int year = Integer.parseInt(parts[2]);
            int month = months.indexOf(parts[1]) + 1;
            int day = Integer.parseInt(parts[0].substring(0, parts[0].length() - 2));
            return reformatDate(year, month, day);
        }

        return null;
    }

    public String reformatDate(int year, int month, int day) {
        return String.format("%s-%s-%s", year, month >= 10 ? month : "0" + month, day >= 10 ? day : "0" + day);
    }
}
