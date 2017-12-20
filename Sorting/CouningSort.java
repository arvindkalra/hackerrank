import java.util.Scanner;

public class CouningSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(count());
	}

	public static int[] count() {
		int[] rv = new int[100];
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			rv[scn.nextInt()]++;
		}

		scn.close();
		return rv;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				for (int j = 1; j <= arr[i]; j++) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
