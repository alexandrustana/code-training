package com.codeforce.problemset.A486;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long res = computeF(n);

		System.out.println(res);
	}

	private static long computeF(long n) {
		if (n % 2 == 0) {
			return n / 2;
		}
		return (-1) * (long) Math.ceil(n / 2.0);
	}
}