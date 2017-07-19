package com.codeforce.problemset.A131;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String word = scan.next();
		int upperCaseChars = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				upperCaseChars++;
			}
		}
		
		if (upperCaseChars == word.length()) {
			word = word.toLowerCase();
		}  else if(upperCaseChars == word.length() - 1 && Character.isLowerCase(word.charAt(0))) {
			word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		}
		System.out.println(word);
	}
}