package com.algorithms.sorting.heap;

import java.util.Arrays;

public class Source {
	public static void main(String[] args) {
		int[] a = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		a = sort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int[] sort(int[] a) {
		buildMaxHeap(a);
		int[] res = new int[a.length];
		for (int i = a.length; i >= 1; i--) {
			res[i - 1] = a[0];
			a = Arrays.copyOfRange(a, 1, a.length);
			maxHeapify(a, 0);
		}

		return res;
	}

	public static void buildMaxHeap(int[] a) {
		for (int i = a.length / 2; i >= 0; i--) {
			maxHeapify(a, i);
		}
	}

	private static void maxHeapify(int[] a, int i) {
		int l = left(i);
		int r = right(i);

		int max = Integer.MIN_VALUE;

		if (l < a.length && a[l] > a[i]) {
			max = l;
		} else {
			max = i;
		}

		if (r < a.length && a[r] > a[max]) {
			max = r;
		}

		if (max != i) {
			int temp = a[i];
			a[i] = a[max];
			a[max] = temp;

			maxHeapify(a, max);
		}
	}

	private static int left(int i) {
		return i * 2 + 1;
	}

	private static int right(int i) {
		return i * 2 + 2;
	}
}
