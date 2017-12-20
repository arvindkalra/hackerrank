import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
		// S = 0
		// O = 1
		// S = 2
		Scanner scn = new Scanner(System.in);
		System.out.println(countchng(scn.nextLine(), 0));
	}

	public static int countchng(String str, int ch) {
		int count = 0;
		if (str.length() == 0) {
			return 0;
		}

		ch = ch % 3;

		if (ch == 0 && str.charAt(0) != 'S') {
			count++;
		} else if (ch == 1 && str.charAt(0) != 'O') {
			count++;
		} else if (ch == 2 && str.charAt(0) != 'S') {
			count++;
		}

		count += countchng(str.substring(1), ch + 1);

		return count;
	}

}
