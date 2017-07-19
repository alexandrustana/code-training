package com.codeforce.problemset.A160;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int total = 0;
		List<Integer> c = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			int coin = scan.nextInt();
			total += coin;
			int pos = 0;
			for (; pos < c.size(); pos++) {
				if (c.get(pos) < coin) {
					break;
				}
			}
			c.add(pos, coin);
		}
		int res = 0;
		int numberOfCoins = 0;
		for (int i = 0; i < c.size(); i++) {
			if (res <= total / 2) {
				res += c.get(i);
				numberOfCoins++;
			} else {
				break;
			}
		}

		System.out.println(numberOfCoins);
	}
}