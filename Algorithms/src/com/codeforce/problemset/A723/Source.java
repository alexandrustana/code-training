package com.codeforce.problemset.A723;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x1 = scan.nextInt();
		int x2 = scan.nextInt();
		int x3 = scan.nextInt();

		int min = Math.min(x1, Math.min(x2, x3));
		int max = Math.max(x1, Math.max(x2, x3));

		int mid = max - min;

		System.out.println(mid);
	}

}