package com.codeforce.problemset.A500;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt() - 1;
		int t = scan.nextInt() - 1;
		int[] cells = new int[n];
		int i = 0;
		for (; i < n; i++) {
			cells[i] = scan.nextInt();
		}
		i = 0;
		while (i < t) {
			i += cells[i];
		}
		if(i == t) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}