package com.codeforce.problemset.A327;

import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int a;
		int count1 = 0;
		int extra0 = 0;
		int extra0max = -1;

		while (n != 0) {
			n--;
			a = scan.nextInt();
			if (a == 1) {
				count1++;
				if (extra0 > 0) {
					extra0 -= 1;
				}
			} else {
				extra0 += 1;
				if (extra0 > extra0max) {
					extra0max = extra0;
				}
			}
		}

		System.out.println(count1 + extra0max);
	}
}
