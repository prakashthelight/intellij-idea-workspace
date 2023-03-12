package com.leetcode.solutions.n50;

import com.leetcode.utils.ListUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LeetCode0046Test {

    LeetCode0046 code = new LeetCode0046();

    @Test
    void permuteTest1() {
        int[] nums = new int[]{1, 2, 3};

        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(ListUtils.createListOfIntegers(1, 2, 3));
        expectedResult.add(ListUtils.createListOfIntegers(1, 3, 2));
        expectedResult.add(ListUtils.createListOfIntegers(2, 1, 3));
        expectedResult.add(ListUtils.createListOfIntegers(2, 3, 1));
        expectedResult.add(ListUtils.createListOfIntegers(3, 1, 2));
        expectedResult.add(ListUtils.createListOfIntegers(3, 2, 1));

        List<List<Integer>> actualResult = code.permute(nums);
        Assertions.assertEquals(expectedResult.size(), actualResult.size());

        for (List<Integer> list : actualResult) {
            Assertions.assertTrue(list.containsAll(Arrays.asList(1, 2, 3)));
        }
    }
}