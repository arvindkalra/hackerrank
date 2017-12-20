import java.util.Scanner;

public class GameOfThrones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int[] arr = new int[26];
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			sum += arr[i] % 2;
		}
		if (sum >= 2) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
