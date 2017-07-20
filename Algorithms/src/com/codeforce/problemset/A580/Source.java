package com.codeforce.problemset.A580;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int r = getLongestStreak(scan);

		System.out.println(r);
	}

	private static int getLongestStreak(Scanner scan) {
		int r = 0;
		int max = 0;
		int n = scan.nextInt();
		int oldInt = scan.nextInt();
		int newInt = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++) {
			newInt = scan.nextInt();
			if (newInt >= oldInt) {
				r++;
			} else {
				if (r + 1 > max) {
					max = r + 1;
				}
				r = 0;
			}
			oldInt = newInt;
		}
		if (r + 1 > max) {
			max = r + 1;
		}
		return max;
	}

}