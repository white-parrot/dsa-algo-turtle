package com.runtimeturtle.algo.dynamicProgramming;

import java.io.IOException;

public class LongestCommonSequence {

	static String lcs = "";
	static String[] X, Y;
	static int m;
	static int n;

	public static void main(String[] args) throws IOException {

		X = "ABCBDAB".split("");
		Y = "BDCABA".split("");
		m = X.length - 1;
		n = Y.length - 1;
		/*
		 * Recursive Solution Good for Small String
		 * Output : BADB
		 */
		System.out.println(longestCommonSequesnceRecursiveBackward(X, Y, m, n));
		/*
		 * Recursive Solution Good for Small 
		 * String Output : BCBA
		 */
		System.out.println(longestCommonSequesnceRecursiveForward(X, Y, 0, 0));

		/* Dynamic Solution Good For Long Strings */
		X = "ACCGGTCGAGTGCGCGGAAGCCGGCCGAA".split("");
		Y = "GTCGTTCGGAATGCCGTTGCTCTGTAAA".split("");
		m = X.length;
		n = Y.length;
		/* Output : GTCGTCGGAAGCCGGCCGAA */
		System.out.println(longestCommonSequenceDynamic(X, Y));
	}

	public static String longestCommonSequesnceRecursiveBackward(String[] x, String[] y, int m, int n) {
		if (m < 0 || n < 0) {
			return "";
		}
		if (x[m].equals(y[n])) {
			lcs = x[m] + longestCommonSequesnceRecursiveBackward(x, y, m - 1, n - 1);
		} else {
			String c = longestCommonSequesnceRecursiveBackward(x, y, m - 1, n);
			String v = longestCommonSequesnceRecursiveBackward(x, y, m, n - 1);
			if (c.length() > v.length()) {
				return c;
			} else {
				return v;
			}
		}
		return lcs;
	}

	public static String longestCommonSequesnceRecursiveForward(String[] x, String[] y, int i, int j) {
		if (i > m || j > n) {
			return "";
		}
		if (x[i].equals(y[j])) {
			lcs = x[i] + longestCommonSequesnceRecursiveForward(x, y, i + 1, j + 1);
		} else {
			String c = longestCommonSequesnceRecursiveForward(x, y, i + 1, j);
			String v = longestCommonSequesnceRecursiveForward(x, y, i, j + 1);
			if (c.length() > v.length()) {
				return c;
			} else {
				return v;
			}
		}
		return lcs;
	}

	public static String longestCommonSequenceDynamic(String[] x, String[] y) {
		
		int[][] c = new int[m + 1][n + 1];

		for(int i = 0; i<=m; i++) {
			c[i][0] = 0;
		}
		for(int i = 0; i<=n; i++) {
			c[0][i] = 0;
		}
		
		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (x[i - 1].equals(y[j - 1])) {
					c[i][j] = c[i - 1][j - 1] + 1;
				} else if (c[i - 1][j] >= c[i][j - 1]) {
					c[i][j] = c[i - 1][j];
				} else {
					c[i][j] = c[i][j - 1];
				}
			}
		}
		/* Length of LCS */
		System.out.println(String.valueOf(c[m][n]));
		
		/* Longest Common Sequence */
		String lcs = "";
		int i = m, j = n;
		while(i != 0 & j != 0) {
			if(x[i-1].equals(y[j-1])) {
				lcs = x[i-1] + lcs;
				--i;--j;
			}else if(c[i-1][j]>=c[i][j-1]) {
				--i;
			}else {
				--j;
			}
		}
		return lcs;
	}

}
