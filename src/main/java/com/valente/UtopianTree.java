package com.valente;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

/**
 * Created by uq4n on 06/06/2016.
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int solve( int cycle){
        int h = 1;
        for (int i = 0; i < cycle; i++) {
            if(i % 2 == 0)
                h*=2;
            else
                h++;
        }
        return h;
    }
}
