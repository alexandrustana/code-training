package com.codeforce.problemset.A716;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int c = scan.nextInt();

		int wc = 0;
		int t = scan.nextInt();
		int nt;
		for (int i = 1; i < n; i++) {
			nt = scan.nextInt();
			if (nt - t <= c) {
				wc++;
			} else {
				wc = 0;
			}
			t = nt;
		}

		System.out.println(wc + 1);
		scan.close();
	}

}
