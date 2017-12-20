package String;

import java.util.Scanner;

public class PalindromicIndex {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        for(int ti = 0; ti < t; ti++){
            String str = scn.nextLine();
            boolean done = false;
            for(int i = 0, j = str.length() - 1; i <= j; i++, j--){
                char cci = str.charAt(i);
                char ccj = str.charAt(j);
                if(cci != ccj){
                    char ccip1 = str.charAt(i + 1);
                    char ccip2 = str.charAt(i + 2);
                    char ccjm1 = str.charAt(j - 1);
                    if(ccip1 == ccj && ccip2 == ccjm1){
                        System.out.println(i);
                        done = true;
                        break;
                    }else{
                        System.out.println(j);
                        done = true;
                        break;
                    }
                }
            }
            if(!done){
                System.out.println("-1");
            }
        }
    }
}
