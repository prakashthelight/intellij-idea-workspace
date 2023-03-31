package com.leetcode.solutions.n350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 323. Number of Connected Components in an Undirected Graph
 * <a href="https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/">...</a>
 *
 * @author Prakash, Kumar
 * @category Depth-First Search, Breadth-First Search, Union Find, Graph
 */
public class LeetCode0323 {
    int[] visited = null;
    List<List<Integer>> adjList = null;
    public int countComponents(int n, int[][] edges) {
        visited = new int[n];
        Arrays.fill(visited, -1);

        createGraph(n, edges);

        int connectedComponents = 0;
        for (int source = 0; source < n; source++) {
            if (visited[source] == -1) {
                connectedComponents++;
                dfs(source);
            }
        }
        return connectedComponents;
    }

    public void dfs(int source) {
        visited[source] = 1;
        for (int neighbor : adjList.get(source)) {
            if (visited[neighbor] == -1) {
                dfs(neighbor);
            }
        }
    }

    public void createGraph(int n, int[][] edges) {
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int source = edge[0];
            int dest = edge[1];
            adjList.get(source).add(dest);
            adjList.get(dest).add(source);
        }
    }
}
