package com.learning.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortUtilsTest {

    @Test
    void selectionSortTest() {
        int[] nums = {2, 12, 8, 9, 4, 10, 7, 1};
        int[] expectedArray = {1, 2, 4, 7, 8, 9, 10, 12};
        SortUtils.selectionSort(nums);
        Assertions.assertArrayEquals(expectedArray, nums);
    }

    @Test
    void selectionSortSingleSwapTest() {
        int[] nums = {2, 12, 8, 9, 4, 10, 7, 1};
        int[] expectedArray = {1, 2, 4, 7, 8, 9, 10, 12};
        SortUtils.selectionSortSingleSwap(nums);
        Assertions.assertArrayEquals(expectedArray, nums);
    }

    @Test
    void bubbleSortTest1() {
        int[] nums = {2, 12, 8, 9, 4, 10, 7, 1};
        int[] expectedArray = {1, 2, 4, 7, 8, 9, 10, 12};
        SortUtils.bubbleSort(nums);
        Assertions.assertArrayEquals(expectedArray, nums);
    }

    @Test
    void insertionSortTest() {
        int[] nums = {2, 12, 8, 9, 4, 10, 7, 1};
        int[] expectedArray = {1, 2, 4, 7, 8, 9, 10, 12};
        SortUtils.insertionSort(nums);
        Assertions.assertArrayEquals(expectedArray, nums);
    }

    @Test
    void mergeSortTest() {
        int[] nums = {2, 12, 8, 9, 4, 10, 7, 1};
        int[] expectedArray = {1, 2, 4, 7, 8, 9, 10, 12};
        SortUtils.mergeSort(nums);
        Assertions.assertArrayEquals(expectedArray, nums);
    }
}