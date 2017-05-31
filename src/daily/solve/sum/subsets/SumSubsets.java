package daily.solve.sum.subsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumSubsets {

	List<List<Integer>> result;
	Map<String, List<Integer>> map;

	List<List<Integer>> sumSubsets(int[] arr, int num) {
		result = new ArrayList<List<Integer>>();
		map = new HashMap<String, List<Integer>>();
		if(arr.length == 0) {
			result.add(new ArrayList<Integer>());
			return result;
		}
		List<Integer> nums = new ArrayList<Integer>();
		for (int i : arr)
			nums.add(i);
		Collections.sort(nums);
		sumSubsets(nums, new ArrayList<Integer>(), num, true, "");
		result = result.stream().distinct().collect((Collectors.toList()));
		System.out.println(result);
		return result;
	}

	void sumSubsets(List<Integer> nums, List<Integer> last, int num, boolean isfirstLevel, String key) {
		List<Integer> tmp, list;
		int cur, diff;
		for(int i = 0; i < nums.size(); i++) {
			cur = nums.get(i);
			diff = num - cur;
//			list.add(cur);
			list = new ArrayList<Integer>(last);
			tmp = new ArrayList<Integer>();
			tmp.addAll(nums.subList(0, i));
			tmp.addAll(nums.subList(i + 1, nums.size()));
			if(isfirstLevel) key = cur + "";
			if (diff == 0) {
				System.out.println(list);
				Collections.sort(list);
				result.add(list);
			} else if(diff > 0)
				sumSubsets(tmp, list, diff, false, key);
		}
	}

}
