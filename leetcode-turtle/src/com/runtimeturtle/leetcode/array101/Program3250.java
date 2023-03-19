package com.runtimeturtle.leetcode.array101;

/**
 * {@link}https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
 * {@link}https://leetcode.com/problems/check-if-n-and-its-double-exist/
 *
 * @author white-parrot
 */
class Program3250 {

	public boolean validMountainArray(int[] arr) {

		/* Edge Case : If array length is less than 3 */
		if (arr.length < 3)
			return false;

		boolean maximaFound = false;
		@SuppressWarnings("unused")
		int trackMaxima = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			/* Edge Case : If two Items are equal */
			if (arr[i] == arr[i + 1]) {
				return false;
			} else if (arr[i] < arr[i + 1]) {
				/* find the maxima */
				trackMaxima++;
				/*
				 * Restrict the code entering again after the decreasing flow : i.e. Code is
				 * trying to find second maxima
				 */
				if (maximaFound)
					return false;
			} else {
				/* First Maxima Found */
				maximaFound = true;
			}
		}
		/* Edge Case that maxima can't be first and last element */
		// return maximaFound && (trackMaxima != 0);

		/* Second Improvised Approach */
		/* Edge Case : If array length is less than 3 */
		if (arr.length < 3)
			return false;

		int i = 0, n = arr.length;
		/* find first Maxima */
		while (i < n - 1 && arr[i] < arr[i + 1]) {
			i++;
		}

		/* Edge Case : maxima can't be first or Last Element */
		if (i == 0 || i == arr.length - 1)
			return false;

		/* check if it has only one Maxima */
		while (i < n - 1 && arr[i] > arr[i + 1]) {
			i++;
		}

		/* Check is there is Other Maxima too */
		if (i != n - 1)
			return false;

		return true;
	}
}