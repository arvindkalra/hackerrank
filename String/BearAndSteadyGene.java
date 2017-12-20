package String;

import java.util.Scanner;

public class BearAndSteadyGene {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int max = n / 4;
        scn.nextLine();
        String str = scn.nextLine();
        int g = 0;
        int a = 0;
        int c = 0;
        int t = 0;
        int si = 0;
        int ei = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            char cc = str.charAt(i);
            if(cc == 'G' && g < max){
                g++;
            }else if(cc == 'A' && a < max){
                a++;
            }else if(cc == 'C' && c < max){
                c++;
            }else if(cc == 'T' && t < max){
                t++;
            }else{
                ei = i;
                break;
            }
        }

        for(int i = 0; i < ei; i++){
            char cc = str.charAt(i);
            if(cc == 'G' && g < max){
                g++;
            }else if(cc == 'A' && a < max){
                a++;
            }else if(cc == 'C' && c < max){
                c++;
            }else if(cc == 'T' && t < max){
                t++;
            }else{
                si = i;
                break;
            }
        }

        System.out.println(ei - si + 1);
    }
}
