package daily.solve.sum.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumSubsets {

	List<List<Integer>> result;
	List<String> done;

	List<List<Integer>> sumSubsets(int[] arr, int num) {
		result = new ArrayList<List<Integer>>();
		done = new ArrayList<String>();
		if (arr.length == 0) {
			result.add(new ArrayList<Integer>());
			return result;
		}
		List<Integer> nums = new ArrayList<Integer>();
		for (int i : arr)
			nums.add(i);
		for(int i = 0; i < nums.size(); i++) {
			sumSubsets(nums.subList(i + 1, nums.size()), new ArrayList<Integer>(Arrays.asList(nums.get(i))), num - nums.get(i));
		}
		System.out.println(result);
		return result;
	}

	void sumSubsets(List<Integer> nums, List<Integer> used, int num) {
		System.out.println("used: " + used);
		System.out.println("nums: " + nums);
		System.out.println("num:" + num);
		System.out.println("done: " + done);
		System.out.println("result: " + result);
		System.out.println("--------------------------");
		Collections.sort(used);
		if(done.indexOf(used.toString()) >= 0) {
			System.out.println(used.toString() + " skipp");
			System.out.println("--------------------------");
			return;
		}
		done.add(used.toString());
		if (num == 0) {
			result.add(used);
			return;
		} else if (num < 0)
			return;
		List<Integer> list;
		int cur;
		for (int i = 0; i < nums.size(); i++) {
			cur = nums.get(i);
			list = new ArrayList<Integer>(used);
			list.add(cur);
			sumSubsets(removeFromList(nums, i), list, num - cur);
		}
	}

	List<Integer> removeFromList(List<Integer> list, int i) {
		List<Integer> clone = new ArrayList<Integer>(list);
		clone.remove(i);
		return clone;
	}

}
