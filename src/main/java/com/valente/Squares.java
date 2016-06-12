package com.valente;

import java.io.*;
import java.util.Scanner;

/**
 * Created by flvs on 6/9/16.
 */
public class Squares {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader i = new FileReader("src/teste.txt");
        Scanner s = new Scanner(i);

        int T = s.nextInt();
        for (int j = 0; j < T; j++) {
            int a = s.nextInt();
            int b = s.nextInt();



            int a_s = (int) Math.ceil(Math.sqrt(a));
            int b_s = (int) Math.floor(Math.sqrt(b));
            System.out.println(b_s - a_s + 1);
        }

    }
}
