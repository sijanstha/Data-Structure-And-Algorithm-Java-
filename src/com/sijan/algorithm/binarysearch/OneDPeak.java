package com.sijan.algorithm.binarysearch;

public class OneDPeak {

	/**
	 * Given an arrayAwithnelements, find the indexiof the peak elementA[i]
	 * whereA[i]≥A[i−1] and A[i]≥A[i+ 1]. For elements on the boundaries of the
	 * array, the element only needs to be greater than or equal to its lone
	 * neighbor to be considered a peak. Or, sayA[−1] =A[n] =∞.
	 */

	public int findPeakIndex(int[] numbers, int low, int high, int n) {

		int mid_index = low + (high - low) / 2;
		System.out.println("mid_index" + mid_index);
		if (numbers[mid_index] >= numbers[mid_index - 1] && numbers[mid_index] >= numbers[mid_index + 1]) {
			return mid_index;
		} else if (numbers[mid_index - 1] > numbers[mid_index]) {
			return findPeakIndex(numbers, low, mid_index, n);
		} else {
			return findPeakIndex(numbers, mid_index + 1, high, n);
		}

	}

	public static void main(String[] args) {
		OneDPeak peak = new OneDPeak();
		int arr[] = { 1, 3, 3, 4, 100, 0 };
		int n = arr.length;
		System.out.print(peak.findPeakIndex(arr, 0, n - 1, n));
	}
}
