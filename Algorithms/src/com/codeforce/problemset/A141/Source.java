package com.codeforce.problemset.A141;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] alphabet = new int[26];
		int[] letters = new int[26];

		String guestName = scan.next();
		String hostName = scan.next();
		String pile = scan.next();

		for (int i = 0; i < guestName.length(); i++) {
			alphabet[guestName.charAt(i) - 'A']++;
		}
		for (int i = 0; i < hostName.length(); i++) {
			alphabet[hostName.charAt(i) - 'A']++;
		}

		for (int i = 0; i < pile.length(); i++) {
			letters[pile.charAt(i) - 'A']++;
		}

		boolean same = true;
		for (int i = 0; i < 26; i++) {
			if (alphabet[i] != letters[i]) {
				same = false;
			}
		}
		System.out.println(same ? "YES" : "NO");
	}
}