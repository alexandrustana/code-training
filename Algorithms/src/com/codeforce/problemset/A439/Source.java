package com.codeforce.problemset.A439;

import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int d = scan.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += scan.nextInt();
		}
		if (sum + (n - 1) * 10 > d) {
			System.out.println(-1);
			return;
		}
		int r = d - sum;

		System.out.println(r / 5);

	}
}
