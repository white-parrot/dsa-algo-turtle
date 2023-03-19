package com.runtimeturtle.leetcode.array101;

import java.util.Arrays;

/**
 * {@link}https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3228/
 * {@link}https://leetcode.com/problems/height-checker/
 *
 * @author white-parrot
 */
class Program3228 {
    
    public int heightChecker(int[] heights) {
        
        int[] expected = heights.clone();
        Arrays.sort(heights);
        
        int track = 0;
        
        for(int i = 0; i < heights.length; i++){
            if(expected[i] != heights[i]) track++;
        }
        // return track;
        
        /* Count Sort Approach */
        // perform a bucket-sort
        int[] bucket = new int[101];
        for(int number : heights) {
            bucket[number]++;
        }
        
        // check the ammount of disparities between the input array and the bucket
        int count = 0, index = 0;
        for(int i = 1; i <= 100; i++) {
            while(bucket[i] > 0) {
                if(i != heights[index++]) count++;
                bucket[i]--;
            }
        }
        return count;
    }

}