package Hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonaciModified {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long fn = scn.nextInt();
		long sn = scn.nextInt();
		boolean isrng = true;
		BigInteger fnb = new BigInteger("0");
		BigInteger snb = new BigInteger("0");
		int n = scn.nextInt();
		for (int i = 1; i < n; i++) {
			if (isrng) {
				long tn = fn + sn * sn;
				if (tn > 100000000) {
					isrng = false;
					Long fni = sn;
					Long sni = tn;
					fnb = new BigInteger(fni.toString());
					snb = new BigInteger(sni.toString());
				} else {
					fn = sn;
					sn = tn;
				}
			} else {
				BigInteger tn = fnb.add(snb.multiply(snb));
				fnb = snb;
				snb = tn;
			}
		}

		if (isrng) {
			System.out.println(fn);
		} else {
			System.out.println(fnb);
		}
	}

}
