package com.codeforce.problemset.A448;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		int a3 = scan.nextInt();

		int b1 = scan.nextInt();
		int b2 = scan.nextInt();
		int b3 = scan.nextInt();

		int n = scan.nextInt();

		int totalCups = a1 + a2 + a3;
		int totalMedals = b1 + b2 + b3;

		int cupShelves = totalCups / 5;
		cupShelves = cupShelves + (totalCups % 5 == 0 ? 0 : 1);
		int medalShelves = totalMedals / 10;
		medalShelves = medalShelves + (totalMedals % 10 == 0 ? 0 : 1);
		
		if (n >= cupShelves + medalShelves) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
