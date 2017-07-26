package com.codeforce.problemset.B200;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double n = scan.nextInt();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += scan.nextInt();
		}

		System.out.println(sum / n);
	}
}