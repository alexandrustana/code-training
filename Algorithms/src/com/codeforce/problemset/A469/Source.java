package com.codeforce.problemset.A469;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int levels = scan.nextInt();
		int[] game = new int[levels];

		fillPlayer(scan, game);
		fillPlayer(scan, game);

		System.out.println(canPassAllLevels(game, levels) ? "I become the guy." : "Oh, my keyboard!");
	}

	private static boolean canPassAllLevels(int[] game, int levels) {
		int n = 0;
		for (int i = 0; i < levels; i++) {
			if (game[i] == 1) {
				n++;
			}
		}
		return n == game.length;
	}

	private static void fillPlayer(Scanner scan, int[] game) {
		int p = scan.nextInt();
		for (int i = 0; i < p; i++) {
			game[scan.nextInt() - 1] = 1;
		}
	}
}