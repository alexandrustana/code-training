package com.codeforce.problemset.A467;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int availableRooms = getNumberOfAvailableRooms(n, scan);

		System.out.println(availableRooms);
	}

	private static int getNumberOfAvailableRooms(int n, Scanner scan) {
		int count = 0;
		int p, q;
		for (int i = 0; i < n; i++) {
			p = scan.nextInt();
			q = scan.nextInt();
			if(q - p >= 2) {
				count++;
			}
		}
		return count;
	}
}