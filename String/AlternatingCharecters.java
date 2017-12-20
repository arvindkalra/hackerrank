package String;

import java.util.Scanner;

public class AlternatingCharecters {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        for(int ni = 0 ; ni < n; ni++){
            String input = scn.nextLine();
            int noOfDeletions = 0;
            char[] chars = input.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                 char currChar = chars[i];
                 if(i + 1 < chars.length){
                     char nextChar = chars[i + 1];
                     if (currChar == nextChar) {
                        noOfDeletions++;
                     }
                 }
            }
                System.out.println(noOfDeletions);
        }
    }
}
