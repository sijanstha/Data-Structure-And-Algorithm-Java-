package com.sijan.algorithm.binarysearch;

/**
 * 
 * Search in an almost sorted array
 * 
 * Given an array which is sorted, but after sorting some elements are moved to
 * either of the adjacent positions, i.e., arr[i] may be present at arr[i+1] or
 * arr[i-1]. Write an efficient function to search an element in this array.
 * Basically the element arr[i] can only be swapped with either arr[i+1] or
 * arr[i-1].
 * 
 * For example consider the array {2, 3, 10, 4, 40}, 4 is moved to next position
 * and 10 is moved to previous position.
 * 
 * Example :
 * 
 * Input: arr[] = {10, 3, 40, 20, 50, 80, 70}, key = 40 Output: 2 Output is
 * index of 40 in given array
 * 
 * Input: arr[] = {10, 3, 40, 20, 50, 80, 70}, key = 90 Output: -1 -1 is
 * returned to indicate element is not present
 * 
 * @author sijan
 *
 */
public class PartiallySortedArray {

	public int findIndex(int arr[], int low, int high, int x) {

		if (high >= low) {
			int mid_index = low + (high - low) / 2;

			if (arr[mid_index] == x)
				return mid_index;

			if (mid_index > low && arr[mid_index - 1] == x)
				return mid_index - 1;

			if (mid_index < high && arr[mid_index] + 1 == x)
				return mid_index + 1;

			if (x > arr[mid_index])
				return findIndex(arr, mid_index + 2, high, x);

			return findIndex(arr, low, mid_index - 2, x);
		}

		return -1;
	}
}
