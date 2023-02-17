package com.runtimeturtle.algo.dynamicProgramming;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class KnapSackZeroOne {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int w = Integer.parseInt(bufferedReader.readLine().trim());
		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> values = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());
		List<Integer> weights = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());
		solution(w, n, values, weights);
	}

	public static void solution(int w, int n, List<Integer> values, List<Integer> weights) {

		/* define the knapsack */
		int[][] knapsack = new int[n + 1][w + 1];

		for (int i = 0; i <= n; i++) {
			for(int j = 0; j < w; j++) {
				if(i == 0 || j == 0) {
					knapsack[i][j] = 0;
				}else if(j < weights.get(j)) {
					
				}
				
					
			}
		}

	}
}
