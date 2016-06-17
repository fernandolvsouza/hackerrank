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
        FileReader f = new FileReader("src/main/resources/newyears2.txt");
        Scanner s = new Scanner(f);
        int T = s.nextInt();

        for (int i = 0; i < T; i++) {
            int n  = s.nextInt();
            int[] queueFinal = new int[n];
            int[] aux = new int[n];
            for (int j = 0; j < n; j++) {
                queueFinal[j] = s.nextInt();
                aux[j] = queueFinal[j];
            }

            boolean tooChaotic = false;
            for (int j = 0; j < n; j++) {
                if(j < queueFinal[j] - 3 )
                    tooChaotic = true;
            }
            if(tooChaotic)
                System.out.println("Too chaotic");
            else
                System.out.println(solve(0, queueFinal.length-1 , queueFinal, aux));
        }
    }

    private static long  solve(int lo, int hi ,int[] q, int[] aux) {

        if(lo >= hi )
            return 0;

        int middle = lo + (hi-lo)/2;

        long left = solve(lo, middle, q, aux);
        long right  = solve(middle+1, hi, q,aux);

        long leftRight = merge(lo,middle,hi, q,aux);

        return left + right + leftRight;
    }

    private static long  merge(int lo, int mid, int hi ,int[] q, int[] aux) {
        long inversions = 0;

        for (int i = 0; i < q.length; i++) {
            aux[i] = q[i];
        }

        int i = lo;
        int j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if(j > hi)
                q[k] = aux[i++];
            else if(i > mid)
                q[k] = aux[j++];
            else if(aux[j] < aux[i]){
                q[k] = aux[j++]; inversions+= (mid - i + 1);
            }
            else
                q[k] = aux[i++];

        }
        return inversions;
    }


}
