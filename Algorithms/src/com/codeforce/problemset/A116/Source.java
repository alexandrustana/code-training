package com.codeforce.problemset.A116;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int min = Integer.MIN_VALUE;
		int current = 0;

		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			current -= scan.nextInt();
			current += scan.nextInt();
			
			if(current > min) {
				min = current;
			}
		}
		
		System.out.println(min);
	}
}