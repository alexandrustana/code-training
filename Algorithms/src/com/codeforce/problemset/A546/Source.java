package com.codeforce.problemset.A546;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt();
		int n = scan.nextInt();
		int w = scan.nextInt();

		int cost = computeCost(k, w);
		int amount = cost - n;
		System.out.println(amount <= 0 ? 0 : amount);
	}

	private static int computeCost(int k, int w) {
		int cost = 0;
		for (int i = 1; i <= w; i++) {
			cost += i * k;
		}
		return cost;
	}
}