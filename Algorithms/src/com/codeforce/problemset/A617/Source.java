package com.codeforce.problemset.A617;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		int res = 0;
		for(int i = 5 ; i > 0 ; i--) {
			res += x / i;
			x %= i;
		}

		System.out.println(res);
	}
}