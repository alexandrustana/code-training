package com.codeforce.problemset.C4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		List<String> users = new ArrayList<>();
		String temp = "";
		
		for(int i = 0 ; i < n ; i++) {
			temp = scan.next();
			if(!users.contains(temp)) {
				users.add(temp);
				System.out.println("OK");
			}else {
				System.out.println(temp + "1");
			}
		}
	}

}
