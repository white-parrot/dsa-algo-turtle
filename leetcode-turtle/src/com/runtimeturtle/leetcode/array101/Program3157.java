package com.runtimeturtle.leetcode.array101;

/**
 * {@link}https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/ 
 * {@link}https://leetcode.com/problems/move-zeroes/
 *
 * @author pandeys3
 */
class Program3157 {

	public void moveZeroes(int[] nums) {

		int track = 0;

		/* 1 1 1 *//* 0 0 0 *//* 0 0 1 0 2 *//* 1 1 2 0 0 0 *//* 1 2 3 0 0 0 */
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {

			} else {
				if (track != i) {
					nums[track] = nums[i];
					nums[i] = 0;
				}
				track++;
			}
		}

	}
}