package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] B = new int[m];
        for(int i = 0; i < m; i++){
            B[i] = scn.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0, j = 0;
        ArrayList<Integer> rv = new ArrayList<>();
        while (i < A.length && j < B.length){
            if(A[i] == B[j]){
                i++;
                j++;
                continue;
            }else{
                if(rv.size() == 0 || rv.get(rv.size() - 1) != B[j]){
                rv.add(B[j]);}
                j++;
                continue;
            }
        }
        while(j < B.length){
            if(rv.size() == 0 || rv.get(rv.size() - 1) != B[j]){
                rv.add(B[j]);}
            j++;
        }
        for (int k = 0; k < rv.size(); k++){
            System.out.print(rv.get(k) + " ");
        }
    }
    // 3670 3674 3677 3684 3685 3685 3695 3714 3720
    // 3670 3674 3677 3684 3685 3695 3714 3720
}
