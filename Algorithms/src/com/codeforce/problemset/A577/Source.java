package com.codeforce.problemset.A577;

import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextInt();
		long x = scan.nextInt();

		int res = 0;
		for (long i = 1; i <= n; i++) {
			if (isDivisor(i, x) && lessThan(x/i, n)) {
				res++;
			}
		}

		System.out.println(res);
		scan.close();
	}

	public static boolean isDivisor(long n, long x) {
		return x % n == 0;
	}
	
	public static boolean lessThan(long n, long x) {
		return n <= x;
	}
}