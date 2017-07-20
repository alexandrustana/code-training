package com.codeforce.problemset.A479;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int res = findMax(a, b, c);
		
		System.out.println(res);
	}

	private static int findMax(int a, int b, int c) {
		int res = 0;
		int temp;
		
		temp = a + b + c;
		res = max(res, temp);
		temp = a * (b + c);
		res = max(res, temp);
		temp = a * b + c;
		res = max(res, temp);
		temp = (a + b) * c;
		res = max(res, temp);
		temp = a + b * c;
		res = max(res, temp);
		temp = a * b * c;
		res = max(res, temp);

		return res;
	}

	private static int max(int res, int temp) {
		if (temp > res) {
			res = temp;
		}
		return res;
	}
}