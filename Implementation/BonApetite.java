import java.util.Scanner;

public class BonApetite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		takeInput();
	}

	public static void takeInput() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int notEat = scn.nextInt();
		int amtNotEat;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int amt = scn.nextInt();
			if (i == notEat) {
				amtNotEat = amt;
			} else {
				sum += amt;
			}
		}
		int share = sum / 2;
		int paid = scn.nextInt();
		if (paid == share) {
			System.out.println("Bon Appetit");
		} else {
			int dif = paid - share;
			System.out.println(dif);
		}
	}
}
