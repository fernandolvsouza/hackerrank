package com.valente;

import java.util.Scanner;

/**
 * Created by flvs on 6/11/16.
 */
public class StairCase {

    public static void main(String[] args) {

        /*Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
*/
        solve(6);

    }

    public static void solve( int n){
        for (int i = 0; i < n * n; i++) {
            int r = i / n;
            int c = i % n;

            int c_limit =  n - r -1;

            if(c < c_limit)
                System.out.print(" ");
            else
                System.out.print("#");

            if(c == n - 1)
                System.out.print("\n");
        }
    }


}
