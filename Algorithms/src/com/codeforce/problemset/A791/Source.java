package com.codeforce.problemset.A791;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		int y = 0;
		while (a <= b) {
			a *= 3;
			b *= 2;
			y++;
		}

		System.out.println(y);
		scan.close();
	}

}
