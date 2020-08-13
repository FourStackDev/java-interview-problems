package org.fourstack.interview.strings;

import java.util.ArrayList;
import java.util.List;

public class ExtractLargestNumFromString {

	public static int getLargestNum(String str) {
		if (str == null || "".equalsIgnoreCase(str))
			throw new RuntimeException("String is null or Empty.");

		String matcher = "(.)*(\\d)(.)*";
		if (str.matches(matcher)) {
			// get all numbers from the string.
			List<Integer> numberList = getNumberList(str);

			// numberList.stream().max((num1, num2) -> num1.compareTo(num2)).get();
			return numberList.stream().max(Integer::compareTo).get();

		} else
			throw new RuntimeException("String doesn't have number in it.");
	}

	private static List<Integer> getNumberList(String str) {
		List<Integer> numList = new ArrayList<>();
		String[] numbers = str.split("[^(\\d)]");

		for (String number : numbers) {
			if (number != null && number.trim().length() > 0)
				numList.add(Integer.parseInt(number));
		}

		return numList;
	}
}
