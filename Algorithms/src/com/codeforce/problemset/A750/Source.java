package com.codeforce.problemset.A750;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();

		int timeSpent = 0;
		int problemsSolved = 0;

		while (timeSpent + k <= 240) {
			problemsSolved++;
			timeSpent += problemsSolved * 5;
			if (problemsSolved == n && timeSpent + k <= 240) {
				System.out.println(problemsSolved);
				return;
			}
		}

		System.out.println(problemsSolved - 1);
	}
}