package com.codeforce.problemset.A405;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		List<Integer> toyBox = initToyBox(n, scan);
		changeGravity(toyBox);
		
		toyBox.forEach(t -> System.out.print(t + " "));
	}

	private static void changeGravity(List<Integer> toyBox) {
		toyBox.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
	}

	private static List<Integer> initToyBox(int n, Scanner scan) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i < n ; i++) {
			list.add(scan.nextInt());
		}
		return list;
	}
}