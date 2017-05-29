package daily.solve.sum.in.range;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class SumInRange {

	private Map<String, Integer> map = new HashMap<String, Integer>();

	int sumInRange(int[] nums, int[][] queries) {
		int result = 0, total = 0;
		for (int i = 0; i < nums.length; i++)
			total += nums[i];
		map.put(buildKey(0, nums.length - 1), total);
		for (int i = 0; i < queries.length; i++) {
			result += sumInRange(nums, total, queries[i][0], queries[i][1]);
		}
		return BigInteger.valueOf(result).mod(BigInteger.valueOf(1000000007)).intValue();
	}

	private String buildKey(int k, int y) {
		return k + "," + y;
	}

	private int sumInRange(int[] nums, int total, int from, int to) {
		String key = buildKey(from, to);
		if (map.containsKey(key))
			return map.get(key);
		int result = 0;
		while (from <= to)
			result += nums[from++];
		map.put(key, result);
		return result;
	}

}
