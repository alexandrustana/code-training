package com.algorithms.sorting.insertion;

public class Source {

	public static void main(String[] args) {
		int[] a = { 5, 2, 4, 6, 1, 3 };
		sortInc(a);
		print(a);
		sortDec(a);
		print(a);
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void sortInc(int[] a) {
		for (int j = 1; j < a.length; j++) {
			int key = a[j];
			int i = j - 1;
			while (i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i = i - 1;
			}
			a[i + 1] = key;
		}
	}

	public static void sortDec(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] < key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
	}
}
