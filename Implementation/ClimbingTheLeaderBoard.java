package Hackerrank;

import java.util.Scanner;

public class ClimbingTheLeaderBoard {

	public static void main(String[] args) {

		formArr();

	}

	public static int findRank(Pair[] arr, long score) {
		long mins = arr[0].score;
		long maxs = arr[arr.length - 1].score;
		if (score == mins) {
			return 1;
		} else if (score == maxs) {
			return arr[arr.length - 1].rank;
		} else if (score > maxs) {
			return arr[arr.length - 1].rank + 1;
		} else {
			int i = 0;
			int j = arr.length - 1;
			while (true) {
				int mididx = (i + j) / 2;
				long midval = arr[mididx].score;
				if (i == j) {
					if (score > arr[i].score) {
						return arr[i].rank;
					} else {
						return arr[i].rank + 1;
					}
				} else if (score > midval) {
					j = mididx;
				} else if (score < midval) {
					i = mididx;
				} else {
					return arr[mididx].rank;
				}
			}
		}

	}

	public static void formArr() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Pair[] rv = new Pair[n];
		for (int i = 0; i < n; i++) {
			rv[i] = new Pair();
			long currscore = scn.nextLong();
			if (i > 0) {
				long prevscore = rv[i - 1].score;
				if (currscore == prevscore) {
					rv[i].rank = rv[i - 1].rank;
					rv[i].score = currscore;
				} else {
					rv[i].rank = rv[i - 1].rank + 1;
					rv[i].score = currscore;
				}
			} else {
				rv[i].rank = 1;
				rv[i].score = currscore;
			}
		}

		int x = scn.nextInt();
		int[] ans = new int[x];
		long score = 0;
		for (int i = 0; i < x; i++) {
			score += scn.nextLong();
			ans[i] = findRank(rv, score);
		}
		for (int val : ans) {
			System.out.println(val);
		}

	}

	public static class Pair {
		int rank;
		long score;
	}

}
