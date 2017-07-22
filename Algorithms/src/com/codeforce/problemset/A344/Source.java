package com.codeforce.problemset.A344;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int r = countGroups(scan, n);
		
		System.out.println(r);
	}

	private static int countGroups(Scanner scan, int n) {
		int res = 0;
		String prev = scan.nextLine();
		String temp = "";
		for(int i = 0 ; i < n ; i++) {
			temp = scan.nextLine();
			if(prev.equals(temp)) {
				continue;
			}else {
				prev = temp;
				res++;
			}
		}
		return res;
	}

}
