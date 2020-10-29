package day62.warmup;

import java.util.*;

public class WarmUp {
    /*
    1. Write a program that stores the the character and frequency of
    each character from a String in to a Map
    Ex: "aaabbbccb"
    output:
        {a=3, b=4, c=2}
     */
    public static void main(String[] args) {
        frequencyOfChars("aaabbbccb");
    }

    public static void frequencyOfChars(String str){
        String[] arr=str.split("");
        ArrayList<String>letter=new ArrayList<>(Arrays.asList(arr));
        Map<String,Integer> list=new LinkedHashMap<>();
        int i=0;
        for (String each : letter) {
            list.put(each, Collections.frequency(letter,letter.get(i)));
            i++;
        }
        System.out.println(list);

    }
}
