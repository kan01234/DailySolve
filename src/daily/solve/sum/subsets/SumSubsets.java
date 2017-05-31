package daily.solve.sum.subsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumSubsets {

	List<List<Integer>> result;
	List<Integer> done;

	List<List<Integer>> sumSubsets(int[] arr, int num) {
		result = new ArrayList<List<Integer>>();
		done = new ArrayList<Integer>();
		if (arr.length == 0) {
			result.add(new ArrayList<Integer>());
			return result;
		}
		// Arrays.sort(arr);
		List<Integer> nums = new ArrayList<Integer>();
		for (int i : arr)
			nums.add(i);
		sumSubsets(nums, new ArrayList<Integer>(), num, true);
//		result = result.stream().distinct().collect((Collectors.toList()));
		System.out.println(result);
		return result;
	}

	void sumSubsets(List<Integer> nums, List<Integer> used, int num, boolean isFirst) {
		List<Integer> tmp, list;
		int cur, diff;
		for (int i = 0; i < nums.size(); i++) {
			cur = nums.get(i);
			if (isFirst) {
				if(done.indexOf(cur) >= 0) continue;
				else done.add(cur);
			} else {
				if(nums.stream().min(Integer::compare).get() > cur) break;
			}
			list = new ArrayList<Integer>(used);
			diff = num - cur;
			list.add(cur);
			if (diff == 0) {
				Collections.sort(list);
				result.add(list);
			} else if (diff > 0)
				sumSubsets(removeFromList(nums, cur), list, diff, false);
		}
	}

	List<Integer> removeFromList(List<Integer> list, Integer i) {
		List<Integer> clone = new ArrayList<Integer>(list);
		clone.remove(i);
		return clone;
	}
}
