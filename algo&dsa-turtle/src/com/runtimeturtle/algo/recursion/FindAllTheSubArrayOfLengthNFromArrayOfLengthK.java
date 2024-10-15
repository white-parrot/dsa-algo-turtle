package com.runtimeturtle.algo.recursion;

import java.util.Arrays;

public class FindAllTheSubArrayOfLengthNFromArrayOfLengthK {

    static int[] arr = {0, 1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) {
        algo(2, 10);
    }

    public static void algo(int n, int k) {
        if(n < 1){
            System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, 2)));
        }else{
            for(int j = 0; j < k; j++){
                arr[n-1] = j;
                algo(n-1, k);
            }
        }
    }
}
