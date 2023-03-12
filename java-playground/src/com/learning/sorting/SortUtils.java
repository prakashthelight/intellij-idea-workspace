package com.learning.sorting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUtils {
    public static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void selectionSortSingleSwap(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int minValue = nums[i];
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < minValue) {
                    minValue = nums[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int temp = nums[i];
                nums[i] = nums[minIndex]; // or minValue
                nums[minIndex] = temp;
            }
        }
    }

    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // get the element at current position i
            int temp = nums[i];
            int prev = i - 1;
            // swap all elements to left, if bigger than current position element
            while (prev >= 0 && nums[prev] > temp) {
                nums[prev + 1] = nums[prev];
                prev--;
            }

            // insert the current position (i) element to its correct position after shifting
            nums[prev + 1] = temp;
        }
    }

    public static void mergeSort(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num);
        }
        mergeSort(list);
        int i = 0;
        for(Integer item : list) {
            nums[i++] = item;
        }
    }

    public static void mergeSort(List<Integer> list) {
        mergeSort(list, 0, list.size() -1);
    }

    private static void mergeSort(List<Integer> list, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(list, start, mid);
        mergeSort(list, mid + 1, end);
        merge(list, start, mid, mid + 1, end);
    }

    private static void merge(List<Integer> list, int start1, int end1, int start2, int end2) {
        int s = start1;
        List<Integer> mergedList = new ArrayList<>();

        while (start1 <= end1 && start2 <= end2) {
            if (list.get(start1) < list.get(start2)) {
                mergedList.add(list.get(start1++));
            } else {
                mergedList.add(list.get(start2++));
            }
        }

        while (start1 <= end1) {
            mergedList.add(list.get(start1++));
        }

        while (start2 <= end2) {
            mergedList.add(list.get(start2++));
        }

        for (Integer integer : mergedList) {
            list.set(s++, integer);
        }
    }
}

