package com.codeforce.problemset.A136;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[scan.nextInt() - 1] = i + 1;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}