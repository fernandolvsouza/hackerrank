package com.valente;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by flvs on 6/11/16.
 */
public class EncryptGrid {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
        String s = "chillout";//in.next();

        int row = (int) Math.floor(Math.sqrt(s.length()));
        int column = (int) Math.ceil(Math.sqrt(s.length()));

        while(row * column < s.length()) {
            if (row < column)
                row++;
            else
                column++;
        }

        for (int c = 0; c < column; c++) {
            for (int r = 0; r < row ; r++) {
                if(r * column + c < s.length())
                    System.out.print(s.charAt(r * column + c));
            }
            System.out.print(" ");
        }
    }

}
