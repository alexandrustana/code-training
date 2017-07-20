package com.codeforce.problemset.A337;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		List<Integer> f = new ArrayList<>();
		f.add(scan.nextInt());
		read: for (int j = 1; j < m; j++) {
			int temp = scan.nextInt();
			int i = 0;
			for (; i < f.size(); i++) {
				if (f.get(i) > temp) {
					f.add(i, temp);
					continue read;
				}
			}
			f.add(i, temp);
		}
		int best = Integer.MAX_VALUE;
		for (int i = 0; i <= m - n; i++) {
			if (best > f.get(i + n - 1) - f.get(i)) {
				best = f.get(i + n - 1) - f.get(i);
			}
		}
		if(best == Integer.MAX_VALUE) {
			best = 0;
		}

		System.out.println(best);
	}
}