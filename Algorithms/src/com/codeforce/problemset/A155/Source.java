package com.codeforce.problemset.A155;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int min, max, temp;
		min = max = scan.nextInt();
		int res = 0;
		for(int i = 1 ; i < n; i++) {
			temp = scan.nextInt();
			if(temp < min) {
				min = temp;
				res++;
			}
			if(temp > max) {
				max = temp;
				res++;
			}
		}
		System.out.println(res);
	}
}