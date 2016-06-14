package com.valente;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by flvs on 6/9/16.
 */
public class MaxMin {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f = new FileReader("src/main/resources/teste2.txt");
        Scanner in = new Scanner(f);

        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();

            solve(width, i, j);
        }

    }

    public static void solve(int[] width, int i, int j) {
        int min_width = Integer.MAX_VALUE;
        for (int k = i; k <= j ; k++) {
            if(width[k] < min_width)
                min_width = width[k];
        }
        //System.out.println(min_width);
        int max_width_vehicle = 0;
        for (int k = 1; k <= 3 ; k++) {
            if(k <= min_width && k > max_width_vehicle)
                max_width_vehicle = k;
        }
        System.out.println(max_width_vehicle);
    }
}
