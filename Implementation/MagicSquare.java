package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquare {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		int min = Integer.MAX_VALUE;
		min = Math.min(getDiff(arr, matrix1), min);
		min = Math.min(getDiff(arr, matrix2), min);
		min = Math.min(getDiff(arr, matrix3), min);
		min = Math.min(getDiff(arr, matrix4), min);
		min = Math.min(getDiff(arr, matrix5), min);
		min = Math.min(getDiff(arr, matrix6), min);
		min = Math.min(getDiff(arr, matrix7), min);
		min = Math.min(getDiff(arr, matrix8), min);

		System.out.println(min);

	}

	public static int getDiff(int[][] main, int[][] matrix) {
		int rv = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				rv += Math.abs(main[i][j] - matrix[i][j]);
			}
		}

		return rv;
	}

	public static int[][] matrix1 = { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } };
	public static int[][] matrix2 = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
	public static int[][] matrix3 = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
	public static int[][] matrix4 = { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } };
	public static int[][] matrix5 = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
	public static int[][] matrix6 = { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } };
	public static int[][] matrix7 = { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } };
	public static int[][] matrix8 = { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } };

}
