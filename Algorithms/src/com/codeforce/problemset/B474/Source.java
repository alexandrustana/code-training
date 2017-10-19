package com.codeforce.problemset.B474;

import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] a = new int[n];
		int total = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			total += a[i];
		}

		int[] b = new int[total];

		int w1 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < a[i]; j++) {
				b[j + w1] = i + 1;
			}
			w1 += a[i];
		}
		int m = scan.nextInt();
		int q;
		for (int j = 0; j < m; j++) {
			q = scan.nextInt();
			System.out.println(b[q - 1]);
		}
	}

}
