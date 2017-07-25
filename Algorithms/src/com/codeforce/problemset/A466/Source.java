package com.codeforce.problemset.A466;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();

		int s = getMinimumCost(n, m, a, b);

		System.out.println(s);
	}

	private static int getMinimumCost(int n, int m, int a, int b) {
		int specialRideTickets = n/m;
		if(specialRideTickets == 0) {
			specialRideTickets = 1;
		}
		int remainingRideTickets = n - specialRideTickets * m;
		if(remainingRideTickets < 0) {
			remainingRideTickets = 0;
		}
		remainingRideTickets = Math.min(remainingRideTickets * a, b);
		
		return Math.min(n * a, specialRideTickets * b + remainingRideTickets);
	}
}