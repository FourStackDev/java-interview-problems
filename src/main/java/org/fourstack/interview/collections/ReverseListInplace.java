package org.fourstack.interview.collections;

import java.util.List;

public class ReverseListInplace {
	
	public static <T> void reverseList(List<T> list) {
		if (list == null)
			throw new NullPointerException("List is Null");
		
		if (list.size() == 0)
			throw new RuntimeException("List is Empty");
		
		
		int startIndex = 0;
		int endIndex = list.size() - 1;
		
		for (int i = 0; i< list.size() /2; i++) {
			T startElement = list.get(startIndex);
			T endElement = list.get(endIndex);
			
			list.set(startIndex, endElement);
			list.set(endIndex, startElement);
			
			startIndex++;
			endIndex--;
		}		
	}
}
