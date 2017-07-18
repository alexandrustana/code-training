package com.codeforce.problemset.A158;

import java.util.Scanner;

public final class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		int result = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			int score = scan.nextInt();
			if (score <= 0) {
				continue;
			}
			if(i + 1 == K) {
				max = score;
			}
			if(score >= max) {
				result++;
			}
		}
		System.out.println(result);
	}
}