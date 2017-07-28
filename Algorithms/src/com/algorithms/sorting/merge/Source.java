package com.algorithms.sorting.merge;

public class Source {

	public static void main(String[] args) {
		int[] a = { 5, 2, 4, 7, 1, 3, 2, 6 };
		merge(a, 0, a.length - 1);
		print(a);
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void merge(int[] a, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			merge(a, p, q);
			merge(a, q + 1, r);
			sort(a, p, q, r);
		}
	}

	public static void sort(int[] a, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = a[p + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = a[q + 1 + i];
		}

		int i = 0;
		int j = 0;
		int k = p;
		while (k < r) {
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			a[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			a[k] = R[j];
			j++;
			k++;
		}
	}

}
