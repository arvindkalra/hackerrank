package Hackerrank;

import java.util.Scanner;

public class ElectronicsShop {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int maxamt = scn.nextInt();
		int keyn = scn.nextInt();
		int usbn = scn.nextInt();
		int[] key = new int[keyn];
		int[] usb = new int[usbn];

		for (int i = 0; i < keyn; i++) {
			key[i] = scn.nextInt();
		}
		for (int i = 0; i < usbn; i++) {
			usb[i] = scn.nextInt();
		}

		System.out.println(maxCost(key, usb, maxamt));
	}

	public static int maxCost(int[] key, int[] usb, int maxamt) {
		int rv = -1;

		for (int i = 0; i < key.length; i++) {
			int cost = key[i];
			for (int j = 0; j < usb.length; j++) {
				int currcos = cost + usb[j];
				if (currcos <= maxamt) {
					rv = Math.max(currcos, rv);
				}
			}
		}

		return rv;
	}

}
