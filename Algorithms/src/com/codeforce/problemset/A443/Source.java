package com.codeforce.problemset.A443;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String string = scan.nextLine();
		string = string.replaceAll("\\{", "");
		string = string.replaceAll("\\}", "");
		string = string.replaceAll(",", "");
		string = string.replaceAll(" ", "");

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		System.out.println(charSet.size());
	}
}