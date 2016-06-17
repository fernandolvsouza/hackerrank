package com.valente;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * Created by flvs on 6/16/16.
 */

/**
 * 709
 Too chaotic
 704
 Too chaotic
 Too chaotic
 Too chaotic
 691
 731
 733
 Too chaotic*/
public class NewYearsCaos {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f = new FileReader("src/main/resources/newyears06.txt");
        Scanner s = new Scanner(f);
        int T = s.nextInt();

        for (int i = 0; i < T; i++) {
            int n  = s.nextInt();
            int[] queueFinal = new int[n];
            for (int j = 0; j < n; j++) {
                queueFinal[j] = s.nextInt();
            }
            solve(queueFinal, n );
        }
    }

    private static void solve(int[] q, int n) {

        List original = new ArrayList(n);
        for (int i = 0; i < n; i++) {
            original.add(i+1);
        }

        int inversions = 0;

        for (int i = 0; i < n; i++) {
            int pos_original = Collections.binarySearch(original,q[i]);

            if(pos_original > 2){
                System.out.println("Too chaotic");
                return;
            }

            inversions = inversions + pos_original;
            original.remove(pos_original);
        }

        System.out.println(inversions);
    }

}
