package com.codeforce.problemset.A313;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int account = scan.nextInt();

		System.out.println(maxAccout(account));
	}

	private static int maxAccout(int account) {
		if (account >= 0) {
			return account;
		}
		StringBuilder number = new StringBuilder((account + "").replace("-", ""));
		int last = number.charAt(number.length() - 1) - '0';
		int beforeLast = number.charAt(number.length() - 2) - '0';

		if (last >= beforeLast) {
			number = number.deleteCharAt(number.length() - 1);
		} else {
			number = number.deleteCharAt(number.length() - 2);
		}

		return Integer.parseInt(number.toString()) * (-1);
	}
}