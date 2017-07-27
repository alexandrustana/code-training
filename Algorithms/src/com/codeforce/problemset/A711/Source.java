package com.codeforce.problemset.A711;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String result = "";
		String temp = "";
		boolean haveSeats = false;

		for (int i = 0; i <= n; i++) {
			temp = scan.nextLine();
			if (!temp.replaceFirst("OO", "++").equals(temp) && !haveSeats) {
				haveSeats = true;
				result += temp.replaceFirst("OO", "++") + "\n";
			} else {
				result += temp + "\n";
			}
		}
		if (haveSeats) {
			System.out.print("YES");
			System.out.println(result);
		} else {
			System.out.print("NO");
		}
	}

}
