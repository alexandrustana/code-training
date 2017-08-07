package com.algorithms.statistics.randomizedSelection;

import java.util.Random;

public class Source {

	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 8, 9 };
		int s = randomizedSelection(a, 0, a.length - 1, 1);

		System.out.println(s);
	}

	private static int randomizedSelection(int[] a, int l, int r, int i) {
		if (l == r) {
			return a[l];
		}
		int p = randomizedPartition(a, l, r);
		int k = p - l + 1;
		if (i == k) {
			return a[p];
		} else if (i < k) {
			return randomizedSelection(a, l, p - 1, i);
		} else {
			return randomizedSelection(a, p + 1, r, i - k);
		}
	}

	private static int randomizedPartition(int[] a, int l, int r) {
		int i = new Random().nextInt(r - l) + l;
		swap(a, i, r);

		int key = a[r];
		i = l - 1;
		for (int j = r - 1; j >= l; j--) {
			if (a[j] < key) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i + 1, r);
		return i + 1;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
