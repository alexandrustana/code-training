package com.codeforce.problemset.A519;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int w = 0;
		int b = 0;

		for (int i = 0; i < 8; i++) {
			String line = scan.nextLine();
			for (int j = 0; j < 8; j++) {
				char c = line.charAt(j);
				if (Character.isUpperCase(c)) {
					w += getWeight(c);
				} else {
					b += getWeight(c);
				}
			}
		}

		System.out.println(w == b ? "Draw" : w > b ? "White" : "Black");
	}

	private static int getWeight(char c) {
		c = Character.toLowerCase(c);
		switch (c) {
		case 'q':
			return 9;
		case 'r':
			return 5;
		case 'b':
			return 3;
		case 'n':
			return 3;
		case 'p':
			return 1;
		}
		return 0;
	}

}
