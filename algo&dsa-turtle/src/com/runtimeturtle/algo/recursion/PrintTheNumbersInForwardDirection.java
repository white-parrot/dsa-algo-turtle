package com.runtimeturtle.algo.recursion;

public class PrintTheNumbersInForwardDirection {
    
    public static void main(String[] args) {
        algo(6);
    }

    public static void algo(int n) {
        if (n < 0) {
            return;
        }
        algo(n - 1);
        System.out.println(n);
    }
}
