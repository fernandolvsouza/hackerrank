package com.valente;

import java.io.*;
import java.util.Scanner;

/**
 * Created by uq4n on 06/06/2016.
 */
public class GridSearch {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("src/input_grid5.txt"));
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
            System.out.println(solve(G,P,C,c,R,r) ? "YES" : "NO");
        }
    }


    public static boolean solve(String[] G, String[] P, int C, int c, int R, int r){

        StringBuilder linearG = new StringBuilder("");
        for (int i = 0; i < R; i++)
            linearG.append(G[i]);

        StringBuilder linearP = new StringBuilder("");
        for (int i = 0; i < r; i++)
            linearP.append(P[i]);

        for (int i = 0; i < R*C - c ; i++) {
            int matchCount = 0;
            int i2 = i;
            //char[] sample = new char[C * r];

            for (int j = 0; j < r*c; j++) {
                int columnP = j % c;
                if(i2 + j < linearG.length() && linearG.charAt(i2 + j) == linearP.charAt(j)){
                    matchCount ++;
                }else{
                    break;
                }
                if(columnP == c-1) {
                    i2 = i2 + C - c ;
                    continue;
                }
            }
            if(matchCount == linearP.length()) {
                return true;
            }
        }

        return false;
    }
}
