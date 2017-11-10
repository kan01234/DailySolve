package com.dotterbear.codefight.first.duplicate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstDuplicateTest {

	FirstDuplicate firstDuplicate = new FirstDuplicate();

	@Test
	public void test() {
		assertEquals(firstDuplicate.solve(new int[] { 2, 3, 3, 1, 5, 2 }), 3);
		assertEquals(firstDuplicate.solve(new int[] { 2, 4, 3, 5, 1 }), -1);
		assertEquals(firstDuplicate.solve(new int[] { 1 }), -1);
		assertEquals(firstDuplicate.solve(new int[] { 1, 1 }), 1);
		assertEquals(firstDuplicate.solve(new int[] { 1, 3, 3 }), 3);
	}

}
