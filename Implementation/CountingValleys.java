package Hackerrank;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		boolean isValley = false;
		int count = 0;
		int currpos = 0;
		int n = scn.nextInt();
		scn.nextLine();
		String str = scn.nextLine();
		for (int i = 0; i < n; i++) {
			char cc = str.charAt(i);
			if (cc == 'U') {
				currpos++;
			} else {
				currpos--;
			}
			if (currpos == -1) {
				isValley = true;
			}
			if (currpos == 0 && isValley) {
				count++;
				isValley = false;
			}
		}
		System.out.println(count);
	}

}
