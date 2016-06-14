package com.valente;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by flvs on 6/14/16.
 */
public class LarrysArray {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f= new FileReader("src/main/resources/larry_input.txt");
        Scanner in = new Scanner(f);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int[] numbers = new int[N];

            for (int j = 0; j < N ; j++) {
                numbers[j] = in.nextInt();
            }
            System.out.println(solve(numbers) ? "YES" : "NO");
        }
    }

    private static boolean solve(int[] numbers) {
        int inversions = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++)
                if(numbers[j] < numbers[i])
                    inversions ++;
        }

        return inversions % 2 == 0;
    }
}
