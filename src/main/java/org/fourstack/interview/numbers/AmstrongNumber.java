package org.fourstack.interview.numbers;

/**
 * An Armstrong number of three digits is an integer such that the sum of the
 * cubes of its digits is equal to the number itself. For example, 371, 153,
 * 370, 407
 * 
 * A positive integer of n digits is called an Armstrong number of order n
 * (order is number of digits) if.
 * 
 * abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....
 * 
 * @author Manjunath HM
 *
 */
public class AmstrongNumber {

	public static boolean isAmstrong(int num) {
		if (num < 0)
			throw new RuntimeException("Number is negative");

		int digits = getNumOfDigits(num);
		int sum = 0;
		int originalNum = num;

		while (num > 0) {
			int rem = num % 10;
			num /= 10;

			sum = sum + (int) Math.pow(rem, digits);
		}
		return originalNum == sum;
	}

	private static int getNumOfDigits(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}

		return count;
	}
}
