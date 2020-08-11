package org.fourstack.interview.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringPalindromeTest {
	private static StringPalindrome obj;
	
	@BeforeAll
	public static void doInitialization() {
		obj = new StringPalindrome();
	}
	
	@Test
	public void test_isPalindrome_1() {
		assertEquals(Boolean.TRUE, obj.isPalindrome("madam"));
	}
	
	@Test
	public void test_isPalindrome_2() {
		assertEquals(Boolean.FALSE, obj.isPalindrome("apple"));
	}
	
	
	@Test
	public void test_isPalindrome_3() {
		assertEquals(Boolean.TRUE, obj.checkPalindrome("racecar"));
	}
	
	@Test
	public void test_isPalindrome_4() {
		assertEquals(Boolean.FALSE, obj.checkPalindrome("palindrome"));
	}

}
