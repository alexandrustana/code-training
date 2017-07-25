package com.codeforce.problemset.B492;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int l = scan.nextInt();

		List<Integer> street = getStreetLamps(n, scan);
		sortStreetLamps(street);
		double minDist = getMinDistance(street, n, l);

		System.out.println(minDist);
	}

	private static double getMinDistance(List<Integer> street, int n, int l) {
		double maxDist = street.get(0);
		double temp = l - street.get(street.size() - 1);
		if (temp > maxDist) {
			maxDist = temp;
		}
		
		for (int i = 1; i < n; i++) {
			temp = (street.get(i) - street.get(i - 1)) / 2.0;
			if (temp > maxDist) {
				maxDist = temp;
			}
		}

		return maxDist;
	}

	private static void sortStreetLamps(List<Integer> street) {
		street.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
	}

	private static List<Integer> getStreetLamps(int n, Scanner scan) {
		List<Integer> street = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			street.add(scan.nextInt());
		}

		return street;
	}
}