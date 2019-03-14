package com.sijan.algorithm;

public class Algorithms {

	/*
	 ** Function to find the second largest number in array If input is
	 * {1,4,5,2,7,6,10} then expected output is 7
	 */
	public int getSecondMaxNumber(int[] arr) {

		/*
		 * max -> Maximum number in array smax -> Second Maximum number in array
		 */
		int max = 0;
		int smax = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				smax = max;
				max = arr[i];

			} else if (arr[i] > smax && arr[i] != max) {

				smax = arr[i];

			}

		}

		return smax;
	}

}
