package com.valente;

import java.util.Scanner;

/**
 * Created by uq4n on 06/06/2016.
 */
public class DecentNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(solve(n));
        }
    }

    private static String solve(int n) {
        int n3 = 0;
        int n5 = n;

        if(checkDecentNumber(n3,n5))
            return number(n3,n5);

        for (int i = 0; i < n; i++) {
            n5--;
            n3++;
            if(checkDecentNumber(n3,n5))
                return number(n3,n5);
        }
        return "-1";
    }

    private static String number(int n3, int n5) {
        char[] result = new char[n3+n5];

        for (int i = 0; i < n3 + n5; i++)
            result[i] = i < n5 ? '5' : '3';

        return new String(result);
    }

    private static boolean checkDecentNumber(int n3, int n5) {
        return n5 % 3 == 0 && n3 % 5 == 0;
    }
}
