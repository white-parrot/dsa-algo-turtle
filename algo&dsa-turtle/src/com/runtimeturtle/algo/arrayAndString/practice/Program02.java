package com.runtimeturtle.algo.arrayAndString.practice;

import java.util.Arrays;
import java.util.Scanner;

/* Given an integer array nums sorted in non-decreasing order, 
 * return an array of the squares of each number sorted in non-decreasing order.
 */
public class Program02 {

	/* Input: nums = [-4,-1,0,3,10]
	 * Output: [0,1,9,16,100]
	 * Explanation: After squaring, the array becomes [16,1,0,9,100].
	 * After sorting, it becomes [0,1,9,16,100].
	 */
    public int[] sortedSquares(int[] nums) {
 
    	/* Simple Approach */
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        
        Arrays.sort(nums);
        // return nums;  
        
        /* Second Approach */
        int capacity = nums.length;
        int head = 0, trail = capacity-1, index = capacity - 1;
        int[] sortedArray = new int[capacity];
        
        /**
         * Take a head and trail pointer on array, find the square
         * and compare, store the Bigger square at the end of output
         * array (sortedArray). Decrease the index by 1
         */
        while(head <= trail){
            int x = (int) Math.pow(nums[head], 2);
            int y = (int) Math.pow(nums[trail],2);
            
            if(x > y){
                sortedArray[index] = x;
                index--;
                head++;
            }else{
                sortedArray[index] = y;
                index--;
                trail--;
            }
        }
        
        return sortedArray;
    }

}
