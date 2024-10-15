package com.runtimeturtle.algo.recursion;

public class PrintAFibonacciUptoNthTerm {

    public static void main(String[] args) {
        int n = 6;
        for(int i = 0; i <= n; i++){
            System.out.println(algo(i));
        }
    }

    public static int algo(int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        return ( algo(n - 1) + algo(n - 2));
    }
}
