package com.algorithms.sorting.bucket;

import java.util.Comparator;
import java.util.LinkedList;

public class Source {

	public static void main(String[] args) {
		float a[] = { 0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f };
		sort(a);
		print(a);
	}

	private static void print(float[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void sort(float[] a) {
		LinkedList<Float>[] b = new LinkedList[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = new LinkedList<>();
		}
		for (int i = 0; i < a.length; i++) {
			b[(int) (a.length * a[i])].push(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			b[i].sort(new Comparator<Float>() {

				@Override
				public int compare(Float o1, Float o2) {
					return o1.compareTo(o2);
				}
			});
		}

		int i = 0;
		for (int j = 0; j < b.length; j++) {
			for (int k = 0; k < b[j].size(); k++) {
				a[i++] = b[j].get(k);
			}
		}
	}
}
