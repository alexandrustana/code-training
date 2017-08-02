package com.algorithms.sorting.quick;

import java.util.Random;

public class Source {

	public static void main(String[] args) {
		// int[] a = { 2, 8, 7, 1, 3, 5, 6, 4 };
		//
		// sort(a, 0, a.length - 1);

		// for (int i = 0; i < a.length; i++) {
		// System.out.println(a[i]);
		// }
		
		Random random = new Random();
		int SIZE = 100000000;
		int[] a = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			a[i] = random.nextInt();
		}

		long start = System.currentTimeMillis();
		sort(a, 0, SIZE - 1);
		System.out.println(System.currentTimeMillis() - start);

	}

	public static int randomizedPartition(int[] a, int l, int r) {
		Random random = new Random();
		int i = random.nextInt(r - l) + l;
		swap(i, r, a);
		return partition(a, l, r);
	}

	public static void sort(int[] a, int l, int r) {
		if (l < r) {
			int p = partition(a, l, r);
			sort(a, l, p - 1);
			sort(a, p + 1, r);
		}
	}

	private static int partition(int[] a, int l, int r) {
		int x = a[r];
		int i = l - 1;
		for (int j = l; j < r; j++) {
			if (a[j] <= x) {
				i++;
				swap(i, j, a);
			}
		}
		swap(i + 1, r, a);
		return i + 1;
	}

	private static void swap(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
