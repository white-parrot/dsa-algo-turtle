package com.runtimeturtle.leetcode.array101;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link}https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
 * {@link}https://leetcode.com/problems/valid-mountain-array/
 *
 * @author white-parrot
 */
class Program3251 {

	public boolean checkIfExist(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int n = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (n == 2 * arr[j] || 2 * n == arr[j]) {
					return true;
				}
			}
		}
		// return track;

		/* Second Approach */
		Set<Integer> set = new HashSet<>();

		for (int i : arr) {
			if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) {
				return true;
			}

			set.add(i);
		}

		return false;
	}
}