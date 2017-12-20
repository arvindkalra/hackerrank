package Search;

import java.util.Scanner;

public class IceCreamParlor {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int ti = 0 ; ti < t; ti++){
           int m = scn.nextInt();
           int n = scn.nextInt();
           int fi = -1;
           int si = -1;
           int[] arr = new int[n];
           for(int i = 0; i < n; i++){
               arr[i] = scn.nextInt();
           }
           for(int i = 0; i < n; i++){
               fi = i;
               int rem = m - arr[i];
               for(int j = i + 1; j < n; j++){
                   if(arr[j] == rem){
                       si = j;
                       break;
                   }
               }
               if(si != -1){
                   break;
               }
           }
           fi++;
           si++;
           System.out.println(fi + " " + si);
        }
    }
}
