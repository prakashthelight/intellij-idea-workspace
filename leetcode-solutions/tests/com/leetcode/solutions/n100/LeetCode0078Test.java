package com.leetcode.solutions.n100;

import com.leetcode.utils.ListUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0078Test {
    LeetCode0078 code = new LeetCode0078();

    @Test
    void subsetsTest1() {
        int[] nums = new int[] {1, 2, 3};
        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList<>());
        expectedResult.add(ListUtils.createListOfIntegers(1));
        expectedResult.add(ListUtils.createListOfIntegers(2));
        expectedResult.add(ListUtils.createListOfIntegers(1, 2));
        expectedResult.add(ListUtils.createListOfIntegers(3));
        expectedResult.add(ListUtils.createListOfIntegers(1,3));
        expectedResult.add(ListUtils.createListOfIntegers(2,3));
        expectedResult.add(ListUtils.createListOfIntegers(1, 2,3));


        List<List<Integer>> actualResult = code.subsets(nums);
        Assertions.assertEquals(expectedResult.size(), actualResult.size());

        // TODO: 3/12/2023 - Add more Assertions 
    }
}