package com.codeforce.problemset.A270;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			a = scan.nextInt();
			if (canBuild(a)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean canBuild(int a) {
		if (360 % (180 - a) == 0) {
			return true;
		}
		return false;
	}

}
