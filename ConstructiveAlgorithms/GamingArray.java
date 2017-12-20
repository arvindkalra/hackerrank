package ConstructiveAlgorithms;

import java.util.Scanner;

public class GamingArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int g = scn.nextInt();
        for (int i = 0; i < g; i++){
            int n = scn.nextInt();
            int max = Integer.MIN_VALUE;
            int m = 0;
            for(int j = 0; j < n; j++){
                int ntba = scn.nextInt();
                if(ntba > max){
                    max = ntba;
                    m++;
                }
            }
            int size = m;
            if(size % 2 != 0){
                System.out.println("BOB");
            }else {
                System.out.println("ANDY");
            }
        }
    }
}
