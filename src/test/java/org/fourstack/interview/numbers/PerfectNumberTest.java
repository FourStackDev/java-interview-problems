package org.fourstack.interview.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerfectNumberTest {

	@Test
	public void test_isPerfectNumber_6() {
		Assertions.assertEquals(Boolean.TRUE, PerfectNumber.isPerfectNumber(6));
	}

	@Test
	public void test_isPerfectNumber_28() {
		Assertions.assertEquals(Boolean.TRUE, PerfectNumber.isPerfectNumber(28));
	}

	@Test
	public void test_isPerfectNumber_496() {
		Assertions.assertEquals(Boolean.TRUE, PerfectNumber.isPerfectNumber(496));
	}

	@Test
	public void test_isPerfectNumber_443() {
		Assertions.assertEquals(Boolean.FALSE, PerfectNumber.isPerfectNumber(443));
	}

	@Test
	public void test_isPerfectNumber_4() {
		Assertions.assertEquals(Boolean.FALSE, PerfectNumber.isPerfectNumber(4));
	}

	@Test
	public void test_isPerfectNumber_forNegativeNumbers() {
		Assertions.assertThrows(RuntimeException.class, () -> PerfectNumber.isPerfectNumber(-6));
	}

}
