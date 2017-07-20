package com.codeforce.problemset.A208;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String song = scan.next();
		song = song.replaceAll("(WUB)+", " ");
		
		System.out.println(song.trim());
	}
}