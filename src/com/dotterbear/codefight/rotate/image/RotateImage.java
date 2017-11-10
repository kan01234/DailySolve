package com.dotterbear.codefight.rotate.image;

public class RotateImage {

	int[][] solve(int[][] matrix) {
		int tmp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[i].length; j++) {
				tmp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = tmp;
			}
		}
		for (int[] arr : matrix) {
			for (int i = 0; i < arr.length / 2; i++) {
				tmp = arr[i];
				arr[i] = arr[arr.length - i - 1];
				arr[arr.length - i - 1] = tmp;
			}
		}
		return matrix;
	}

}

