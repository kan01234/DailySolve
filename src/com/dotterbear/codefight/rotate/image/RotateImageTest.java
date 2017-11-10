package com.dotterbear.codefight.rotate.image;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RotateImageTest {

	RotateImage rotateImage = new RotateImage();

	@Test
	public void test() {
		assertEquals(rotateImage.solve(new int[][] { new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }, new int[] { 7, 8, 9 } }), new int[][] { new int[] { 7, 4, 1 }, new int[] { 8, 5, 2 }, new int[] { 9, 6, 3 } });
	}

}
