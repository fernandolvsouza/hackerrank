package com.valente;

import java.util.Scanner;

/**
 * Created by uq4n on 06/06/2016.
 */
public class GridSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
        }
    }

    public static int solve(String[] G, String[] P, int C, int c, int R, int r){
        int occurrence = 0;

        for (int row = 0; row < R ; row++) {
            for (int row_pattern = 0; row_pattern < P.length; row_pattern++) {
                if(!matchLine(G[row],P[row]))
                    break;

                if(row_pattern == P.length -1)
                    occurrence++;
            }
        }

        return occurrence;
    }

    private static boolean matchLine(String s, String s1) {

    }
}
