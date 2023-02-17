package com.runtimeturtle.algo.arrayAndString;

import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String[] s = new String[n];
			for(int i = 0; i < n; i++) {
				String token = sc.next();
				s[i] = token;
			}

			/**
			 * n = 4
			 * n = 5
			 * abcd -> dcba
			 * abcde -> edcba
			 */
			for(String x : s) {
				System.out.print(x);
			}
			System.out.println();
			for(int i = 0; i < n/2; i++) {
				String t = s[n-1-i];
				s[n-1-i] = s[i];
				s[i] = t;
			}
			
			for(String x : s) {
				System.out.print(x);
			}
		}
	}
}

// Other Solution
/*
public static void reverseArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
*/
