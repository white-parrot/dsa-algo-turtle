package com.runtimeturtle.leetcode;

public class Program1342 {

    public int numberOfSteps(int num) {
        int step = 0;
        while(num > 0){
            if(num % 2 == 0){
                num /= 2;
                step++;
            }else{
                num -= 1;
                step++;
            }
        }
        
        /* Bitwise Solution */
        step = 0;
        while(num > 0){
            if((num & 1)==0){
                num >>= 1;
                step++;
            }else{
                num--;
                step++;
            }
        }
        
        return step;
    }
	
}
