package org.fourstack.interview.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringAnagramTest {

	@Test
	public void test_isAnagram_1() {
		Assertions.assertEquals(true, StringAnagram.isAnagram("restful", "fluster"));
	}

	@Test
	public void test_isAnagram_2() {
		Assertions.assertEquals(false, StringAnagram.isAnagram("restful", "roaster"));
	}

	@Test
	public void test_isAnagram_3() {
		Assertions.assertEquals(false, StringAnagram.isAnagram("earbuds", "roaster"));
	}

	@Test
	public void test_isAnagram_4() {
		Assertions.assertEquals(false, StringAnagram.isAnagram("Madam Curie", "Radium came"));
	}

	@Test
	public void test_isAnagram_forNullPointerException() {
		Assertions.assertThrows(NullPointerException.class, () -> StringAnagram.isAnagram(null, "Radium came"));
	}

}
