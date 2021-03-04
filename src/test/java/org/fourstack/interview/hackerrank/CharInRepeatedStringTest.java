package org.fourstack.interview.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharInRepeatedStringTest {
	
	@Test
	public void test_repeatedCharCount_1() {
		String str = "abc";
		char ch = 'c';
		int range = 25;
		
		Assertions.assertEquals(8, CharInRepeatedString.repeatedCharCount(str, ch, range));
	}
	
	@Test
	public void test_repeatedCharCount_2() {
		String str = "aba";
		char ch = 'c';
		int range = 25;
		
		Assertions.assertEquals(0, CharInRepeatedString.repeatedCharCount(str, ch, range));
	}
	
	@Test
	public void test_repeatedCharCount_3() {
		String str = "aba";
		char ch = 'a';
		int range = 25;
		
		Assertions.assertEquals(17, CharInRepeatedString.repeatedCharCount(str, ch, range));
	}
	
	@Test
	public void test_repeatedCharCount_4() {
		String str = "a";
		char ch = 'a';
		int range = 25;
		
		Assertions.assertEquals(25, CharInRepeatedString.repeatedCharCount(str, ch, range));
	}
	
	@Test
	public void test_repeatedCharCount_5() {
		String str = "abcab";
		char ch = 'c';
		int range = 10;
		
		Assertions.assertEquals(2, CharInRepeatedString.repeatedCharCount(str, ch, range));
	}
	
	@Test
	public void test_repeatedCharCount_6() {
		String str = "abaaa";
		char ch = 'a';
		int range = 25;
		
		Assertions.assertEquals(20, CharInRepeatedString.repeatedCharCount(str, ch, range));
	}
	
	@Test
	public void test_repeatedCharCount_7() {
		String str = "abaaabadcsa";
		char ch = 'a';
		int range = 25;
		
		Assertions.assertEquals(14, CharInRepeatedString.repeatedCharCount(str, ch, range));
	}
	
	
	@Test
	public void test_repeatedCharCount_8() {
		String str = "aa";
		char ch = 'a';
		int range = 1000000;
		
		Assertions.assertEquals(1000000, CharInRepeatedString.repeatedCharCount(str, ch, range));
	}
	
	@Test
	public void test_repeatedCharCount_9() {
		String str = "abcdefghijkl";
		char ch = 'z';
		int range = 1000000;
		
		Assertions.assertEquals(0, CharInRepeatedString.repeatedCharCount(str, ch, range));
	}

}
