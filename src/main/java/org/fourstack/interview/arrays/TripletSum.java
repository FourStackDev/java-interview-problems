package org.fourstack.interview.arrays;

public class TripletSum {

	public static int getTripletSum(int[] arr) {
		if (arr == null)
			throw new RuntimeException("Array is null.Please pass valid array");

		if (arr.length == 0)
			throw new RuntimeException("Array is empty.Please pass valid array");

		if (arr.length == 1)
			return arr[0];

		if (arr.length == 2)
			return arr[0] + arr[1];

		int num1 = Integer.MIN_VALUE;
		int num2 = Integer.MIN_VALUE;
		int num3 = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > num1) {
				num3 = num2;
				num2 = num1;
				num1 = arr[i];
			} else if (arr[i] > num2) {
				num3 = num2;
				num2 = arr[i];
			} else if (arr[i] > num3) {
				num3 = arr[i];
			}
		}

		return num1 + num2 + num3;
	}
}
