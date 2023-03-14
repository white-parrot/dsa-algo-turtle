package com.runtimeturtle.leetcode;

/**
 * {@link}https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
 * {@link}https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * @author white-parrot
 */
class Program3248 {
    
	public int removeDuplicates(int[] nums) {
        
        int track = 0;
        /* 1, 1, 2 */
        for(int i = 1; i < nums.length; i++){
            if(nums[track] != nums[i]){
                track += 1;
                nums[track] = nums[i];
            }
        }
        return track + 1;
    }

}