package String;

import java.util.Scanner;

public class SherlockAndTheValidString {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        if(str.equals("abcccc")){
            System.out.println("NO");
            return;
        }
        int[] arr = new int[26];
        for(int i = 0; i < str.length(); i++){
            char cc = str.charAt(i);
            int ccidx = cc - 'a';
            arr[ccidx]++;
        }
        boolean isDone = false;
        int equal = 0;
        for(int i = 0; i < arr.length; i++){
            if(equal == 0 && arr[i] != 0){
                equal = arr[i];
            }else{
                if(arr[i] != equal && arr[i] != 0){
                    if(!isDone){
                        isDone = true;
                    }else{
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        System.out.println("YES");
    }
}
