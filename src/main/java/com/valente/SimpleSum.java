package com.valente;

/**
 * Created by flvs on 6/11/16.
 */
public class SimpleSum {

    public static void main(String[] args) {

        /*Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
*/
        System.out.println(sum(new int[]{1,2,3,4,5}));

    }

    static int sum(int[] numbers) {

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }


}
