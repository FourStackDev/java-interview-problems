package org.fourstack.interview.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseNumberTest {

	@Test
	public void test_getReversedNumber1234() {
		Assertions.assertEquals(4321, ReverseNumber.getReversedNumber(1234));
	}

	@Test
	public void test_getReversedNumber6532() {
		Assertions.assertEquals(6532, ReverseNumber.getReversedNumber(2356));
	}

	@Test
	public void test_getReversedNumberForNegativeNumbers() {
		Assertions.assertThrows(RuntimeException.class, () -> ReverseNumber.getReversedNumber(-12));
	}

}
