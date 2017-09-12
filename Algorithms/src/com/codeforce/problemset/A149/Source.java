package com.codeforce.problemset.A149;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		if (k == 0) {
			System.out.println(0);
			return;
		}
		List<Integer> m = new ArrayList<>(12);

		for (int i = 0; i < 12; i++) {
			m.add(scan.nextInt());
		}

		m.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});

		int total = 0;
		int count = 0;
		for (int i = 0; i < 12; i++) {
			if (total <= k) {
				total += m.get(i);
				count++;
				if (total >= k) {
					break;
				}
			}
		}
		if (total < k) {
			System.out.println(-1);
		} else {
			System.out.println(count);
		}
	}

}
