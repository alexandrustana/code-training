package com.algorithms.subarrays;

public class MaxSubArrays {

	public static void main(String[] args) {
		int a[] = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
		int res = findMaximumSubarray(a,0, a.length - 1);
		System.out.println(res);
	}

	public static int maxCrossingSubarray(int[] a, int l, int m, int r) {
		int leftSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = m; i >= l; i--) {
			sum += a[i];
			if (sum > leftSum) {
				leftSum = sum;
			}
		}

		int rightSum = Integer.MIN_VALUE;
		sum = 0;
		for (int i = m + 1; i <= r; i++) {
			sum += a[i];
			if (sum > rightSum) {
				rightSum = sum;
			}
		}

		return leftSum + rightSum;
	}

	public static int findMaximumSubarray(int[] a, int l, int r) {
		if (l == r) {
			return a[l];
		} else {
			int m = (l + r) / 2;

			int left = findMaximumSubarray(a, l, m);
			int right = findMaximumSubarray(a, m + 1, r);
			int cross = maxCrossingSubarray(a, l, m, r);

			if (left >= cross && left >= right) {
				return left;
			} else if (right >= cross && right >= left) {
				return right;
			} else {
				return cross;
			}
		}
	}
}
