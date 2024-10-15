package com.runtimeturtle.algo.recursion;

public class PrintTheNumbersInBackwardDirection {

    public static void main(String[] args) {
        algo(6);
    }

    public static void algo(int n) {
        System.out.println(n);
        if (n == 0) {
            return;
        }
        algo(n - 1);
    }
}
