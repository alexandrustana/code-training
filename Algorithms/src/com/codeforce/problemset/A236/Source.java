package com.codeforce.problemset.A236;

import java.util.Scanner;
import java.util.stream.IntStream;

public final class Source {
     public static void main(String[] args){
         Scanner scan=new Scanner(System.in);
         String username = scan.next();
         int[] freq = new int[26];
         for(int i=0;i<username.length();i++){
             freq[username.charAt(i) - 'a'] =  1;
         }
         int gender = IntStream.of(freq).sum();
         System.out.println(gender %2==0? "CHAT WITH HER!": "IGNORE HIM!");
     }
}