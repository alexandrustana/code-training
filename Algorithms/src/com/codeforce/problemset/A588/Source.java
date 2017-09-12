package com.codeforce.problemset.A588;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int a = scan.nextInt();
		int p = scan.nextInt();

		int s = a * p;
		int minP = p;

		for (int i = 1; i < n; i++) {
			a = scan.nextInt();
			p = scan.nextInt();
			
			if (p < minP) {
				minP = p;
			}
			s += a * minP;
		}

		System.out.println(s);
	}

}
