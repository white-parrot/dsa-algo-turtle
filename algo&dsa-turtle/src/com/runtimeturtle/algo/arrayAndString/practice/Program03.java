package com.runtimeturtle.algo.arrayAndString.practice;

/* Given a fixed-length integer array arr, 
 * duplicate each occurrence of zero, 
 * shifting the remaining elements to the right.
 */
public class Program03 {

	/*
	 * Input: arr = [1,0,2,3,0,4,5,0] 
	 * Output: [1,0,0,2,3,0,0,4] 
	 * Explanation: After
	 * calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
	 */
	public void duplicateZeros(int[] arr) {
		int capacity = arr.length, head = 0;
		/* [1,0,2,3,0,4,5,0] */
		while (head < capacity) {
			if (arr[head] == 0) {
				for (int i = capacity - 2; i >= head; i--) {
					arr[i + 1] = arr[i];
				}
				head += 2;
			} else {
				head++;
			}
		}
	}

}
