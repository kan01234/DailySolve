package daily.solve.sum.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SumSubsets {

	Set<List<Integer>> set;

	List<List<Integer>> sumSubsets(int[] arr, int num) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(arr.length == 0) {
			result.add(new ArrayList<Integer>());
			return result;
		}
		set = new LinkedHashSet<List<Integer>>();
		Arrays.sort(arr);
		List<Integer> nums = new ArrayList<Integer>();
		for (int i : arr)
			nums.add(i);
		sumSubsets(nums, new ArrayList<Integer>(), num, true);
		Iterator<List<Integer>> iter = set.iterator();
		while(iter.hasNext()) {
			result.add(iter.next());
		}
		System.out.println(result);
		return result;
	}

	void sumSubsets(List<Integer> nums, List<Integer> last, int num, boolean isFirst) {
		List<Integer> tmp, list;
		int cur, diff;
		for(int i = 0; i < nums.size(); i++) {
			list = new ArrayList<Integer>(last);
			tmp = new ArrayList<Integer>();
			tmp.addAll(nums.subList(0, i));
			tmp.addAll(nums.subList(i + 1, nums.size()));
			cur = nums.get(i);
			diff = num - cur;
			list.add(cur);
			if (diff == 0) {
				Collections.sort(list);
				set.add(list);
			} else if(diff > 0)
				sumSubsets(tmp, list, diff, false);
		}
	}

}
