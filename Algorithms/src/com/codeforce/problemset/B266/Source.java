package com.codeforce.problemset.B266;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int t = scan.nextInt();
		char[] s = scan.next().toCharArray();
		char[] newS = s.clone();

		queqLoop: for (int j = 0; j < t; j++) {
			for (int i = 1; i < n; i++) {
				int pos = i;
				if (pos == 0) {
					continue queqLoop;
				}
				if (s[pos] == 'G' && s[pos - 1] == 'B') {
					char temp = s[pos];
					newS[pos] = newS[pos - 1];
					newS[pos - 1] = temp;
				}
				pos--;
			}
			s = newS.clone();
		}

		for (int i = 0; i < n; i++) {
			System.out.print(s[i]);
		}
	}
}