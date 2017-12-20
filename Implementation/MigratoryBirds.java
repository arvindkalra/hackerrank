package Hackerrank;

import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] st = new int[6];
		int[] types = new int[n];
		for (int types_i = 0; types_i < n; types_i++) {
			int i = in.nextInt();
			types[types_i] = i;
			st[i]++;
		}

		int maxidx = 0;
		int maxval = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			if (st[i] > maxval) {
				maxidx = i;
				maxval = st[i];
			}
		}

		System.out.println(maxidx);
	}
}
