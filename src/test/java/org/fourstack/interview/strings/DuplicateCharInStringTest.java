package org.fourstack.interview.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuplicateCharInStringTest {
	
	@Test
	public void test_isStrHasDupChar_String() {
		Assertions.assertEquals(false, DuplicateCharInString.isStrHasDupChar("string"));
	}
	
	
	@Test
	public void test_isStrHasDupChar_Character() {
		Assertions.assertEquals(true, DuplicateCharInString.isStrHasDupChar("Character"));
	}
	
	@Test
	public void test_isStrHasDupChar_Null() {
		Assertions.assertThrows(RuntimeException.class, () -> DuplicateCharInString.isStrHasDupChar(null));
	}
	
	@Test
	public void test_isStrHasDupChar_EmptyStr() {
		Assertions.assertThrows(RuntimeException.class, () -> DuplicateCharInString.isStrHasDupChar(""));
	}

}
