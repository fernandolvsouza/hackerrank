package com.valente;

import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * Created by flvs on 6/11/16.
 */
public class PairSumArray {

    public static void main(String[] args) throws FileNotFoundException {

        int[] arr = new int[100000000];//{1, 5, 9, 67, 20, 48, 63, 51, 7, 4, 6,17};
        for (int i = 0; i < 100000000; i++) {
            Random r = new Random(i);
            arr[i] = r.nextInt(100);
        }
        solve(68,arr);
    }

    private static void solve(int sum, int[] arr) {

        Arrays.sort(arr);

        HashSet<Integer>  numbers = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++)
            numbers.add(arr[i]);

        for (int i = 0; i < arr.length; i++){
            int pair = sum - arr[i];
            if(numbers.contains(pair)) {
                numbers.remove(arr[i]);
                System.out.println(arr[i] + " " + (pair));
            }
        }
    }
}
