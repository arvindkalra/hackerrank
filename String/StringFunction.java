package String;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StringFunction {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                String curstr = str.substring(i , j);
                if(hm.containsKey(curstr)){
                    hm.put(curstr, hm.get(curstr) + 1);
                }else{
                    hm.put(curstr, 1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        Set<String> set = hm.keySet();
        for(String key : set){
            int val = key.length() * hm.get(key);
            max = Math.max(val, max);
        }

        System.out.println(max);
    }
}
