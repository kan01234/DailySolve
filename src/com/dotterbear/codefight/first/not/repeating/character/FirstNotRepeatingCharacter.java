package com.dotterbear.codefight.first.not.repeating.character;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNotRepeatingCharacter {

	char solve(String str) {
		int[] count = new int[26];
		Set<Integer> set = new LinkedHashSet<>();
		final int a = 97;
		for (char c : str.toCharArray()) {
			count[Integer.valueOf(c) % a]++;
			set.add(Integer.valueOf(c) % a);
		}
		for (int i : set) {
			if (count[i] == 1)
				return (char) (i + a);
		}
		return '_';
	}

}
