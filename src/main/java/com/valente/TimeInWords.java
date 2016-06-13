package com.valente;

import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by flvs on 6/11/16.
 */
public class TimeInWords {

    public static void main(String[] args) throws FileNotFoundException {

        /*Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();*/
        System.out.println(solve(5,0));
        System.out.println(solve(5,1));
        System.out.println(solve(5,10));
        System.out.println(solve(4,15));
        System.out.println(solve(5,30));
        System.out.println(solve(5,40));
        System.out.println(solve(5,45));
        System.out.println(solve(5,47));
        System.out.println(solve(5,28));

    }

    private static String[] numbers = new String[] {
            "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static String[] multipleTen = new String[] {
            "twenty", "thirty", "forty", "fifty"
    };

    public static String solve(int h, int m){

        if(m == 0)
            return numbers[h - 1] + " o' clock";
        else if(m == 30 )
            return "half past " + numbers[h - 1];
        else  if(m == 45 )
            return "quarter to " + numbers[h];
        else  if(m == 15 )
            return "quarter past " + numbers[h - 1];
        else if(m > 0 && m < 30 ){
            return getMinutes(m) + " minutes past " + numbers[h-1];
        }
        else
            return getMinutes(60 - m) + " minutes to " + numbers[h];
    }

    private static String getMinutes(int m) {
        String minutes;
        if(m < 20)
            minutes = numbers[m - 1];
        else {
            int mod10 = m % 10;
            int div = m / 10;
            minutes = multipleTen[div - 2] + (mod10 != 0 ? " " + numbers[mod10 -1] : "");
        }
        return minutes;
    }
}
