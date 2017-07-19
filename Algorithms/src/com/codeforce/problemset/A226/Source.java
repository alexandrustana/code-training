package com.codeforce.problemset.A226;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		char[] rocks = scan.next().toCharArray();
		int res = 0;
		for (int i = 1; i < rocks.length; i++) {
			if(rocks[i - 1] == rocks[i]) {
				res++;
			}
		}
		System.out.println(res);
	}
}