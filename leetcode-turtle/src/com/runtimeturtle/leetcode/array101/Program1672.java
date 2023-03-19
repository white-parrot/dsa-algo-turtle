package com.runtimeturtle.leetcode.array101;

/**
 * {@link}https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4423/
 * {@link}https://leetcode.com/problems/richest-customer-wealth/
 *
 * @author white-parrot
 */
public class Program1672 {

    int maxBalance = -1;
    public int maximumWealth(int[][] accounts) {
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum > maxBalance){
                maxBalance = sum;
            }
        }
        return maxBalance;
    }

}
