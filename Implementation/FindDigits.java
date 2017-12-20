package Implementation;

import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int ti = 0; ti < t; ti++){
            int n = in.nextInt();
            int r = n;
            int count = 0;
            while(r > 0){
                if(r % 10 != 0 && n % (r % 10) == 0) count++;
                r = r / 10;
            }
            System.out.println(count);
        }
    }
}
