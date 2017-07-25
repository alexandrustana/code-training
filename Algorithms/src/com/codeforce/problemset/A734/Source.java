package com.codeforce.problemset.A734;

import java.util.Scanner;

public final class Source {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		scan.nextInt();
		String games = scan.next();
		int danikWonGames = games.replaceAll("A", "").length();
		int antonWonGames = games.replaceAll("D", "").length();
		
		System.out.println(antonWonGames < danikWonGames? "Danik" : antonWonGames == danikWonGames ? "Friendship" : "Anton");
	}
}