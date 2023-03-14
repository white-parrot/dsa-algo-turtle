package com.runtimeturtle.leetcode;

/**
 * {@link}https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4425/
 * {@link}https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 *
 * @author white-parrot
 */
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
