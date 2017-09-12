package com.codeforce.problemset.A476;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int lower_bound = (n + 1) / 2;
		int ans = (lower_bound + m - 1) / m * m;
		if (ans > n)
			ans = -1;

		System.out.println(ans);
	}

}
