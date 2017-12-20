package String;

import java.util.HashMap;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		HashMap<Character, Integer> feqmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (cc >= 'A' && cc <= 'Z') {
				cc = (char) (cc - 'A' + 'a');
			}
			if (cc != ' ') {
				feqmap.put(cc, 1);
			}
		}

		if (feqmap.size() == 26) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
	}

}
