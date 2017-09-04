package com.codeforce.problemset.A703;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			int m = scan.nextInt();
			int c = scan.nextInt();

			if(m > c) {
				sum++;
			}else if(m < c){
				sum--;
			}
		}

		if(sum > 0) {
			System.out.println("Mishka");
		} else if(sum < 0) {
			System.out.println("Chris");
		} else {
			System.out.println("Friendship is magic!^^");
		}
	}
}