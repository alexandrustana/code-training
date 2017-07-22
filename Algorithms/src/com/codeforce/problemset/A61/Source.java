package com.codeforce.problemset.A61;

import java.util.Scanner;
public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String number1 = scan.next();
		String number2 = scan.next();
		
		String result = "";
		for(int i = 0 ; i < number1.length() ; i++) {
			result +=( (getByte(number1.charAt(i)) ^ getByte(number2.charAt(i))));
		}
		
		System.out.println(result);
	}
	
	public static byte getByte(char code) {
		return (byte) (code - '0');
	}

}
