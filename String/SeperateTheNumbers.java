package String;

import java.util.Scanner;

public class SeperateTheNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int q = scn.nextInt();
		scn.nextLine();
		for (int i = 0; i < q; i++) {
			String str = scn.nextLine();
			long firstx = 0;
			boolean isDone = false;
			for (int j = 1; j <= str.length() / 2; j++) {
				String num = str.substring(0, j);
				long x = Long.parseLong(num);
				firstx = x;
				String test = num;
				while (test.length() < str.length()) {
					test += Long.toString(++x);
				}
				if (test.equals(str)) {
					isDone = true;
					break;
				}
			}

			if (isDone) {
				System.out.println("YES " + firstx);
			} else {
				System.out.println("NO");
			}
		}
	}

}
