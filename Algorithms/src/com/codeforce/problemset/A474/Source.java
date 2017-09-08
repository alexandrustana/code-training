package com.codeforce.problemset.A474;

import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";

		String d = scan.next();
		String message = scan.next();
		String result = "";

		for(char c: message.toCharArray()) {
			result += "R".equals(d) ? keyboard.charAt(keyboard.indexOf(c) - 1) : keyboard.charAt(keyboard.indexOf(c) + 1); 
		}
		
		System.out.println(result);
	}
}