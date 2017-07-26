package com.codeforce.problemset.A478;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int c1 = scan.nextInt();
		int c2 = scan.nextInt();
		int c3 = scan.nextInt();
		int c4 = scan.nextInt();
		int c5 = scan.nextInt();
		if (c1 == 0 && c2 == 0 && c3 == 0 && c4 == 0 && c5 == 0) {
			System.out.println(-1);
			return;
		}

		int sum = c1 + c2 + c3 + c4 + c5;

		System.out.println(sum % 5 == 0 ? sum / 5 : -1);
	}
}