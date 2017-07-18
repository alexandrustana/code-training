package com.codeforce.problemset.A339;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String calculus = scan.next();
		printOrderedCalculus(calculus);
	}

	private static void printOrderedCalculus(String calculus) {
		calculus = calculus.replaceAll("\\+", "");
		int[] numbers = getCalculusNumbers(calculus);
		printCalculus(numbers);
	}

	private static void printCalculus(int[] numbers) {
		String result = "";
		for(int i = 0 ; i < numbers.length ; i++) {
			for(int j = 0 ; j < numbers[i]; j++) {
				result += (i + 1) + "+";
			}
		}
		System.out.println(result.substring(0, result.length() - 1));
	}

	private static int[] getCalculusNumbers(String calculus) {
		int[] freq = { 0, 0, 0 };
		for(int i = 0 ; i < calculus.length() ; i++) {
			freq[(calculus.charAt(i) - '0')  - 1]++;
		}
		return freq;
	}
}