package com.codeforce.problemset.B467;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		List<Integer> players = new ArrayList<>(m);
		for (int i = 0; i <= m; i++) {
			players.add(scan.nextInt());
		}

		int friends = countFriends(m, players, k);

		System.out.println(friends);
	}

	private static int countFriends(int m, List<Integer> players, int k) {
		int friends = 0;
		StringBuilder f = new StringBuilder(Integer.toBinaryString(players.get(players.size() - 1))).reverse();
		for (int i = 0; i < m; i++) {
			int diffs = compareArmies(f, new StringBuilder(Integer.toBinaryString(players.get(i))).reverse());
			if (diffs <= k) {
				friends++;
			}
		}

		return friends;
	}

	private static int compareArmies(StringBuilder f, StringBuilder p) {
		int d = 0;
		if (f.length() < p.length()) {
			while (f.length() != p.length()) {
				f.append('0');
			}
		} else if (f.length() > p.length()) {
			while (p.length() != f.length()) {
				p.append('0');
			}
		}

		for (int i = 0; i < f.length(); i++) {
			if (f.charAt(i) != p.charAt(i)) {
				d++;
			}
		}
		return d;
	}

}
