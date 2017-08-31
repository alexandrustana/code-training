package com.codeforce.problemset.A707;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		if (isColouredPicture(n, m, scan)) {
			System.out.println("#Color");
		} else {
			System.out.println("#Black&White");
		}
	}

	private static boolean isColouredPicture(int n, int m, Scanner scan) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				String pixel = scan.next();
				if ("M".equals(pixel) || "C".equals(pixel) || "Y".equals(pixel)) {
					return true;
				}
			}
		}
		return false;
	}

}
