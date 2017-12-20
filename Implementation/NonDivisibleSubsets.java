package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class NonDivisibleSubsets {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextLong();
		}
		Vals mx = new Vals();
		mx.maxlength = Integer.MIN_VALUE;
		boolean[][] st = make2D(arr, k);
		getFinal(arr, 0, st, mx, new ArrayList<>());
		System.out.println(mx.maxlength);
	}

	public static void getFinal(long[] arr, int si, boolean[][] st, Vals fin, ArrayList<Integer> idx) {
		if (si == arr.length) {
			if (isSafe(st, idx)) {
				int len = idx.size();
				if (len > fin.maxlength) {
					fin.maxlength = len;
				}
			}
			return;
		}

		// include
		idx.add(si);
		getFinal(arr, si + 1, st, fin, idx);
		idx.remove(idx.size() - 1);
		// exclude
		getFinal(arr, si + 1, st, fin, idx);
	}

	public static boolean isSafe(boolean[][] st, ArrayList<Integer> idx) {
		boolean rv = true;
		for (int i = 0; i < idx.size(); i++) {
			for (int j = i + 1; j < idx.size(); j++) {
				int a = idx.get(i);
				int b = idx.get(j);
				if (!st[a][b]) {
					return false;
				}
			}
		}

		return rv;
	}

	public static boolean[][] make2D(long[] arr, int k) {
		boolean[][] rv = new boolean[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				long fn = arr[i];
				long sn = arr[j];
				long sum = fn + sn;
				if (sum % k == 0) {
					rv[i][j] = false;
				} else {
					rv[i][j] = true;
				}
			}
		}

		return rv;
	}

	public static class Vals {
		int maxlength;

	}
}
