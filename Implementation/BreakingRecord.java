package Hackerrank;

import java.util.Scanner;

public class BreakingRecord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		int min = score[0];
		int max = min;
		int countmin = 0;
		int countmax = 0;
		for (int i = 1; i < n; i++) {
			int num = score[i];
			if (num > max) {
				countmax++;
				max = num;
			}
			if (num < min) {
				countmin++;
				min = num;
			}
		}

		System.out.println(countmax + " " + countmin);
	}
}
