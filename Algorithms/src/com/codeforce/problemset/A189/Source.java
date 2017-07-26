package com.codeforce.problemset.A189;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] dp = new int[4004][101];
		int[] a = new int[3];
		int n;
		n = scan.nextInt();

		for (int i = 0; i < 3; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < n + 1; i++) {
			int maxx = Integer.MIN_VALUE;
			for (int j = 0; j < 3; j++) {
				if (a[j] < i) {
					if (dp[i - a[j]][3] != 0)
						dp[i][j] = 1 + dp[i - a[j]][3];
				} else if (a[j] == i) {
					dp[i][j] = 1 + dp[i - a[j]][3];
				}
				maxx = Math.max(dp[i][j], maxx);
			}
			dp[i][3] = maxx;
		}

		System.out.println(dp[n][3]);
	}
}