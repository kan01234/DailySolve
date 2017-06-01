package daily.solve.sum.subsets;

import java.util.ArrayList;
import java.util.List;

public class SumSubsets {

	List<List<Integer>> result;
	List<String> done;

	List<List<Integer>> sumSubsets(int[] arr, int num) {
		result = new ArrayList<List<Integer>>();
		done = new ArrayList<String>();
		long start = System.currentTimeMillis();
		if (arr.length == 0) {
			result.add(new ArrayList<Integer>());
			return result;
		}
		List<Integer> nums = new ArrayList<Integer>();
		for (int i : arr)
			nums.add(i);
		sumSubsets(nums, new ArrayList<Integer>(), num);
		System.out.println(result);
		long dur = System.currentTimeMillis() - start;
		System.out.println("time: " + dur);
		return result;
	}

	void sumSubsets(List<Integer> nums, List<Integer> used, int num) {
//		System.out.println("used: " + used);
//		System.out.println("nums: " + nums);
//		System.out.println("num:" + num);
//		System.out.println("done: " + done);
//		System.out.println("result: " + result);
//		System.out.println("--------------------------");
		if(done.indexOf(used.toString()) >= 0) {
//			System.out.println(used.toString() + " skipp");
//			System.out.println("--------------------------");
			return;
		}
		done.add(used.toString());
		if (num == 0) {
			result.add(used);
			return;
		} else if(!nums.isEmpty() && nums.get(0) > num)
			return;
		List<Integer> list;
		int cur;
		for (int i = 0; i < nums.size(); i++) {
			cur = nums.get(i);
			list = new ArrayList<Integer>(used);
			list.add(cur);
			sumSubsets(nums.subList(i + 1, nums.size()), list, num - cur);
		}
	}

}
