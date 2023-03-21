package com.runtimeturtle.leetcode.arrayAndString;

/**
 * {@link}https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1147/
 * {@link}https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 *
 * @author white-parrot
 */
public class Program1147 {

    public int dominantIndex(int[] nums) {
        
        int max = nums[0], secondMax = -1, traceIndex = 0, count = 0;
        for(int i : nums){
            if(max < i){
                secondMax = max;
                max = i;
                traceIndex = count;
            }
            if(secondMax < i && i != max){
                secondMax = i;
            }
            count++;
        }
        
        if(max >= secondMax*2){
            return traceIndex;
        }else{
            return -1;
        }

    }
}
