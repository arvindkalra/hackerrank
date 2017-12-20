package Search;

import java.util.Scanner;

public class SherlockNArray {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int ti = 0; ti < t; ti++){
            int n = scn.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                arr[i] = scn.nextInt();
                sum += arr[i];
            }
            int ls = 0;
            int rs = sum;
            boolean isDone = false;
            for(int i = 0; i < arr.length; i++){
                rs = rs - arr[i];
                if(ls == rs){
                    isDone = true;
                    break;
                }
                ls = ls + arr[i];
            }
            if(isDone){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
