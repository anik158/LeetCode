package e_count_words;

import java.util.Arrays;

public class Main_2114 {

    public static int sentence(String[] sen){
        int max = 0;

        for (int i = 0; i < sen.length; i++) {
            String[] words = sen[i].split(" ");

            if (words.length > max) {
                max = words.length;
            }
        }

        return max;
    }


    public static void main(String[] args) {
        String[] sentence = {"Alice and bob love leetcode","I think so too","this is great thanks very much"};
        int res  = sentence(sentence);
        System.out.println(res);

    }
}
