package com.codeforce.problemset.A599;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(min(scan.nextLong(), scan.nextLong(), scan.nextLong()));
	}

	private static long min(long hfs, long hss, long fsss) {
		long min = Long.MAX_VALUE;
		long p1 = hfs + fsss + hss;
		long p2 = hfs + hfs + hss + hss;
		long p3 = hfs + fsss + fsss + hfs;
		long p4 = hss + fsss + fsss + hss;
		if (p1 <= p2 && p1 <= p3 && p1 <= p4) {
			min = p1;
		} else if (p2 <= p1 && p2 <= p3 && p2 <= p4) {
			min = p2;
		} else if (p3 <= p1 && p3 <= p2 && p3 <= p4) {
			min = p3;
		} else {
			min = p4;
		}
		return min;
	}

}
