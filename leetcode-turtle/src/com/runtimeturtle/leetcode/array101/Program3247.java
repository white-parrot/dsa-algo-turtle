package com.runtimeturtle.leetcode.array101;

/**
 * {@link}https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
 * {@link}https://leetcode.com/problems/remove-element/
 *
 * @author white-parrot
 */
class Program3247 {

	public int removeElement(int[] nums, int val) {

		int track = 0;

		for (int i = 0; i < nums.length; i++) {
			if (val != nums[i]) {
				if (track != i) {
					nums[track] = nums[i];
				}
				track++;
			}
		}

		// return track;
		
		/* Improvised Solution */
		/**
		 * When we encounter nums[i]=val we can swap the current element out with the
		 * last element and dispose the last one. This essentially reduces the array's
		 * size by 1. nums=[4,1,2,3,5],val=4. the problem description mentions that the
		 * order of elements could be changed
		 */
		int i = 0;
		int n = nums.length;
		while (i < n) {
			if (nums[i] == val) {
				nums[i] = nums[n - 1];
				// reduce array size by one
				n--;
			} else {
				i++;
			}
		}
		return n;
	}
}