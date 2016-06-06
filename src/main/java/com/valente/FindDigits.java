package com.valente;

import java.util.Scanner;

/**
 * Created by uq4n on 06/06/2016.
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int solve(int n){
        String number = "" +n;
        int sum = 0;
        for (int i = 0; i < number.length() ; i++) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            if(digit == 0)
                continue;
            if( n % digit == 0 )
                sum ++;
        }
        return sum;
    }
}
