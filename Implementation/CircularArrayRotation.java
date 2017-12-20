package Hackerrank;

import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n + 1];
		int[] index = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			int abc = in.nextInt();
			a[i] = abc;
			index[abc] = i;
		}
		for (int x = 1; x <= n; x++) {
			int y = index[x];
			int prin = index[y];
			System.out.println(prin);
		}
	}

}
