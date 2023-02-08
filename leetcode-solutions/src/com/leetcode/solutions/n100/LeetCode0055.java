package com.leetcode.solutions.n100;

import java.util.Arrays;

/**
 * 55. Jump Game
 * <a href="https://leetcode.com/problems/jump-game/">...</a>
 *
 * @author Prakash, Kumar
 * @category Arrays, Dynamic Programming, Greedy
 */
public class LeetCode0055 {
    // Set -1 for Unknown, 1 for Good, 0 for Bad
    int[] memo = null;

    public boolean canJump(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1); // Set all to Unknown
        memo[memo.length - 1] = 1; // Last one is the good position
        return canJump(0, nums);
    }

    public boolean canJump(int position, int[] nums) {
        if (memo[position] != -1) {
            return memo[position] == 1;
        }

        int maxJump = Math.min(position + nums[position], nums.length - 1);

        for (int nextPosition = position + 1; nextPosition <= maxJump; nextPosition++) {
            if (canJump(nextPosition, nums)) {
                memo[position] = 1;
                return true;
            }
        }

        memo[position] = 0;
        return false;
    }

    public boolean canJump1(int[] nums) {
        return canJump1(0, nums);
    }

    public boolean canJump1(int position, int[] nums) {
        if (position == nums.length - 1) {
            return true;
        }

        int maxJump = Math.min(position + nums[position], nums.length - 1);

        for (int nextPosition = position + 1; nextPosition <= maxJump; nextPosition++) {
            if (canJump1(nextPosition, nums)) {
                return true;
            }
        }

        return false;
    }
}
