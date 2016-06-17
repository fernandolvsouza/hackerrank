package com.valente;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by flvs on 6/14/16.
 */
public class Rotate2D {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f = new FileReader("src/main/resources/2d_rotation_input2.txt");
        Scanner s = new Scanner(f);

        int M = s.nextInt();
        int N = s.nextInt();
        int R = s.nextInt();

        int[] matrix = new int[M * N];

        for (int j = 0; j < M * N; j++) {
                matrix[j] = s.nextInt();
        }

        int numberOfPaths = Math.min(M,N)/2;
        for (int depth = 0; depth < numberOfPaths; depth++) {
            List<Integer> strip = getStrip(depth, M, N, matrix);
            rotate(strip,R);
            applyStrip(depth, strip, matrix, M, N);
        }

        for (int j = 0; j < M * N; j++) {
            System.out.print(matrix[j] + " ");

            if( j % N == N - 1)
                System.out.print("\n");
        }
    }

    private static List<Integer> getStrip(int depth, int M, int N, int[] matrix) {
        int innerM = M - 2 * depth;
        int innerN = N - 2 * depth;

        int stripLen = 2 * ( innerM + innerN ) - 4;
        List<Integer> strip = new LinkedList<>();
        for (int i = 0; i < stripLen; i++) {
            int m = mFromStripIndex(i, depth, M, N);
            int n = nFromStripIndex(i, depth, M, N);
            strip.add(matrix[linearIndex(m, n, N)]);
        }
        return strip;
    }

    private static void applyStrip(int depth, List<Integer> strip, int[] matrix, int M, int N) {
        for (int i = 0; i < strip.size(); i++) {
            int m = mFromStripIndex(i, depth, M, N);
            int n = nFromStripIndex(i, depth, M, N);
            matrix[linearIndex(m, n, N)] = strip.get(i);
        }
    }

    private static void rotate(List<Integer> strip, int R) {
        int modR = R % strip.size();
        for (int r = 0; r < modR; r++) {
            Integer first = strip.remove(0);
            strip.add(first);
        }
    }

    private static int nFromStripIndex(int i, int depth, int M, int N) {
        int m = M - 2 * depth;
        int n = N - 2 * depth;

        int finalN;

        if(i < n) // 4x5 => < 4
            finalN = i;
        else if(i < n + m  - 1) // 4x5 => < 8
            finalN = n - 1;
        else if(i < 2 * n + m  - 2) // 4x5 => < 11
            finalN =  2 * n + m - 3 - i ; // 4x5 => 10 - i
        else if(i < 2 * (n + m)  - 3)
            finalN = 0 ;
        else
            throw new IllegalStateException("No");

        return finalN + depth;
    }

    private static int mFromStripIndex(int i, int depth, int M, int N) {
        int m = M - 2 * depth;
        int n = N - 2 * depth;

        int finalM;

        if(i < n)
            finalM = 0;
        else if(i < n + m  - 1) // 4x5 => < 8
            finalM = i - (n - 1);
        else if(i < 2 * n + m  - 2) // 4x5 => < 11
            finalM = m - 1;
        else if(i < 2 * (n + m)  - 3)
            finalM =  (2 * (n + m) - 4) - i;
        else
            throw new IllegalStateException("No");

        return finalM + depth;
    }

    private static int linearIndex(int m, int n, int N) {
        return m * N + n;
    }
}
