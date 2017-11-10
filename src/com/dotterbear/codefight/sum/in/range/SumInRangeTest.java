package com.dotterbear.codefight.sum.in.range;

import org.junit.Assert;
import org.junit.Test;


public class SumInRangeTest {

	@Test
	public void test() {
		Assert.assertEquals(10, new SumInRange().sumInRange(new int[] { 3, 0, -2, 6, -3, 2 },
				new int[][] { new int[] { 0, 2 }, new int[] { 2, 5 }, new int[] { 0, 5 } }));
		Assert.assertEquals(999999007, new SumInRange().sumInRange(new int[] { -1000 },
				new int[][] { new int[] { 0, 0 } }));
		Assert.assertEquals(283, new SumInRange().sumInRange(new int[] { 34, 19, 21, 5, 1, 10, 26, 46, 33, 10 },
				new int[][] { new int[] { 3, 7 }, new int[] { 3, 4 }, new int[] { 3, 7 }, new int[] { 4, 5 }, new int[] { 0, 5 } }));
		Assert.assertEquals(999999540, new SumInRange().sumInRange(new int[] { -4, -18, -22, -14, -33, -47, -29, -35, -50, -19 },
				new int[][] { new int[] { 2, 9 }, new int[] { 5, 6 }, new int[] { 1, 2 }, new int[] { 2, 2 }, new int[] { 4, 5 } }));
		Assert.assertEquals(999996808, new SumInRange().sumInRange(new int[] { -77, 54, -59, -94, -13, -78, -81, -38, -26, 17, -73, -88, 90, -42, -63, -36, 37, 25, -22, 4, 25, -86, -44, 88, 2, -47, -29, 71, 54, -42 },
				new int[][] { new int[] { 2, 2 }, new int[] { 4, 7 }, new int[] { 2, 4 }, new int[] { 0, 2 }, new int[] { 3, 6 }, new int[] { 6, 6 }, new int[] { 3, 3 }, new int[] { 2, 7 }, new int[] { 3, 4 }, new int[] { 3, 3 }, new int[] { 2, 9 }, new int[] { 0, 1 }, new int[] { 4, 4 }, new int[] { 2, 3 }, new int[] { 0, 6 }, new int[] { 4, 4 }, new int[] { 2, 3 }, new int[] { 0, 5 }, new int[] { 2, 5 }, new int[] { 4, 5 } }));
	}

}
