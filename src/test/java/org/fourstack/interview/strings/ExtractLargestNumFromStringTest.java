package org.fourstack.interview.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtractLargestNumFromStringTest {

	@Test
	public void test_getLargestNum() {
		Assertions.assertEquals(196,
				ExtractLargestNumFromString.getLargestNum("String96 is having largest196 number43."));
	}

	@Test
	public void test_getLargestNum_withoutNum() {
		Assertions.assertThrows(RuntimeException.class,
				() -> ExtractLargestNumFromString.getLargestNum("String is not having largestnumber"));
	}
	
	@Test
	public void test_getLargestNum_Null() {
		Assertions.assertThrows(RuntimeException.class,
				() -> ExtractLargestNumFromString.getLargestNum(null));
	}
	
	@Test
	public void test_getLargestNum_EmptyStr() {
		Assertions.assertThrows(RuntimeException.class,
				() -> ExtractLargestNumFromString.getLargestNum(""));
	}

}
