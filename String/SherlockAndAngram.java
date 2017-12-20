package String;

import java.util.ArrayList;
import java.util.Scanner;

public class SherlockAndAngram {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        for(int ti = 0; ti < t; ti++){
            String str = scn.nextLine();
            int counter = 0;
            ArrayList<String> subs = new ArrayList<>();
            for(int i = 1; i <= str.length(); i++){
                for(int j = 0; j + i <= str.length(); j++){
                    subs.add(str.substring(j, j + i));
                }
            }
            for (int j = 0; j < subs.size(); j++) {
                String element = subs.get(j);
                for (int k = j+1; k < subs.size(); k++) {
                    if(isAnagram(subs.get(k), element)){
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
    }

    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        int[] lettermap = new int[26];
        for(int j=0; j<a.length(); j++){
            char ch = a.charAt(j);
            lettermap[ch - 'a']++;
            ch = b.charAt(j);
            lettermap[ch - 'a']--;
        }

        for(int j=0; j<lettermap.length; j++){
            if(lettermap[j] != 0){
                return false;
            }
        }
        return true;
    }
}
