package com.dotterbear.codefight.sum.of.two;

import org.junit.Assert;
import org.junit.Test;


public class SumOfTwoTest {

	SumOfTwo sumOfTwo = new SumOfTwo();
	
	@Test
	public void test() {
		Assert.assertEquals(true, sumOfTwo.test(new int[] { 1, 2,3 }, new int[] { 10, 20, 30, 40 }, 42));
		Assert.assertEquals(false, sumOfTwo.test(new int[] { 1, 2,3 }, new int[] { 10, 20, 30, 40 }, 0));
	}

}
