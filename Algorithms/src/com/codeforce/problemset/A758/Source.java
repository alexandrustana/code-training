package com.codeforce.problemset.A758;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(scan.nextInt());
		}
		a.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		
		int cost = 0;
		int max = a.get(0);
		for(int i = 1 ; i < n ; i++) {
			cost += max - a.get(i);
		}
		
		System.out.println(cost);
	}

}
