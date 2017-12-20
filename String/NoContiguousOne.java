package String;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NoContiguousOne {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter a Number...");
		Queue<ArrayList<Integer>> rv = new LinkedList<>();
		int n = scn.nextInt();
		ArrayList<Integer> zero = new ArrayList<>();
		ArrayList<Integer> one = new ArrayList<>();
		zero.add(0);
		one.add(1);
		rv.add(zero);
		rv.add(one);
		int w0 = 1;
		int w1 = 1;
		int sum = w0 + w1;
		for (int i = 1; i < n; i++) {
			int neww0 = w0 + w1;
			int neww1 = w0;
			Queue<ArrayList<Integer>> ones = new LinkedList<>();
			Queue<ArrayList<Integer>> zeros = new LinkedList<>();
			for (int j = 1; j <= sum; j++) {
				if (j <= w0) {
					ArrayList<Integer> arr0 = rv.poll();
					ArrayList<Integer> arr1 = new ArrayList<>();
					for (int k = 0; k < arr0.size(); k++) {
						arr1.add(arr0.get(k));
					}
					arr0.add(0);
					arr1.add(1);
					ones.add(arr1);
					zeros.add(arr0);
				} else {
					ArrayList<Integer> arr0 = rv.poll();
					arr0.add(0);
					zeros.add(arr0);
				}
			}

			rv.addAll(zeros);
			rv.addAll(ones);

			w0 = neww0;
			w1 = neww1;
			sum = w0 + w1;
		}
		sum = w0 + w1;
		System.out.println(sum);
		System.out.println(rv);
		scn.close();
	}

}
