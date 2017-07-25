package com.codeforce.problemset.A492;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		long levels = getNumberOfLevels(n);

		System.out.println(levels);
	}

	private static long getNumberOfLevels(int n) {
		long cnt = 0;
		long h = 0;
		while (cnt <= n)
		{
			h++;
			cnt += (h*(h+1))/2;
		}

		return h - 1;
	}
}