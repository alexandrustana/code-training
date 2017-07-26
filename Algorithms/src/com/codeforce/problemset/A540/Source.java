package com.codeforce.problemset.A540;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String lockState = scan.next();
		String openState = scan.next();

		int result = 0;

		for (int i = 0; i < n; i++) {
			int a = lockState.charAt(i) - '0';
			int b = openState.charAt(i) - '0';

			int fw = Math.abs(Math.max(a, b) - Math.min(a, b));
			int bw = Math.abs(Math.min(a, b) + 10 - Math.max(a, b));

			if (fw > bw) {
				result += bw;
			} else {
				result += fw;
			}
		}

		System.out.println(result);
	}
}