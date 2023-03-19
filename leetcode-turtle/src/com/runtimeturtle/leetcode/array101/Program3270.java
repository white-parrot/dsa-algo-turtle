package com.runtimeturtle.leetcode.array101;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link}https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/ 
 * {@link}https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 * @author white-parrot
 */
class Program3270 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){
            int traceIndex = Math.abs(nums[i])-1;
            int traceValue = nums[traceIndex];
            if(!(traceValue < 0)){
                nums[traceIndex] = traceValue * -1;
            }            
        }

        List<Integer> result = new ArrayList<>();
        
        int count = 1;
        for(int i : nums){
            if(i > 0){
                result.add(count);
                
            }
            count++;
        }
        
        return result;
    }

}