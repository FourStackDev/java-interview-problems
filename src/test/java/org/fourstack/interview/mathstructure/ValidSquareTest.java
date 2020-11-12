package org.fourstack.interview.mathstructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidSquareTest {
	private ValidSquare square;

	@BeforeEach
	public void initialize() {
		square = new ValidSquare();
	}

	@Test
	public void test_isValidSquare1() {
		int[] p1 = { 0, 0 }, p2 = { 0, 1 }, p3 = { 1, 1 }, p4 = { 1, 0 };
		Assertions.assertEquals(true, square.isValidSquare(p1, p2, p3, p4));
	}
	
	@Test
	public void test_isValidSquare2() {
		int[] p1 = { 0, 0 }, p2 = { 0, 2 }, p3 = { 2, 2 }, p4 = { 2, 0 };
		Assertions.assertEquals(true, square.isValidSquare(p1, p2, p3, p4));
	}
	
	@Test
	public void test_isValidSquare3() {
		int[] p1 = { 0, 0 }, p2 = { 0, 2 }, p3 = { 1, 2 }, p4 = { 2, 0 };
		Assertions.assertEquals(false, square.isValidSquare(p1, p2, p3, p4));
	}
	
	@Test
	public void test_isValidSquare4() {
		int[] p1 = { 0, 0 }, p2 = { 2, 1 }, p3 = { 1, 1 }, p4 = { 1, 0 };
		Assertions.assertEquals(false, square.isValidSquare(p1, p2, p3, p4));
	}
}
