package com.codeforce.problemset.B489;

import java.util.Arrays;
import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] b = getStudents(scan);
		int[] g = getStudents(scan);

		int p = countPairs(b, g);

		System.out.println(p);

	}

	private static int countPairs(int[] b, int[] g) {
		int p = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < g.length; j++) {
				if (Math.abs(b[i] - g[j]) <= 1) {
					g[j] = 1000;
					p++;
					break;
				}
			}
		}
		return p;
	}

	private static int[] getStudents(Scanner scan) {
		int nS = scan.nextInt();
		int[] s = new int[nS];

		for (int i = 0; i < nS; i++) {
			s[i] = scan.nextInt();
		}

		Arrays.sort(s);
		return s;
	}
}
