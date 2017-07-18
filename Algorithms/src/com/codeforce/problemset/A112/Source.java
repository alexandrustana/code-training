package com.codeforce.problemset.A112;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = scan.nextLine().toLowerCase().compareTo(scan.nextLine().toLowerCase());
		System.out.println(result < 0 ? -1 : result > 0 ? 1 : 0);
	}
}