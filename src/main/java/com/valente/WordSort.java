package com.valente;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * Created by flvs on 6/11/16.
 */
public class WordSort {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader i = new FileReader("src/main/resources/teste2.txt");
        Scanner s = new Scanner(i);

        String[] words = s.nextLine().split("\\s");
        int M = s.nextInt();

        final Map<Integer,Integer> countByHotel = new HashMap<Integer, Integer>();

        for (int j = 0; j < M ; j++) {
            int id = s.nextInt();
            s.nextLine();

            Map<String,Integer> wordCountReview = new HashMap<String, Integer>();

            String[] review_words = s.nextLine().split("\\s");
                for (int k = 0; k < review_words.length; k++) {
                    if(wordCountReview.containsKey(review_words[k]))
                        wordCountReview.put(review_words[k],wordCountReview.get(review_words[k]) + 1);
                    else
                    wordCountReview.put(review_words[k],1);
            }

            for (int k = 0; k < words.length; k++) {
                if(wordCountReview.containsKey(words[k]))
                    if(countByHotel.containsKey(id))
                        countByHotel.put(id, countByHotel.get(id) + wordCountReview.get(words[k]));
                    else
                        countByHotel.put(id, wordCountReview.get(words[k]));
            }
        }

        TreeSet<Integer> sortedHotels = new TreeSet<Integer>( new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return countByHotel.get(o2).compareTo(countByHotel.get(o1)) ;
            }
        });

        for (int id : countByHotel.keySet()) {
            sortedHotels.add(id);
        }

        for (int id : sortedHotels) {
            System.out.print(id);
            System.out.print(" ");
        }
    }
}
