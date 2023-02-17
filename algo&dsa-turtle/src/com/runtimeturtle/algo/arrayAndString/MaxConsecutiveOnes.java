package com.runtimeturtle.algo.arrayAndString;

public class MaxConsecutiveOnes {

    /* [0,0,1,1,0,1,1,1] */
    public int findMaxConsecutiveOnes(int[] nums) {
    	
    	/* Define two pointer start and end to trace the 
    	 * start and end of the sub array, maxCount to 
    	 * record the max length of sub array ad count
    	 * to record the current length of sub-array */
        int start = 0, end = 0, maxCount = 0, count = 0;
        
        /* If found 0, check the length of current sub-array
         * to max length of sub-array. if current is greater
         * update the value of maxCount. move the pointer to
         * new value. If found 1,  move the end pointer to next
         * location 
         * */
        for(int i : nums){
            if(i == 0){
                if(end - start > maxCount){
                    maxCount = end - start;
                }
                end++;
                start=end;
            }else{
                end++;
            } 
        }
        /* Verify the Edge Case*/
        if(end - start > maxCount){
            maxCount = end - start;
        }
        return maxCount;
    }
    
}
