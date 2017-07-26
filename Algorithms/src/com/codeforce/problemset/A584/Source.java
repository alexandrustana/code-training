package com.codeforce.problemset.A584;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int t = scan.nextInt();
		String res = "";

		if (t == 10) {
			if (n == 1) {
				res = "-1";
			} else {
				for (int i = 0; i < n - 1; i++) {
					res += "1";
				}
				res += "0";
			}
		} else {
			for(int i = 0 ; i < n ; i++) {
				res += t;
			}
		}
		System.out.println(res);
	}
}