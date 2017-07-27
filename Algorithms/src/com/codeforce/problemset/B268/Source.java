package com.codeforce.problemset.B268;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (n - i) * i;
		}
		sum += n;
		
		System.out.println(sum);
	}

}
