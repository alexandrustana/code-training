package com.codeforce.problemset.A381;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long k = scan.nextLong();

		if (k <= (n + 1) / 2) {
			System.out.println(2 * k - 1);
		} else {
			System.out.println((k - (n + 1) / 2) * 2);
		}
	}

}
