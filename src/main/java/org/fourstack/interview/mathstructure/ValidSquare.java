package org.fourstack.interview.mathstructure;

import java.util.HashSet;
import java.util.Set;

public class ValidSquare {
	
	public boolean isValidSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
		Set<Integer> set = new HashSet<>();
		set.add(pointsDist(p1, p2));
		set.add(pointsDist(p1,  p3));
		set.add(pointsDist(p1,  p4));
		set.add(pointsDist(p2, p3));
		set.add(pointsDist(p2, p4));
		set.add(pointsDist(p3,  p4));
		
		return !set.contains(0) && set.size() == 2;
	}

	private int pointsDist(int[] a, int[] b) {
		return ((a[0] - b[0]) * (a[0] - b[0])) + ((a[1] - b[1]) * (a[1] - b[1]));
	}

}
