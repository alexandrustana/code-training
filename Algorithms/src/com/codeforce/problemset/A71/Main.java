package com.codeforce.problemset.A71;

import java.util.Scanner;

public final class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			printWord(scan.next());
		}
	}

	public static void printWord(String word) {
		if (word.length() > 10) {
			System.out.println(word.substring(0, 1) + (word.length() - 2) + word.substring(word.length() - 1));
		} else {
			System.out.println(word);
		}
	}
}
