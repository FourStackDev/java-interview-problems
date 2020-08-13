package org.fourstack.interview.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringPalindromeTest {
	private StringPalindrome obj;
	
	@BeforeEach
	public void doInitialization() {
		obj = new StringPalindrome();
	}
	
	@Test
	public void test_isPalindrome_1() {
		obj = new StringPalindrome();
		assertEquals(Boolean.TRUE, obj.isPalindrome("madam"));
	}
	
	@Test
	public void test_isPalindrome_2() {
		obj = new StringPalindrome();
		assertEquals(Boolean.FALSE, obj.isPalindrome("apple"));
	}
	
	
	@Test
	public void test_isPalindrome_3() {
		obj = new StringPalindrome();
		assertEquals(Boolean.TRUE, obj.checkPalindrome("racecar"));
	}
	
	@Test
	public void test_isPalindrome_4() {
		obj = new StringPalindrome();
		assertEquals(Boolean.FALSE, obj.checkPalindrome("palindrome"));
	}

}
