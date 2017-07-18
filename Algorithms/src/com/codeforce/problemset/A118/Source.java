package com.codeforce.problemset.A118;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String word = processWord(scan.next().toLowerCase());
		System.out.println(word);
	}

	public static String processWord(String word) {
		word = word.replaceAll("a|o|y|e|u|i", "");
		word = word.replaceAll("(.)", "\\.$1");
		return word;
	}
}