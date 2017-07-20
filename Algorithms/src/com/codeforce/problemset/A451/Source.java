package com.codeforce.problemset.A451;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		System.out.println(Math.min(n, m) % 2 == 1? "Akshat" : "Malvika");
	}
}