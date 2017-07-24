package com.codeforce.problemset.A510;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		printSnake(n, m);
	}

	private static void printSnake(int n, int m) {
		boolean turnLeft = true;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					System.out.print("#");
				}
				System.out.println();
			} else {
				if (turnLeft) {
					for (int j = 0; j < m - 1; j++) {
						System.out.print(".");
					}
					System.out.println("#");
				} else {
					System.out.print("#");
					for (int j = 1; j < m ; j++) {
						System.out.print(".");
					}
					System.out.println();
				}
				turnLeft = !turnLeft;
			}
		}
	}
}