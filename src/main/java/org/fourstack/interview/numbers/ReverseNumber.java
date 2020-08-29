package org.fourstack.interview.numbers;

public class ReverseNumber {

	public static int getReversedNumber(int num) {
		if (num < 0)
			throw new RuntimeException("Number should be positive");

		int reversedNum = 0;

		while (num > 0) {
			int remainder = num % 10;
			num = num / 10;

			reversedNum = reversedNum * 10 + remainder;
		}

		return reversedNum;
	}
}
