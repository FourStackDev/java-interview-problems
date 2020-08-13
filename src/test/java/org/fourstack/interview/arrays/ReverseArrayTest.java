package org.fourstack.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

	@Test
	public void test_reverseArray1() {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3 };
		int[] expectedArray = { 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Before Reversing");
		ReverseArray.printArray(arr);

		ReverseArray.reverseArray(arr);

		System.out.println("After Reversing");
		ReverseArray.printArray(arr);

		Assertions.assertArrayEquals(expectedArray, arr);
	}
	
	@Test
	public void test_reverseArray_Null() {
		Assertions.assertThrows(RuntimeException.class, ()-> ReverseArray.reverseArray(null));
	}
	
	@Test
	public void test_reverseArray_EmptyArr() {
		int[] arr = {};
		Assertions.assertThrows(RuntimeException.class, () -> ReverseArray.reverseArray(arr));
	}
}
