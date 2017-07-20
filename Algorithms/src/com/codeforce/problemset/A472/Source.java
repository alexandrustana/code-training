package com.codeforce.problemset.A472;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		findCompositeNumbers(number);
	}

	private static void findCompositeNumbers(int number) {
		int a, b;
		if(number % 2 == 0) {
			a = 8;
			b = number - a;
		}else {
			a = 9;
			b = number - a;
		}
		
		System.out.println(a + " " + b);
	}
}