package com.codeforce.problemset.A144;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int min = Integer.MAX_VALUE;
		int minPos = 0;
		int max = Integer.MIN_VALUE;
		int maxPos = 0;

		for (int i = 1; i <= n; i++) {
			int temp = scan.nextInt();
			if (temp > max) {
				max = temp;
				maxPos = i;
			}
			if (temp <= min) {
				min = temp;
				minPos = i;
			}
		}

		int result = maxPos - 1 + n - minPos;
		System.out.println(maxPos > minPos ? result - 1 : result);
	}
}