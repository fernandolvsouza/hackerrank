package com.valente;

import java.util.Scanner;

/**
 * Created by flvs on 06/06/2016.
 */
public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            boolean cancelled = solve(k,a);
            System.out.println(cancelled ? "YES" : "NO");
        }
    }

    private static boolean solve(int k, int[] arr) {
        int onTime = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] <= 0 )
                onTime++;
            if(onTime >= k)
                return false;
        }
        return true;
    }
}
