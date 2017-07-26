package com.codeforce.problemset.A581;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int f = Math.min(a, b);
		int t = (Math.max(a, b) - Math.min(a, b)) / 2;
		
		System.out.println(f + " " + t);
	}
}