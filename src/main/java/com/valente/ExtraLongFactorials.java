package com.valente;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by flvs on 6/11/16.
 */
public class ExtraLongFactorials {

    public static void main(String[] args) throws FileNotFoundException {

        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int n = 25;
        System.out.println(solve(n).toString());
    }

    public static BigInteger solve(int n){
        if(n == 1)
            return BigInteger.valueOf(n);
        return BigInteger.valueOf(n).multiply(solve( n-1 ));
    }
}
