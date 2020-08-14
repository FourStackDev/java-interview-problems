package org.fourstack.interview.numbers;

public class IntegerPalindrome {
	
	public static boolean isNumPalindrome(int num) {
		if (num < 0)
			throw new RuntimeException("Number is negative.Please pass positive number");
		
		int originalNum = num;
		int reversedNum = 0;
		
		while(originalNum > 0) {
			int remainder = originalNum % 10;
			originalNum = originalNum / 10;
			
			reversedNum = reversedNum * 10 +remainder;
		}
		
		return num == reversedNum;
	}
	
	public static void main(String[] args) {
		System.out.println(isNumPalindrome(-452));
	}

}
