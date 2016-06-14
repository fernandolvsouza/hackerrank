package com.valente;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by flvs on 6/11/16.
 */
public class Polygon {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader i = new FileReader("src/main/resources/teste.txt");
        Scanner s = new Scanner(i);
        int squares = 0;
        int rect = 0;
        int others = 0;
        while(s.hasNext()){
            int[] polygon = new int[4];
            boolean hasNegative = false;
            for (int j = 0; j < 4; j++) {
                polygon[j] = s.nextInt();
                if(polygon[j] < 1)
                    hasNegative = true;
            }
            if(!hasNegative && isSquare(polygon)){
                squares ++;
                continue;
            }
            if(!hasNegative && isRect(polygon)){
                rect ++;
                continue;
            }
            others++;
        }

        System.out.println( squares + " " + rect + " " + others);
    }

    static boolean isSquare(int[] polygon) {
        return Math.abs(polygon[0]) == Math.abs(polygon[1])
                && Math.abs(polygon[1]) == Math.abs(polygon[2])
                && Math.abs(polygon[2]) == Math.abs(polygon[3]);
    }

    static boolean isRect(int[] polygon) {
        return Math.abs(polygon[0]) == Math.abs(polygon[2])
                && Math.abs(polygon[1]) == Math.abs(polygon[3]);
    }


}
