package com.valente;

import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by flvs on 6/11/16.
 */
public class KaprekarNumbers {

    public static void main(String[] args) throws FileNotFoundException {

        /*Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();*/

        solve(1, 99999);

    }

    private static void solve(int p, int q) {
        boolean hasSolution = false;
        for (int n = p; n <= q ; n++) {
            if(isKaprekar(n)){
                System.out.print(n  + " ");
                hasSolution = true;
            }
        }
        if(!hasSolution)
            System.out.print("INVALID RANGE");
    }

    private static boolean isKaprekar(int n) {
        String  square = String.valueOf(BigInteger.valueOf((long)Math.pow(n,2)));
        if(square.length() % 2 == 1)
            square = "0" + square;

        int left = Integer.parseInt(square.substring(0,square.length()/2));
        int right = Integer.parseInt(square.substring(square.length()/2 ,square.length()));
        if(right > 0 &&  left + right == n)
            return true;

        return false;
    }


}
