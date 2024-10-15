package com.runtimeturtle.algo.recursion;

public class PrintANthTermOfFibonacci {

    public static void main(String[] args) {
        System.out.println(algo(6));
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
