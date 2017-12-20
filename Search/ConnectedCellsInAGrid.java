package Search;

import java.util.Scanner;
import java.util.Stack;

public class ConnectedCellsInAGrid {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        boolean[][] boolarr = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = scn.nextInt();
                boolarr[i][j] = false;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!boolarr[i][j] && arr[i][j] == 1){
                    Stack<Pair> st = new Stack<>();
                    Pair ptba = new Pair(i, j);
                    st.push(ptba);
                    boolarr[i][j] = true;
                    int count = 1;
                    while(!st.isEmpty()){
                        Pair curpair = st.pop();
                        int curi = curpair.i;
                        int curj = curpair.j;

                        if(isValid(n, m, curi - 1, curj - 1, arr, boolarr)){
                            st.push(new Pair(curi - 1, curj - 1));
                            count++;
                            boolarr[curi - 1][curj - 1] = true;
                        }
                        if(isValid(n, m, curi - 1, curj, arr, boolarr)){
                            st.push(new Pair(curi - 1, curj));
                            count++;
                            boolarr[curi - 1][curj] = true;
                        }
                        if(isValid(n, m, curi - 1, curj + 1, arr, boolarr)){
                            st.push(new Pair(curi - 1, curj + 1));
                            count++;
                            boolarr[curi - 1][curj + 1] = true;
                        }
                        if(isValid(n, m, curi, curj - 1, arr, boolarr)){
                            st.push(new Pair(curi, curj - 1));
                            count++;
                            boolarr[curi][curj - 1] = true;
                        }
                        if(isValid(n, m, curi, curj + 1, arr, boolarr)){
                            st.push(new Pair(curi, curj + 1));
                            count++;
                            boolarr[curi][curj + 1] = true;
                        }
                        if(isValid(n, m, curi + 1, curj - 1, arr, boolarr)){
                            st.push(new Pair(curi + 1, curj - 1));
                            count++;
                            boolarr[curi + 1][curj - 1] = true;
                        }
                        if(isValid(n, m, curi + 1, curj, arr, boolarr)){
                            st.push(new Pair(curi + 1, curj));
                            count++;
                            boolarr[curi + 1][curj] = true;
                        }
                        if(isValid(n, m, curi + 1, curj + 1, arr, boolarr)){
                            st.push(new Pair(curi + 1, curj + 1));
                            count++;
                            boolarr[curi + 1][curj + 1] = true;
                        }
                    }
                    if(count > max){
                        max = count;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static boolean isValid(int n, int m, int i , int j, int[][] arr, boolean[][] boolarr){
        boolean rv = false;

        if(i >= 0 && j >= 0 && i < n && j < m){
            if(arr[i][j] == 1 && !boolarr[i][j]){
                rv = true;
            }
        }

        return rv;
    }

    public static class Pair{
        int i;
        int j;
        public Pair(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
}
