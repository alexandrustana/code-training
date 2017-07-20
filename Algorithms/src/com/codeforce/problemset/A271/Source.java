package com.codeforce.problemset.A271;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int y = scan.nextInt();
		y = distinctDigits(y);

		System.out.println(y);
	}

	private static int distinctDigits(int y) {
		y++;
		char[] t = (y + "").toCharArray();
		while (!(t[0] != t[1] && t[1] != t[2] && t[2] != t[3] && 
			   t[1] != t[0] && t[1] != t[2] && t[1] != t[3] && 
			   t[2] != t[0] && t[2] != t[1] && t[2] != t[3] && 
			   t[3] != t[0] && t[3] != t[1] && t[3] != t[2])) {
			y++;
			t = (y + "").toCharArray();
		}
		return y;
	}
}