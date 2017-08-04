package com.algorithms.sorting.count;

import java.util.Arrays;

public class Source {

	public static void main(String[] args) {

		int[] a = { 2, 5, 3, 0, 2, 3, 0, 3 };

		a = sort(a, 5);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int[] sort(int[] a, int k) {
		int[] b = new int[a.length + 1];
		int[] c = new int[k + 1];

		for (int i = 0; i < a.length; i++) {
			c[a[i]]++;
		}
		
		for(int i = 1 ; i <= k ; i++) {
			c[i] += c[i - 1];
		}

		for (int i = a.length - 1; i >= 0; i--) {
			b[c[a[i]]] = a[i];
			c[a[i]]--;
		}
		return Arrays.copyOfRange(b, 1, b.length);
	}
}
