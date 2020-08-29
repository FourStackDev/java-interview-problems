package org.fourstack.interview.strings;

public class StringAnagram {
	
	public static boolean isAnagram(String str1, String str2) {
		if (str1 == null || str2 == null)
			throw new NullPointerException("Input Strings are null");
		
		
		if (str1.length() != str2.length())
			return false;
		
		StringBuffer strBuffer = new StringBuffer(str1);
		
		for (char c : str2.toCharArray()) {
			int index = strBuffer.indexOf(c+"");
			if (index >= 0) {
				strBuffer.deleteCharAt(index);
			} else {
				break;
			}
		}
		
		return strBuffer.length() == 0;
	}
}
