package com.codeforce.problemset.A58;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String hello = scan.next().toLowerCase();
		hello = hello.replaceAll("[^h]*h[^e]*e[^l]*l[^l]*l[^o]*o.*", "");
		
		System.out.println(hello.length() == 0 ? "YES" : "NO");
	}
}