package com.codeforce.problemset.B230;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] p = sieveOfEratosthenes((int) Math.pow(10, 6));

		long n = scan.nextLong();
		for (long i = 0; i < n; i++) {
			long x = scan.nextLong();
			long root = (long) Math.sqrt(x);
			if (p[(int) root] && (root * root) == x && x != 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static boolean[] sieveOfEratosthenes(int n) {
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i < n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == true) {
				for (int i = p * 2; i <= n; i += p)
					prime[i] = false;
			}
		}

		return prime;
	}
}
