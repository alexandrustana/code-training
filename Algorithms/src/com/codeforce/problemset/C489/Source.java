package com.codeforce.problemset.C489;

import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int m = scan.nextInt();
		int s = scan.nextInt();

		String min = solve1(m, s);
		String max = solve2(m, s);

		if (s == 0 && m == 1) {
			min = max = "0";
		} else if (!can(m, s) || (min.startsWith("0") && max.startsWith("0"))) {
			min = max = "-1";
		}
		System.out.print(min + " " + max);
	}

	public static boolean can(int m, int s) {
		return s >= 0 && s <= m * 9;
	}

	public static String solve1(int m, int s) {
		int sum = s;
		String minn = "";
		for (int i = 0; i < m; i++) {
			for (int d = 0; d < 10; d++) {
				if ((i > 0 || d > 0 || (m == 1 && d == 0)) && can(m - i - 1, sum - d)) {
					minn += d;
					sum -= d;
					break;
				}
			}
		}
		return minn;
	}

	public static String solve2(int m, int s) {
		int sum = s;
		String minn = "";
		for (int i = 0; i < m; i++) {
			for (int d = 9; d >= 0; d--) {
				if ((i > 0 || d > 0 || (m == 1 && d == 0)) && can(m - i - 1, sum - d)) {
					minn += d;
					sum -= d;
					break;
				}
			}
		}
		return minn;
	}
}