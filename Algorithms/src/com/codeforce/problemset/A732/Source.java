package com.codeforce.problemset.A732;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt();
		int r = scan.nextInt();
		int t = 1;

		while (!((k * t) % 10 == 0 || (k * t ) % 10 == r)) {
			t++;
		}

		System.out.println(t);
	}

}
