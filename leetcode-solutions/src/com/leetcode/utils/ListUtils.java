package com.leetcode.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtils {
    public static List<List<Integer>> createListOfLists(Integer[]... arrays) {
        List<List<Integer>> lists = new ArrayList<>();
        for (Integer[] array : arrays) {
            List<Integer> list = new ArrayList<>(Arrays.asList(array));
            lists.add(list);
        }

        return lists;
    }

    public static List<Integer> createListOfIntegers(int... nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num);
        }

        return list;
    }

    public static String toString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i =0; i < list.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(list.get(i));
        }

        sb.append(']');
        return sb.toString();
    }
}
