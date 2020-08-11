package org.fourstack.interview.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TripletSumTest {

	@Test
	public void test_getTripletSum() {
		int[] arr = { 7, 14, 6, 85, 54, 42 };
		assertEquals(181, TripletSum.getTripletSum(arr));
	}

	@Test
	public void test_getTripletSum_ForTwoValues() {
		int[] arr = { 7, 14 };
		assertEquals(21, TripletSum.getTripletSum(arr));
	}

	@Test
	public void test_getTripletSum_ForOneValue() {
		int[] arr = { 7 };
		assertEquals(7, TripletSum.getTripletSum(arr));
	}

	@Test
	public void test_getTripletSum_ForNullArray() {
		Assertions.assertThrows(RuntimeException.class, () -> TripletSum.getTripletSum(null));
	}
	
	@Test
	public void test_getTripletSum_ForEmptyArray() {
		int[] arr = {};
		Assertions.assertThrows(RuntimeException.class, () -> TripletSum.getTripletSum(arr));
	}

}
