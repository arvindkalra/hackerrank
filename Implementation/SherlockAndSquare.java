package Implementation;

import java.util.Scanner;

public class SherlockAndSquare {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int ti = 0; ti < t; ti++){
            int n = scn.nextInt();
            int m = scn.nextInt();
            int count =
                    (int)Math.floor(Math.sqrt(m)) - (int)Math.ceil(Math.sqrt(n)) + 1;
            System.out.println(count);
        }
    }
}
