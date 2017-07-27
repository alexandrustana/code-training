package com.codeforce.problemset.C4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		Map<String, Integer> users = new HashMap<>();
		String temp = "";

		for (int i = 0; i < n; i++) {
			temp = scan.next();
			if (!users.keySet().contains(temp)) {
				users.put(temp, 1);
				System.out.println("OK");
			} else {
				int times = users.get(temp);
				users.put(temp, times + 1);
				System.out.println(temp + times);
			}
		}
	}

}
