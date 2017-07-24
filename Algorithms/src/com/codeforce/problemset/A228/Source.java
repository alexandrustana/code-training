package com.codeforce.problemset.A228;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Set<Integer> colors = new HashSet<>();

		colors.addAll(Arrays.asList(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()));
		
		System.out.println(4 - colors.size());
	}
}