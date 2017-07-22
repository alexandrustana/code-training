package com.codeforce.problemset.A460;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		System.out.println(n +  (n  - 1
				) / (m - 1));
	}

}
