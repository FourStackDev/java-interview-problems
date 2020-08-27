package org.fourstack.interview.numbers;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryFormatConvertionTest {

	@Test
	public void test_getBinaryStringAndDigitCount_for15() {
		@SuppressWarnings("rawtypes")
		List list = BinaryFormatConvertion.getBinaryStringAndDigitCount(15);

		Assertions.assertEquals("1111", list.get(0));
		Assertions.assertEquals(4, list.get(1));
		Assertions.assertEquals(0, list.get(2));
	}

	@Test
	public void test_getBinaryStringAndDigitCount_for128() {
		@SuppressWarnings("rawtypes")
		List list = BinaryFormatConvertion.getBinaryStringAndDigitCount(128);

		Assertions.assertEquals("10000000", list.get(0));
		Assertions.assertEquals(1, list.get(1));
		Assertions.assertEquals(7, list.get(2));
	}

	@Test
	public void test_getBinaryStringAndDigitCount_forNegative() {
		Assertions.assertThrows(RuntimeException.class,
				() -> BinaryFormatConvertion.getBinaryStringAndDigitCount(-123));
	}

}
