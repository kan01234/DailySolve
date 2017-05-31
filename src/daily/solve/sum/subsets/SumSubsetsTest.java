package daily.solve.sum.subsets;

import org.junit.Test;

public class SumSubsetsTest {

	private SumSubsets sumSubets = new SumSubsets();
	
	@Test
	public void test() {
		sumSubets.sumSubsets(new int[] { 1, 2, 3, 4, 5 }, 5);
		sumSubets.sumSubsets(new int[] { 1, 1, 2, 3, 4, 5 }, 5);
	}
	
}
