package com.codeforce.problemset.A427;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int sum = 0;
		int c = 0;
		for (int i = 0; i < n; i++) {
			int temp = scan.nextInt();
			sum += temp;
			if(sum < 0 && temp < 0) {
				c++;
				sum = 0;
			}
		}

		System.out.println(c);
	}

}
