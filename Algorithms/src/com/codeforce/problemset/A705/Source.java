package com.codeforce.problemset.A705;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String love = "I love ";
		String hate = "I hate ";
		String emotions = "";

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				emotions += hate;
			} else {
				emotions += love;
			}
			if (i + 1 < n) {
				emotions += "that ";
			}
		}

		emotions += "it";

		System.out.println(emotions);
	}
}