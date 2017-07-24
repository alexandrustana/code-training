package com.codeforce.problemset.A59;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String word = scan.next();
		int lc = 0;
		int uc = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				uc++;
			} else {
				lc++;
			}
		}
		if (uc > lc) {
			System.out.println(word.toUpperCase());
		} else {
			System.out.println(word.toLowerCase());
		}
	}
}