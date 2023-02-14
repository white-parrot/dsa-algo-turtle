package com.runtimeturtle.leetcode;

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
