package org.fourstack.interview.strings;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInString {
	
	public static boolean isStrHasDupChar(String str) {
		if (str == null || "".equalsIgnoreCase(str))
			throw new RuntimeException("String is null or Empty.");
		
		str = str.toLowerCase();
		
		Set<Character> charSet = new HashSet<>();
		
		for (char c : str.toCharArray()) {
			if (!charSet.add(c)) {
				return true;
			}
		}
		return false;
	}	
}
