package String;

import java.util.Scanner;

public class CommonChild {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        int count = 0;

        int start = 0;
        for(int i = 0; i < s1.length(); i++){
            char s1cc = s1.charAt(i);
            for(int j = start; j < s2.length(); j++){
                char s2cc = s2.charAt(j);
                if(s1cc == s2cc){
                    start = j;
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
