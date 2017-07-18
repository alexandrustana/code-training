package com.codeforce.problemset.A96;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(isDangerous(scan) ? "YES" : "NO");
	}

	private static boolean isDangerous(Scanner scan) {
		String players = scan.next();
		return players.contains("1111111") ? true : players.contains("0000000") ? true: false;
	}
}