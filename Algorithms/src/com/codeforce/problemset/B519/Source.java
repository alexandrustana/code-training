package com.codeforce.problemset.B519;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Map<Integer, Integer> f = new HashMap<>();
		Map<Integer, Integer> s = new HashMap<>();
		Map<Integer, Integer> t = new HashMap<>();

		for (int i = 0; i < n; i++) {
			Integer temp = scan.nextInt();
			if (f.get(temp) == null) {
				f.put(temp, 1);
				continue;
			}
			f.put(temp, f.get(temp) + 1);
		}
		for (int i = 1; i < n; i++) {
			Integer temp = scan.nextInt();
			if (s.get(temp) == null) {
				s.put(temp, 1);
				continue;
			}
			s.put(temp, s.get(temp) + 1);
		}
		for (int i = 2; i < n; i++) {
			Integer temp = scan.nextInt();
			if (t.get(temp) == null) {
				t.put(temp, 1);
				continue;
			}
			t.put(temp, t.get(temp) + 1);
		}

		for (Integer key : s.keySet()) {
			f.put(key, f.get(key) - (s.get(key) != null ? s.get(key) : 0));
		}
		for (Integer key : t.keySet()) {
			s.put(key, s.get(key) - (t.get(key) != null ? t.get(key) : 0));
		}
		
		f.forEach((k, v) -> {
			if (v != 0)
				System.out.println(k);
		});
		
		s.forEach((k, v) -> {
			if (v != 0)
				System.out.println(k);
		});
	}

}
