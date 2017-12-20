import java.util.Scanner;

public class minmaxsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callfn();
	}

	public static void callfn() {
		Scanner scn = new Scanner(System.in);
		long[] arr = new long[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextLong();
		}
		minmaxsum(arr);
	}

	public static void minmaxsum(long[] arr) {

		long sum = 0;
		for (long val : arr) {
			sum += val;
		}
		long minsum = Integer.MAX_VALUE;
		long maxsum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			long currsum = sum - arr[i];
			if (currsum > maxsum) {
				maxsum = currsum;
			}
			if (currsum < minsum) {
				minsum = currsum;
			}
		}
		System.out.print(minsum + " ");
		System.out.print(maxsum);
	}

}
