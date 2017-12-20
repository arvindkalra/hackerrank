import java.util.HashMap;
import java.util.Scanner;

public class TheCoinChangeProblem {

	
   public static void main(String[] args) {
		Pair input = takeInput();
		System.out.println(countWays(input.total, input.arr, 0, new HashMap<>()));
	}

	public static Pair takeInput() {
		Scanner scn = new Scanner(System.in);
		int total = scn.nextInt();
		int numcons = scn.nextInt();

		int[] arr = new int[numcons];
		for (int i = 0; i < numcons; i++) {
			arr[i] = scn.nextInt();
		}

		return new Pair(arr, total);
	}

	public static int countWays(int n, int[] arr, int pos, HashMap<String, Integer> vals) {
		int count = 0;

		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		for (int i = pos; i < arr.length; i++) {
			if (vals.containsKey(n + "&" + i)) {
				count += vals.get(n + "&" + i);
			} else {
				int temp;
				temp = countWays(n - arr[i], arr, i, vals);
				vals.put(n + "&" + i, temp);
				count += temp;
			}
		}
		return count;
	}
}

class Pair {
	int[] arr;
	int total;

	public Pair(int[] arr, int total) {
		this.arr = arr;
		this.total = total;
	}
}
