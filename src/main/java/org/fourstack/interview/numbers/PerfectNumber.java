package org.fourstack.interview.numbers;

public class PerfectNumber {

	public static boolean isPerfectNumber(int num) {
		if (num < 1)
			throw new RuntimeException("Unable to do calculation. Please pass numbers greater than 1");
		
		int sum = 0;

		int i = 1;
		while (i < num) {
			int remainder = num % i;
			if (remainder == 0)
				sum += i;

			i++;
		}
		return num == sum;
	}
}
