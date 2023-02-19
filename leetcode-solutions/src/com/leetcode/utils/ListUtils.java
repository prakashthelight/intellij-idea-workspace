package com.leetcode.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtils {
    public static List<List<Integer>> createListOfLists(Integer[]... arrays) {
        List<List<Integer>> lists = new ArrayList<>();
        for (Integer[] array : arrays) {
            lists.add(Arrays.stream(array).toList());
        }

        return lists;
    }
}
