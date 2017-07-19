package com.codeforce.problemset.A122;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String result = (n + "").replaceAll("(4|7)*", "");
		if (result.length() == 0) {
			System.out.println("YES");
			return;
		} else {
			if (n % 4 == 0 || n % 7 == 0) {
				System.out.println("YES");
				return;
			} else {
				for (int i = 1; i <= n; i++) {
					if (n % i == 0) {
						if ((i + "").replaceAll("(4|7)*", "").length() == 0) {
							System.out.println("YES");
							return;
						}
					}
				}
			}
		}
		System.out.println("NO");
	}
}