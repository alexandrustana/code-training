package com.algorithms.dynamic.cutRod;

public class Source {

	public static void main(String[] args) {
		int[] p = { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };
		System.out.println(solve(p, 4));
	}

	public static int solve(int[] p, int n) {
		int[] r = new int[n + 1];
		r[0] = 0;
		for (int j = 1; j <= n; j++) {
			int q = Integer.MIN_VALUE;
			for (int i = 0; i < j; i++) {
				q = Math.max(q, p[i] + r[j - i - 1]);
			}
			r[j] = q;
		}

		return r[n];
	}

	public static int solveRec(int[] p, int n) {
		if (n == 0) {
			return 0;
		}
		int q = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			q = Math.max(q, p[i - 1] + solveRec(p, n - i));
		}
		return q;
	}
}
