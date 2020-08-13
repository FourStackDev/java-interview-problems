package org.fourstack.interview.arrays;

public class ReverseArray {

	public static void reverseArray(int[] arr) {
		if (arr == null || arr.length == 0)
			throw new RuntimeException("Array is null or Empty");
		
		int startIndex = 0;
		int endIndex = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {
			// a, b, => a= a+b, b = a-b, a = a-b
			arr[startIndex] = arr[startIndex] +arr[endIndex];
			arr[endIndex] = arr[startIndex] - arr[endIndex];
			arr[startIndex] = arr[startIndex] - arr[endIndex];
			
			startIndex++;
			endIndex--;
		}
	}
	
	public static void printArray(int[] arr) {
		for (int i : arr)
			System.out.print(i +" ");
		System.out.println();
	}
}
