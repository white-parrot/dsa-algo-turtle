package com.runtimeturtle.leetcode.arrayAndString;

/**
 * {@link}https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
 * {@link}https://leetcode.com/problems/find-pivot-index/
 *
 * @author white-parrot
 */
public class Program1144 {

	public int pivotIndex(int[] nums) {

		int rightSum = 0;
		for (int i = 1; i < nums.length; i++) {
			rightSum += nums[i];
		}

		if (rightSum == 0) {
			return 0;
		}

		int pivot = -1, leftSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int temp = rightSum - nums[i];
			if (leftSum == temp) {
				return i;
			} else {
				leftSum += nums[i];
				rightSum -= nums[i];
			}
		}
		return -1;
	}

}
