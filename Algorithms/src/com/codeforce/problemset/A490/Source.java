package com.codeforce.problemset.A490;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Map<Integer, List<Integer>> pupils = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			int key = scan.nextInt();
			List<Integer> value = pupils.get(key);
			if (value == null) {
				value = new ArrayList<>();
			}
			value.add(i);
			pupils.put(key, value);
		}

		int total = 0;

		List<Integer> t1 = pupils.get(1);
		List<Integer> t2 = pupils.get(2);
		List<Integer> t3 = pupils.get(3);

		if (t1 != null && t2 != null && t3 != null) {
			int tt1 = t1.size();
			int tt2 = t2.size();
			int tt3 = t3.size();

			while (tt1 != 0 && tt2 != 0 && tt3 != 0) {
				total++;

				tt1--;
				tt2--;
				tt3--;
			}
		}

		System.out.println(total);

		for (int i = 0; i < total; i++) {
			System.out.println(t1.get(0) + " " + t2.get(0) + " " + t3.get(0) + " ");

			t1.remove(0);
			t2.remove(0);
			t3.remove(0);
		}

		scan.close();
	}
}