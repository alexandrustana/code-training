package com.codeforce.problemset.A556;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.nextLong();
		String s = scan.next();
		int ones = s.replaceAll("0", "").length();
		int zeros = s.replaceAll("1", "").length();
		int r = ones + zeros - 2 * Math.min(ones, zeros);
		System.out.println(r);
	}

}
