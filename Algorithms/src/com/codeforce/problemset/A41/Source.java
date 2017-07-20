package com.codeforce.problemset.A41;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StringBuilder s = new StringBuilder(scan.next());
		String t =scan.next();
		
		System.out.println(s.reverse().toString().equals(t) ? "YES" : "NO");
	}
}