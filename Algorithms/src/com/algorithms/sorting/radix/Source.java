package com.algorithms.sorting.radix;

public class Source {

	public static void main(String[] args) {
		int[] a = { 329, 457, 657, 839, 436, 720, 355 };
		a = radix(a);
		print(a);
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static int[] radix(int[] a) {
		for (int i = 1; i <= 3; i++) {
			a = sort(a, i);
		}
		return a;
	}

	public static int[] sort(int[] a, int d) {
		int k = findMax(a, d);
		int[] b = new int[a.length];
		int[] c = new int[k + 1];

		for (int i = 0; i < a.length; i++) {
			c[getDigit(a[i], d)]++;
		}
		for (int i = 1; i <= k; i++) {
			c[i] += c[i - 1];
		}
		for (int i = a.length - 1; i >= 0; i--) {
			b[c[getDigit(a[i], d)] - 1] = a[i];
			c[getDigit(a[i], d)]--;
		}
		return b;
	}

	private static int getDigit(int i, int d) {
		int temp = (int) (i % Math.pow(10, d));
		temp = (int) (temp / Math.pow(10, d - 1));
		return temp;
	}

	private static int findMax(int[] a, int d) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			int temp = (int) (a[i] % Math.pow(10, d));
			temp = (int) (temp / Math.pow(10, d - 1));
			if (temp > max) {
				max = temp;
			}
		}
		return max;
	}

}
