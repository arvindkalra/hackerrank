package Hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int minbnm = Math.min(n, m);
		int val;
		if (minbnm == m) {
			val = n;
		} else {
			val = m;
		}
		int[] a = new int[n];
		int maxa = Integer.MIN_VALUE;
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
			maxa = Math.max(maxa, a[a_i]);
		}
		int[] b = new int[m];
		int maxb = Integer.MIN_VALUE;
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
			maxb = Math.max(b[b_i], maxb);
		}
		int count = 0;
		for (int i = maxa, j = 2; i < maxb; j++) {
			int k = 0;
			int num = 0;
			for (k = 0; k < minbnm; k++) {
				if (i % a[k] == 0 && b[k] % i == 0) {
					num++;
				}
			}
			while (k < a.length) {
				if (i % a[k] == 0) {
					num++;
				}
				k++;
			}
			while (k < b.length) {
				if (b[k] % i == 0) {
					num++;
				}
				k++;
			}
			if (num == val) {
				count++;
			}

			i = maxa * j;
		}

		System.out.println(count);

	}
}
