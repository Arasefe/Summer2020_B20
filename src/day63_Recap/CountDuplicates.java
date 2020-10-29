package day63_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountDuplicates {
    /*
    [ Amazon 1st round question]
    Write a program to identify the frequency of duplicates words in a string.
    Print duplicates words and their frequency.
     */
    public static void main(String[] args) {
        countDuplicates("java is java and wonderful programming language");

    }

    public static void countDuplicates(String str){
        ArrayList<String>list=new ArrayList<>(Arrays.asList(str.split(" ")));

        String uniques="";
        for (int i = 0; i < list.size(); i++) {
            int frequency=Collections.frequency(list,list.get(i));

        }



    }


    public static void countDuplicates2(String str){
        ArrayList<String>words=new ArrayList<>(Arrays.asList(str.split(" ")));

        String uniques="";
        for (String word : words) {
            if(!(uniques.contains(word))){
                int frequency= Collections.frequency(words,word);
                System.out.println(word+":"+frequency);
                uniques+=word+" ";
            }
        }
    }
}
