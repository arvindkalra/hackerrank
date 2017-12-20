package Hackerrank;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		for (int i = 0; i < test; i++) {
			int n = scn.nextInt();
			int k = scn.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = scn.nextInt();
			}
			declare(arr, k);
		}
	}

	public static void declare(int[] arr, int k) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				count++;
			}
		}

		if (count >= k) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}

}
