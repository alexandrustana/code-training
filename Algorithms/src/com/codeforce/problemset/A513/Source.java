package com.codeforce.problemset.A513;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		
		if(n1 > n2) {
			System.out.println("First");
		}else {
			System.out.println("Second");
		}
	}

}
