package ConstructiveAlgorithms;

import java.util.Scanner;

public class FlippingTheMatrix {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num_test = scn.nextInt();
        for(int nt = 0; nt < num_test; nt++){
            int q = scn.nextInt();
            int[][] arr = new int[2*q][2*q];
            for(int i = 0; i < 2*q; i++){
                for(int j = 0; j < 2*q; j++){
                    arr[i][j] = scn.nextInt();
                }
            }
            long maxsum = 0;
            for(int k = 0; k < q*q; k++){
                int currow = k / q;
                int curcol = k % q;
                int arrl = arr.length;
                maxsum += Math.max(arr[currow][curcol], Math.max(arr[currow][arrl - curcol - 1], Math.max(arr[arrl - currow - 1][curcol], arr[arrl - currow - 1][arrl - curcol - 1])));
            }
            System.out.println(maxsum);
        }

    }
}
