package com.codeforce.problemset.A379;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a;
		while (a / b != 0) {
			result += a / b;
			a = a / b + a % b;
		}

		System.out.println(result);
	}

}
