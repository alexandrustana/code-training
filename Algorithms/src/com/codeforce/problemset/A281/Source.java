package com.codeforce.problemset.A281;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		
		System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
	}
}