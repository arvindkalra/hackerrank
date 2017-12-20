package Hackerrank;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(count(scn.nextLine()));
	}

	public static int count(String str) {
		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			int cc = str.charAt(i);
			if (cc >= 'A' && cc <= 'Z') {
				count++;
			}
		}

		return count;
	}

}
