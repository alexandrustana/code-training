package com.codeforce.problemset.A282;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int value = compileCode(n, scan);
		
		System.out.println(value);
	}

	private static int compileCode(int n, Scanner scan) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			String temp = scan.next();
			if (temp.charAt(temp.length() - 2) == '+') {
				result++;
			} else {
				result--;
			}
		}
		return result;
	}
}