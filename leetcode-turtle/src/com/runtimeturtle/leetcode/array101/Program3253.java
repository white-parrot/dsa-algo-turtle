package com.runtimeturtle.leetcode.array101;

import java.util.Arrays;

/**
 * {@link}https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
 * {@link}https://leetcode.com/problems/merge-sorted-array/
 *
 * @author white-parrot
 */
class Program3253 {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		while (n >= 0) {
			if (n == 0) {
				break;
			} else if (m == 0) {
				while (n > 0) {
					nums1[m + n - 1] = nums2[n - 1];
					n -= 1;
				}
				break;
			} else if (nums1[m - 1] > nums2[n - 1]) {
				nums1[m + n - 1] = nums1[m - 1];
				m = m - 1;
			} else if (nums1[m - 1] <= nums2[n - 1]) {
				nums1[m + n - 1] = nums2[n - 1];
				n = n - 1;
			}
		}

		// Accepted Solution:
		for (int i = 0; i < n; i++) {
			nums1[i + m] = nums2[i];
		}
		Arrays.sort(nums1);
	}
}