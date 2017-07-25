package com.codeforce.problemset.A455;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long[] freq = initSequence(n, scan);
		long score = getMaxPoints(freq, n);

		System.out.println(score);
	}

	private static long getMaxPoints(long[] freq, long n) {
		long[] dp = new long[100005];
		dp[0] = 0;
		dp[1] = freq[1];

		for (int i = 2; i <= 100000; i++)
			dp[i] = Math.max(dp[i - 1], (dp[i - 2] + (1 * i * freq[i])));

		return dp[100000];
	}

	private static long[] initSequence(long n, Scanner scan) {
		long[] freq = new long[100005];
		for (long i = 1; i <= n; i++) {
			freq[(int) scan.nextLong()]++;
		}

		return freq;
	}
}