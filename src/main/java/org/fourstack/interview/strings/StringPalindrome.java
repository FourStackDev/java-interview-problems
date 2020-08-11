package org.fourstack.interview.strings;

public class StringPalindrome {

	/**
	 * To check given input String is a Palindrome or Not.
	 * <p>
	 * Below method checks by reversing the string and comparing both input and
	 * reversed String
	 * </p>
	 * 
	 * @param str Input String
	 * @return Boolean value(true if String is Palindrome else false)
	 */
	public boolean checkPalindrome(String str) {
		String reversedString = "";

		for (int i = str.length() - 1; i >= 0; i--)
			reversedString = reversedString + str.charAt(i);
		
		return str.equals(reversedString);
	}

	/**
	 * To check given input String is a Palindrome or Not.
	 * <p>
	 * Below method checks input string is palindrome or not by comparing the first
	 * half of characters with second half(reverse way). StringBuffer is used to
	 * compare the characters
	 * </p>
	 * 
	 * @param str
	 * @return
	 */
	public boolean isPalindrome(String str) {
		StringBuffer strBuffer = new StringBuffer(str);

		int startIndex = 0;
		int endIndex = str.length() - 1;
		boolean isNotEqual = true;

		for (int i = 0; i <= (str.length() / 2); i++) {
			if (strBuffer.charAt(startIndex) == strBuffer.charAt(endIndex)) {
				startIndex++;
				endIndex--;
			} else {
				isNotEqual = false;
				break;
			}
		}

		return isNotEqual;
	}
}
