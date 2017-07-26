package com.codeforce.problemset.A432;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int members = 0;
		int participations;
		for (int i = 0; i < n; i++) {
			participations = scan.nextInt();
			if (participations + k <= 5) {
				members++;
			}
		}

		System.out.println(members / 3);
	}

}
