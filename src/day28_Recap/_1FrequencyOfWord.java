package day28_Recap;
//  1. write a program return the frequency of a word from a string

import java.util.Scanner;

public class _1FrequencyOfWord {

    public static void main(String[] args) {
        frequencyOfWords1();
        frequencyOfWords2();
    }

    private static void frequencyOfWords1() {
        String str = "javajava";

        //"java"
        //substring(i, i+4)
        int count = 0;
        for (int i = 0; i <= str.length() - 4; i++) { //i:0 , 1, 2,3, 4
            String s = str.substring(i, i + 4);
            if (s.equalsIgnoreCase("java")) {
                count++;
            }

        }

        System.out.println(count);


    }

    private static void frequencyOfWords2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the sentence: ");
        String str = scan.nextLine();
        System.out.println("Please enter the word: ");
        String word = scan.next();
        int length = word.length();

        int count = 0;
        for (int i = 0; i <= str.length() - length; i++) {
            if (str.substring(i, i + length).equalsIgnoreCase(word)) {
                count++;
            }
        }

        System.out.println(count);

    }

}
