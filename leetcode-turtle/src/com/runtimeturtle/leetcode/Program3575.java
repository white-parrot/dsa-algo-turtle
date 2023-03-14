package com.runtimeturtle.leetcode;

/**
 * {@link}https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3575/
 * {@link}https://leetcode.com/problems/remove-element/
 *
 * @author white-parrot
 */
class Program3575 {

    public int removeElement(int[] nums, int val) {
       
    	/* 3 2 2 3 */
        int track = 0;
        for(int i = 0; i < nums.length; i++){
           if(nums[i] == val){
           }else{
               int temp = nums[i];
               nums[i] = nums[track];
               nums[track] = temp;
               track++;
           }
        }
        return track;
    }

}