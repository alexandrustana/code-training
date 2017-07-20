package com.codeforce.problemset.A110;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String luckyNumber = scan.next();
		if (luckyNumber.replaceAll("(7|4)*", luckyNumber).length() == 0) {
			System.out.println("YES");
			return;
		}

		for (int i = 0; i < 7; i++) {
			if (!luckyNumber.contains("7") && !luckyNumber.contains("4")) {
				if (i == 4) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				return;
			}
			luckyNumber = luckyNumber.replaceFirst("(7|4)", "");
		}
		if (luckyNumber.contains("7") || luckyNumber.contains("4")) {
			System.out.println("NO");
			return;
		}

		System.out.println("YES");
	}
}