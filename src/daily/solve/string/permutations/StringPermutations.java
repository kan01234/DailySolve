package daily.solve.string.permutations;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class StringPermutations {

	String[] stringPermutations(String s) {
		Set<String> set = new TreeSet<String>();
		stringPermutations(s, "", set);
		return new ArrayList<String>(set).toArray(new String[0]);
	}

	private void stringPermutations(String s, String current, Set<String> set) {
		int n = s.length();
		if (n == 0)
			set.add(current);
		else
			for (int i = 0; i < n; i++)
				stringPermutations(s.substring(0, i) + s.substring(i + 1, n), current + s.charAt(i), set);
	}

}
