package org.fourstack.interview.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AmstrongNumberTest {
	
	@Test
	public void test_isAmstrong_153() {
		Assertions.assertEquals(true, AmstrongNumber.isAmstrong(153));
	}
	
	@Test
	public void test_isAmstrong_1567() {
		Assertions.assertEquals(false, AmstrongNumber.isAmstrong(1567));
	}
	
	@Test
	public void test_isAmstrong_1634() {
		Assertions.assertEquals(true, AmstrongNumber.isAmstrong(1634));
	}
	
	@Test
	public void test_isAmstrong_forNegativeNum() {
		Assertions.assertThrows(RuntimeException.class, ()->AmstrongNumber.isAmstrong(-1));
	}
	
	

}
