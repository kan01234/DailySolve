package com.dotterbear.codefight.sum.of.two;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwo {

	boolean sumOfTwo(int[] a, int[] b, int v) {
		Set<Integer> set = new HashSet<>();
		for (int i : a)
			set.add(v - i);
		for (int i : b)
			if (set.contains(i))
				return true;
		return false;
	}

}
