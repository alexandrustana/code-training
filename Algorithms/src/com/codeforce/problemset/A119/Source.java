package com.codeforce.problemset.A119;

import java.math.BigInteger;
import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = scan.nextInt();

		boolean simonTurn = true;
		while (n >= 0) {
			if (simonTurn) {
				n -= getGCD(a, n);
			} else {
				n -= getGCD(b, n);
			}
			simonTurn = !simonTurn;
		}

		if (!simonTurn) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	private static int getGCD(int a, int b) {
		BigInteger b1 = BigInteger.valueOf(a);
		BigInteger b2 = BigInteger.valueOf(b);
		BigInteger gcd = b1.gcd(b2);
		return gcd.intValue();
	}
}