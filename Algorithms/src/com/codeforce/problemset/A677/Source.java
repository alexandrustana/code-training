package com.codeforce.problemset.A677;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int h = scan.nextInt();
		int w = 0;
		for (int i = 0; i < n; i++) {
			if (scan.nextInt() <= h) {
				w += 1;
			} else {
				w += 2;
			}
		}
		System.out.println(w);
	}
}