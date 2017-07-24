package com.codeforce.problemset.B339;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long m = scan.nextLong();
		long time = 0;

		long oldTask = 1;
		long newTask = 0;
		for (long i = 1; i <= m; i++) {
			newTask = scan.nextLong();
			if (oldTask <= newTask) {
				time += newTask - oldTask;
			} else {
				time += n - oldTask + newTask;
			}
			oldTask = newTask;
		}
		System.out.println(time);
	}
}