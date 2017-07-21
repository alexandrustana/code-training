package com.codeforce.problemset.A82;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] names = { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };

		int n = scan.nextInt();

		int r = 1;
		while (r * 5 < n) {
			n -= r * 5;
			r *= 2;
		}

		System.out.println(names[(n - 1) / r]);
	}
}