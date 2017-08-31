package com.codeforce.problemset.A509;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] a = new int[n][n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			a[i][0] = 1;
		}
		for (int i = 0; i < n; i++) {
			a[0][i] = 1;
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				a[i][j] = a[i - 1][j] + a[i][j - 1];
			}
		}

		System.out.println(a[n - 1][n - 1]);
	}

}
