package String;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int q = scn.nextInt();
		scn.nextLine();
		for (int i = 0; i < q; i++) {
			String str = scn.nextLine();
			boolean flag = true;
			for (int j = 1, k = str.length() - 2; j < str.length() && k >= 0; j++, k--) {
				char beg = str.charAt(j);
				char beg1 = str.charAt(j - 1);
				char end = str.charAt(k);
				char end1 = str.charAt(k + 1);

				int diff1 = Math.abs((int) (beg - beg1));
				int diff2 = Math.abs((int) (end - end1));

				if (diff1 != diff2) {
					flag = false;
				}
			}
			System.out.println(flag ? "Funny" : "Not Funny");
		}
		scn.close();
	}

}
