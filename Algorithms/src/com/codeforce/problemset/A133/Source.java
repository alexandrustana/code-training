package com.codeforce.problemset.A133;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String instruction = scan.next();
		String output = "NO";
		if(instruction.contains("H") || instruction.contains("Q") || instruction.contains("9")) {
			output = "YES";
		}
		
		System.out.println(output);
	}
}