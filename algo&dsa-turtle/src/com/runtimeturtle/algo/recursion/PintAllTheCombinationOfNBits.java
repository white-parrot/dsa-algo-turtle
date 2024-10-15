package com.runtimeturtle.algo.recursion;

import java.util.Arrays;

public class PintAllTheCombinationOfNBits {

    static int[] arr = { 1, 1, 1, 1 };
    public static void main(String[] args) {
        algo(4);
    }

    public static void algo(int n) {
        if(n < 1){
            System.out.println(Arrays.toString(arr));
        }else {
            arr[n-1] = 0;
            algo(n - 1);
            arr[n-1] = 1;
            algo(n - 1);
        }
    }
}
