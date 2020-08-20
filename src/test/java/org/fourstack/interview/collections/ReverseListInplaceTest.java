package org.fourstack.interview.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseListInplaceTest {

	@Test
	public void test_reverseList_ForArrayList() {
		List<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(10);
		intList.add(15);
		intList.add(20);
		intList.add(25);

		ReverseListInplace.reverseList(intList);

		Assertions.assertEquals(25, intList.get(0));
		Assertions.assertEquals(15, intList.get(2));
		Assertions.assertEquals(5, intList.get(intList.size() - 1));
	}

	@Test
	public void test_reverseList_ForStack() {
		List<String> strList = new Stack<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add("D");
		strList.add("E");
		strList.add("F");

		ReverseListInplace.reverseList(strList);

		Assertions.assertEquals("F", strList.get(0));
		Assertions.assertEquals("D", strList.get(2));
		Assertions.assertEquals("A", strList.get(strList.size() - 1));
	}

	@Test
	public void test_reverseList_ForNullPointerException() {
		Assertions.assertThrows(NullPointerException.class, () -> ReverseListInplace.reverseList(null));
	}
	
	@Test
	public void test_test_reverseList_ForEmptyList() {
		Assertions.assertThrows(RuntimeException.class, () -> ReverseListInplace.reverseList(new ArrayList<Integer>()));
	}

}
