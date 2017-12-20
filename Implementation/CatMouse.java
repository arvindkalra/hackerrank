package Hackerrank;

import java.util.Scanner;

public class CatMouse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int numtest = scn.nextInt();
		for (int i = 0; i < numtest; i++) {
			int ca = scn.nextInt();
			int cb = scn.nextInt();
			int mc = scn.nextInt();
			if ((mc > ca && mc < cb) || (mc > cb && mc < ca)) {
				int dista = Math.abs(mc - ca);
				int distb = Math.abs(mc - cb);
				if (dista == distb) {
					System.out.println("Mouse C");
					continue;
				} else if (dista < distb) {
					System.out.println("Cat A");
					continue;
				} else if (distb < dista) {
					System.out.println("Cat B");
					continue;
				}
			} else {
				if (ca > cb) {
					if (mc >= ca) {
						System.out.println("Cat A");
						continue;
					} else if (mc <= cb) {
						System.out.println("Cat B");
						continue;
					}
				} else if (cb > ca) {
					if (mc >= cb) {
						System.out.println("Cat B");
						continue;
					} else if (mc <= ca) {
						System.out.println("Cat A");
						continue;
					}
				} else {
					System.out.println("Mouse C");
					continue;
				}
			}
		}
	}

}
