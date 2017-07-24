package com.codeforce.problemset.A230;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int s = scan.nextInt();
		int n = scan.nextInt();

		List<Dragon> dragons = initDragons(scan, n);

		sortDragons(dragons);

		System.out.println(canWin(dragons, s) ? "YES" : "NO");
	}

	private static boolean canWin(List<Dragon> dragons, int s) {
		for (Dragon dragon : dragons) {
			if (s > dragon.strength) {
				s += dragon.bonus;
			} else {
				return false;
			}
		}
		return true;
	}

	private static void sortDragons(List<Dragon> dragons) {
		dragons.sort(new Comparator<Dragon>() {

			@Override
			public int compare(Dragon o1, Dragon o2) {
				return Integer.compare(o1.strength, o2.strength);
			}
		});
	}

	private static List<Dragon> initDragons(Scanner scan, int n) {
		List<Dragon> dragons = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			dragons.add(new Dragon(scan.nextInt(), scan.nextInt()));
		}
		return dragons;
	}
}

class Dragon {
	int strength;
	int bonus;

	public Dragon(int strength, int bonus) {
		this.strength = strength;
		this.bonus = bonus;
	}
}