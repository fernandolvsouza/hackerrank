package com.valente;

import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by flvs on 6/15/16.
 */
public class Pangram {

    static BiFunction<StringBuilder,String,StringBuilder> accumulator =
            (builder,name) -> builder == null ? new StringBuilder(name) : builder.append(name);

    public static void main(String[] args) {

        String string = "Wepromptlyjudgedantiqueivorybucklesforthenextprize";

        long c = string.replaceAll(" ","")
                .toLowerCase()
                .chars()
                .boxed()
                .distinct()
                .sorted().count();

        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        long c2 = line.replaceAll(" ","").toLowerCase()
                .chars()
                .boxed()
                .distinct()
                .sorted().count();

        if(c2 == c) System.out.print("pangram");
        else  System.out.print("not pangram");





    }
}
