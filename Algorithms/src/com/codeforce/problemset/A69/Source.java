package com.codeforce.problemset.A69;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x, y, z;
		x = y = z = 0;
		for (int i = 0; i < n; i++) {
			x += scan.nextInt();
			y += scan.nextInt();
			z += scan.nextInt();
		}
		System.out.println(x == 0 && y == 0 && z == 0 ? "YES" : "NO");
	}
}