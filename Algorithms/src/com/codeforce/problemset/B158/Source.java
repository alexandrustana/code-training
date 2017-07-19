package com.codeforce.problemset.B158;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] g = getGroups(scan, n);
		int res = g[3];
		g[3] = 0;
		res = getTaxis(g, res);

		System.out.println(res);
	}

	private static int getTaxis(int[] g, int res) {
		int temp = g[0] - g[2];

		if (temp > 0) {
			res += g[2];
			g[2] = 0;
			g[0] = Math.abs(temp);
		} else if (temp == 0) {
			res += g[0];
			g[2] = g[0] = 0;
		} else {
			res += g[0];
			g[0] = 0;
			g[2] = Math.abs(temp);
		}
		res += g[2];
		g[2] = 0;

		temp = g[1] / 2;
		res += temp;
		g[1] = g[1] % 2;

		temp = g[1] - 1;
		if (temp >= 0) {
			if (g[0] - 2 >= 0) {
				res += g[1];
				g[1] = 0;
				g[0] -= 2;
			} else if (g[0] - 1 >= 0) {
				res += g[1];
				g[1] = 0;
				g[0] -= 1;
			} else {
				res += g[1];
				g[1] = 0;
			}
		}
		res += g[0] / 4;
		if (g[0] % 4 != 0) {
			res++;
		}
		return res;
	}

	private static int[] getGroups(Scanner scan, int n) {
		int[] g = { 0, 0, 0, 0 };
		for (int i = 0; i < n; i++) {
			g[scan.nextInt() - 1]++;
		}
		return g;
	}
}