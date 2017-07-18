package com.codeforce.problemset.A231;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int number = solvableProblems(n, scan);

		System.out.println(number);
	}

	private static int solvableProblems(int n, Scanner scan) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			int temp = scan.nextInt() + scan.nextInt() + scan.nextInt();
			if (temp >= 2) {
				result++;
			}
		}

		return result;
	}
}