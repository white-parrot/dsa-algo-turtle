package com.runtimeturtle.leetcode.array101;

/**
 * {@link}https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3230/ 
 * {@link}https://leetcode.com/problems/max-consecutive-ones-ii/
 *
 * @author white-parrot
 */
class Program3230 {

	public int findMaxConsecutiveOnes(int[] nums) {

		/* Two Pointer Approach */
		/* 1 1 1 *//* 0 0 0 *//* 1 0 1 1 0 1 1 *//* 1 0 1 1 0 0 1 1 1 1 1 0 */
		/* 1 0 1 1 0 *//* 1 0 1 1 0 1 */
		int tail = 0, head = 0, n = nums.length, maxOnes = 0, flippedZero = 0;
		boolean flipped = false;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 1) {
				head++;
			} else {
				if (!flipped) {
					head++;
					flippedZero = i;
					flipped = true;
				} else {
					if (head - tail > maxOnes) {
						maxOnes = head - tail;
					}
					tail = flippedZero + 1;
					flippedZero = i;
					head++;
				}
			}
		}
		if(head == tail) {
			return 1;
		}else if (head - tail > maxOnes) {
			maxOnes = head - tail;
		}
		/* return maxOnes; */
		
		/* Sliding Window Approach*/
        int longestSequence = 0;
        int left = 0;
        int right = 0;
        int numZeroes = 0;

        // while our window is in bounds
        while (right < nums.length) {

            // add the right most element into our window
            if (nums[right] == 0) {
                numZeroes++;
            }

            // if our window is invalid, contract our window
            while (numZeroes == 2) {
                if (nums[left] == 0) {
                    numZeroes--;
                }
                left++;
            }

            // update our longest sequence answer
            longestSequence = Math.max(longestSequence, right - left + 1);

            // expand our window
            right++;
        }
        return longestSequence;
	}

}