package com.codeforce.problemset.A4;

import java.util.Scanner;

public final class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		System.out.println(W % 2 == 0 && W > 2 ? "YES" : "NO");
	}
}