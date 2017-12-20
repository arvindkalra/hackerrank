package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class PickingNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(findMax(arr));
	}

	public static int findMax(int[] arr) {
		int rv = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> includedbigger = new ArrayList<>();
			ArrayList<Integer> includedsmalle = new ArrayList<>();
			includedbigger.add(i);
			includedsmalle.add(i);
			for (int j = i + 1; j < arr.length; j++) {
				int diff = arr[i] - arr[j];
				if (diff == -1) {
					includedsmalle.add(j);
				} else if (diff == 1) {
					includedbigger.add(j);
				} else if (diff == 0) {
					includedsmalle.add(j);
					includedbigger.add(j);
				}
			}
			if (includedsmalle.size() > rv) {
				rv = includedsmalle.size();
			}
			if (includedbigger.size() > rv) {
				rv = includedbigger.size();
			}
		}

		return rv;
	}

}
