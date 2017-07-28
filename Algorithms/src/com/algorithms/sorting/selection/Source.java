package com.algorithms.sorting.selection;

public class Source {
	public static void main(String[] args) {
		int[] a = { 5, 2, 4, 6, 1, 3 };
		sort(a);
		print(a);
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void sort(int[] a) {
		int minIndex = 0;
		for (int i = 0; i < a.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}
}
