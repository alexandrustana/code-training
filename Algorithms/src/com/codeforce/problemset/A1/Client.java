package com.codeforce.problemset.A1;

import java.util.Scanner;

public final class Client {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double N = scanner.nextDouble();
		double M = scanner.nextDouble();
		double A = scanner.nextDouble();

		System.out.println((long) (Math.ceil(N / A) * Math.ceil(M / A)));
	}
}