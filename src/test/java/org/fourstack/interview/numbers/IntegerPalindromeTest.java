package org.fourstack.interview.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerPalindromeTest {
	
	@Test
	public void test_isNumPalindrome_121() {
		Assertions.assertEquals(true, IntegerPalindrome.isNumPalindrome(121));
	}
	
	@Test
	public void test_isNumPalindrome_452() {
		Assertions.assertEquals(false, IntegerPalindrome.isNumPalindrome(452));
	}
	
	@Test
	public void test_isNumPalindrome_negativeNum() {
		Assertions.assertThrows(RuntimeException.class, () -> IntegerPalindrome.isNumPalindrome(-342));
	}

}
