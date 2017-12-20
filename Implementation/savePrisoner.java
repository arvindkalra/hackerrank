import java.util.ArrayList;
import java.util.Scanner;

public class savePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 - n,1- m, 2- s
		ArrayList<int[]> inp = takeInput();
		for (int i = 0; i < inp.size(); i++) {
			printRes(inp.get(i));
		}
	}

	public static void printRes(int[] arr) {
		int si = arr[2];
		int n = arr[0];
		int m = arr[1];
		int currpos = si;
		for (int i = 1; i < m; i++) {
			currpos = (si + i) % n;
		}
		System.out.println(currpos);
	}

	public static ArrayList<int[]> takeInput() {
		Scanner scn = new Scanner(System.in);
		ArrayList<int[]> rv = new ArrayList<>();
		int numtest = scn.nextInt();
		for (int i = 0; i < numtest; i++) {
			int[] arr = new int[3];
			for (int j = 0; j < 3; j++) {
				arr[j] = scn.nextInt();
			}
			rv.add(arr);
		}
		return rv;
	}

}
