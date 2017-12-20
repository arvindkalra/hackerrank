package Search;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextLong();
        }
        Arrays.sort(arr);
        int i=0,j=1,count=0;

        while(j < n) {
            long diff = arr[j] - arr[i];

            if (diff == k) {
                count++;
                j++;
            } else if (diff > k) {
                i++;
            } else if (diff < k) {
                j++;
            }
        }
//        for(int i = 0; i < arr.length; i++){
//            long fn = arr[i] + k;
//            long sn = arr[i] - k;
//            for(int j = i + 1; j < arr.length; j++){
//                if(arr[j] == fn || arr[j] == sn){
//                    np++;
//                }
//            }
//        }
        System.out.println(count);
    }
}
