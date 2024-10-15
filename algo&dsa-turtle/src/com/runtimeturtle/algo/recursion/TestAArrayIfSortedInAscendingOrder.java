package com.runtimeturtle.algo.recursion;

public class TestAArrayIfSortedInAscendingOrder {
    public static void main(String[] args) {
        int[] arrOne = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arrTwo = { 1, 2, 3, 4, 8, 6, 7, 5, 9, 10 };
        System.out.println(algo(arrOne, 9));
        System.out.println(algo(arrTwo, 9));
    }

    public static boolean algo(int[] arr, int n){
        if(n == 0){
            return true;
        }
        if(arr[n] > arr[n-1]){
            return algo(arr, n-1);
        }else{
            return false;
        }
    }
}
