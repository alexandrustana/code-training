package com.codeforce.problemset.A520;

import java.util.Scanner;
import java.util.stream.IntStream;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String word = scan.next().toLowerCase();
		int[] alphabet = new int[26];

		for (int i = 0; i < n; i++) {
			alphabet[word.charAt(i) - 'a'] = 1;
		}
		System.out.println(IntStream.of(alphabet).sum() == 26 ? "YES" : "NO");
	}
}