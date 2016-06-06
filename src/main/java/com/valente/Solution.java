package com.valente;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        System.out.println(toMilitary("07:05:45PM"));
        System.out.println(toMilitary("12:00:00AM"));
        System.out.println(toMilitary("12:05:45AM"));
        System.out.println(toMilitary("12:00:00PM"));
        System.out.println(toMilitary("12:05:00PM"));
    }

    private static String toMilitary(String time){
        int hour = Integer.parseInt(time.substring(0,2));
        int minutes = Integer.parseInt(time.substring(3,5));
        int seconds = Integer.parseInt(time.substring(6,8));
        String AM_PM = time.substring(8,10);

        if(AM_PM.equals("AM")) {
            if (hour == 12)
                hour = 0;
        }else
            if(hour != 12)
                hour = hour + 12;
        return String.format("%02d:%02d:%02d", hour, minutes, seconds);
    }
}
