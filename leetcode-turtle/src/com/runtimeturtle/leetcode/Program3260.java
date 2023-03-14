package com.runtimeturtle.leetcode;

/**
 * {@link}https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/ 
 * {@link}https://leetcode.com/problems/sort-array-by-parity/
 *
 * @author white-parrot
 */
class Program3260 {

    public int[] sortArrayByParity(int[] nums) {
        
        /* 1 *//* 2 *//* 1 3 *//* 2 4 *//* 1 3 2 4 *//* 2 4 1 3 *//* 1 2 3 4*//* 0 1 2*/
        int trackOdd = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                if(trackOdd != i){
                    int temp = nums[trackOdd];
                    nums[trackOdd] = nums[i];
                    nums[i] = temp;
                }
                trackOdd++;
            }
        }
        return nums;
    }

}