package com.runtimeturtle.leetcode.array101;

/**
 * {@link}https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3258/
 * {@link}https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * @author white-parrot
 */
class Program3258 {

    public int removeDuplicates(int[] nums) {
        
        /* 1 1 1 *//* 1 2 3 *//* 1 1 1 2 3*/
        int track = 0;
        for(int i =  0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                
            }else{
                track++;
                if(track != i + 1){
                    nums[track] = nums[i+1];
                }
            }
        }
        
        return track+1;
        
    }
}