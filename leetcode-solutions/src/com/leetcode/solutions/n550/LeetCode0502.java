package com.leetcode.solutions.n550;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 502. IPO
 * <a href="https://leetcode.com/problems/ipo/">...</a>
 *
 * @author Prakash, Kumar
 * @category Array, Greedy, Sorting, Heap (Priority Queue)
 */
public class LeetCode0502 {

    /**
     * @param k       number of projects
     * @param w       initial capital
     * @param profits profit from each project
     * @param capital capital needed to start each project
     * @return maxCapital
     */
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        // assuming that profits.length and capital.length is same as expected
        int n = profits.length;
        int maxCapital = w;
        Project[] projects = new Project[n];
        for (int i = 0; i < n; i++) {
            projects[i] = new Project(profits[i], capital[i]);
        }

        Arrays.sort(projects);
        PriorityQueue<Project> projectsMaxProfitHeap = new PriorityQueue<>(new Comparator<Project>() {
            @Override
            public int compare(Project p1, Project p2) {
                // descending order for max heap
                return p2.profit - p1.profit;
            }
        });

        int index = 0;
        // run until picked all k projects
        for (int i = 0; i < k; i++) {
            // insert all projects which can be taken with current capital
            while (index < n && projects[index].capital <= maxCapital) {
                projectsMaxProfitHeap.offer(projects[index++]);
            }

            if (projectsMaxProfitHeap.isEmpty()) {
                break;
            }

            // pick project from max (profit) heap
            maxCapital += projectsMaxProfitHeap.poll().profit;
        }

        return maxCapital;
    }

    static class Project implements Comparable<Project> {
        int profit, capital;

        public Project(int profit, int capital) {
            this.profit = profit;
            this.capital = capital;
        }

        @Override
        public int compareTo(Project project) {
            // when used for sort, sorted in ascending capital cost order
            return this.capital - project.capital;
        }
    }
}
