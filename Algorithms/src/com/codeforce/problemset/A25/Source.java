package com.codeforce.problemset.A25;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double cOdd = 0;
		double cEven = 0;
		int lastOdd = 0;
		int lastEven = 0;
		for (int i = 0; i < n; i++) {
			if (scan.nextInt() % 2 == 0) {
				cEven++;
				lastEven = i;
			} else {
				cOdd++;
				lastOdd = i;
			}
		}
		if (cEven == 1) {
			System.out.println(lastEven + 1);
		} else if (cOdd == 1) {
			System.out.println(lastOdd + 1);
		} else {
			System.out.println((int) Math.ceil((cEven + cOdd) / 2));
		}
	}
}