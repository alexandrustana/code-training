package com.codeforce.problemset.B158;

import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] s = getCustomers(n, scan);
		int c = getTaxis(s);

		System.out.println(c);
	}

	private static int getTaxis(int[] s) {
		int t = s[3];
		int s1, s2, s3;
		s1 = s[0] - s[2];
		if (s1 <= 0) {
			s2 = 0;
		}
		s2 = s[0] <= 0 ? 0 : Math.abs(s[0] - s[2]);

		for (int i = 0; i < s.length; i++) {
		}

		return t;
	}

	private static int[] getCustomers(int n, Scanner scan) {
		int[] s = { 0, 0, 0, 0 };
		for (int i = 0; i < n; i++) {
			s[scan.nextInt() - 1]++;
		}
		return s;
	}
}
