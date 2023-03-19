package com.runtimeturtle.leetcode.array101;

/**
 * {@link}https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4422/
 * {@link https://leetcode.com/problems/running-sum-of-1d-array/
 *
 * @author white-parrot
 */
public class Program1480 {

    public int[] runningSum(int[] nums) {
        int runningsum[] = new int[nums.length];
        runningsum[0] = nums[0];
        for(int i = 1;i < nums.length; i++){
            runningsum[i] = runningsum[i-1] + nums[i];
        }
        return runningsum;
    }
	
}
